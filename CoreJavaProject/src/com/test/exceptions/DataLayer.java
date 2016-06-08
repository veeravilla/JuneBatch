package com.test.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataLayer {
	
	public int getEmployeeNumber(String name) throws DataException{
		System.out.println(" Name  : " + name);
		
		//B.L
		try{
			FileInputStream inStream = new FileInputStream("sample.txt");
			inStream.read();
			Class.forName("test.car");
			
			int a[] = {4,5};
			System.out.println(a[20]); // Unchecked Exp 
		}catch(FileNotFoundException fe){
			buildDataException("D1000", "Fail Error !!!!");
		}catch(IOException  | ClassNotFoundException fe){
			buildDataException("D1099", "Fail to Read/Load the File");
		}catch(ArrayIndexOutOfBoundsException ae){
			buildDataException("D1999", "Fail to Read Array Values");
		}finally{
			System.out.println(" Always !!!!!!!!!!!!!!!!!!!");
		}
		
		return 7898; 
	}

	private void buildDataException(String errCode,String errMsg) throws DataException {
		DataException de = new DataException(errCode,errMsg);
		throw de;
	}

}
