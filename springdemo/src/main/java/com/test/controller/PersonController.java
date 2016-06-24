package com.test.controller;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.dao.PersonDAO;
import com.test.dao.PersonDTO;
import com.test.model.Person;

@Controller
public class PersonController {
	
	private static Logger logger = LoggerFactory.getLogger(PersonController.class); 
	
	@Autowired
	private PersonValidator personValidator; 
	
	@Autowired
	private PersonDAO personDAO;
	
	@Autowired
	private DozerBeanMapper dozerMapper;
	
	@RequestMapping(method=RequestMethod.GET,value="/addPerson")
	public ModelAndView addPerson(){
		logger.debug(">>>>>>>>>>>>>>>>>>>>> HERE");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addPerson");
		Person person = new Person();
		modelAndView.addObject("person", person);
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/savePerson")
	public ModelAndView savePerson(Person person,Errors errors){ //@RequestParam("deviceID") String id
		logger.debug(">>>>>>>>>>>>>>>>>>>>> HERE" + person);
		ModelAndView modelAndView = new ModelAndView();
		personValidator.validate(person, errors);
		if(errors.hasErrors()){
			modelAndView.setViewName("addPerson");
			modelAndView.addObject("person", person);
		}else{
			//JDBC //JPA
			//DozerBeanMapper beanMapper = new DozerBeanMapper();
			PersonDTO dto = dozerMapper.map(person, PersonDTO.class);
			personDAO.save(dto);
			modelAndView.setViewName("success");
			modelAndView.addObject("message", person.getPno() + " Person Added in DB.");
		}
		return modelAndView;
	}
	
}
