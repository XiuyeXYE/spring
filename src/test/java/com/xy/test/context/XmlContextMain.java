package com.xy.test.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiuye.util.log.LogUtil;
import com.xy.test.bean.A;

public class XmlContextMain {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:");
		A a = ac.getBean("a",A.class);
		LogUtil.log("a=",a);
	}

}
