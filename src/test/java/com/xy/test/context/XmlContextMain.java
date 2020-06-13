package com.xy.test.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiuye.util.log.XLog;
import com.xy.test.bean.A;

public class XmlContextMain {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		A a = ac.getBean("a",A.class);
		XLog.log("a=",a);
	}

}
