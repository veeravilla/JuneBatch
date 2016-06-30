package com.test.jaxb;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.test.xproject.Address;
import com.test.xproject.Person;
import com.test.xproject.PersonRequest;

public class XMLTest {

	public static void main(String[] args) throws Exception {
		Person person = new Person();
		person.setPid(789);
		person.setPname("Jhon");
		person.setAddress(new Address("Plymoth", "MN", "55447"));
		PersonRequest request = new PersonRequest();
		request.setPerson(person);
		
		Gson gson = new Gson();
		String jsonData = gson.toJson(request);
		
		System.out.println("Json Data" + jsonData);
		
		
		JAXBContext jc = JAXBContext.newInstance("com.test.xproject");
		Marshaller marshaller = jc.createMarshaller();
		marshaller.marshal(request,System.out);
		
		String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><PersonRequest xmlns=\"http://www.test.com/xproject\"><person><pid>789</pid><pname>Jhon</pname><address><city>Plymoth</city><state>MN</state><zipcode>55447</zipcode></address></person></PersonRequest>";
		
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		PersonRequest request1 = (PersonRequest)unmarshaller.unmarshal(new StringReader(xmlData));
		
		System.out.println(request1.toString());
		
	}

}
