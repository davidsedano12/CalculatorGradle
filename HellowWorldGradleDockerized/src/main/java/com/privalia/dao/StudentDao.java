package com.privalia.dao;


import java.io.IOException;

import com.privalia.model.Student;
import java.util.Properties;
import java.io.FileInputStream;


public class StudentDao implements iDao<Student>{

	@Override
	public Student add(Student model) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	static Properties prop= null;
	static FileInputStream input=null;
	
	static{
		prop = new Properties();
		try{
			input=new FileInputStream("src/main/resources/config.properties");
			prop.load(input);
		}catch (IOException e){
			throw new ExceptionInInitializerError(e);
		}
	}
}
