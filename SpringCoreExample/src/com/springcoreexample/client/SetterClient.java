package com.springcoreexample.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.springcoreexample.beans.ConstructorInjExp;
import com.springcoreexample.beans.InterfaceInjectionExample;
import com.springcoreexample.beans.SetterInjectionBean;

public class SetterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileSystemResource res = new FileSystemResource("spring-config.xml");
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("spring-config.xml");
		XmlBeanFactory fac = new XmlBeanFactory(res);
		Object obj = fac.getBean("strVal");
		SetterInjectionBean setBean = (SetterInjectionBean)obj;
		setBean.test();
		
		ConstructorInjExp exp = (ConstructorInjExp)fac.getBean("consInj");
		exp.test2();
		
/*		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("spring-config.xml");
		Object obj = ctx.getBean("intInj");
		InterfaceInjectionExample setBean = (InterfaceInjectionExample)obj;
		setBean.test();
		System.out.println("***** About to close application context container*****");
		ctx.close();*/
	} 

}
