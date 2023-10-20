package com.sud.spring_hibernate_integration_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sud.spring_hibernate_integration_xml.dao.StudentDao;
import com.sud.spring_hibernate_integration_xml.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		String bb[] = ctx.getBeanDefinitionNames();
		for(String b : bb) {
			System.out.println(b);
		}
		
		StudentDao dao = ctx.getBean("sdao", StudentDao.class);
		
		Student st = new Student();
		st.setName("shiv");
		st.setEmail("sudarshan@gmail.com");
		st.setMobile("9098878990");
		
		dao.saveStudent(st);
		
    }
}
