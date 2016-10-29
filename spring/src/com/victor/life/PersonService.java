package com.victor.life;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PersonService implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean{
	private String name;
	
	public PersonService() {
		System.out.println("调用了该构造方法");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//也可以通过注解的方式来配置init-method
	@PostConstruct
	public void init(){
		System.out.println("我自己的初始化方法");
	}
	@PreDestroy
	public void destory(){
		System.out.println("我自己的销毁方法");
	}
	public void sayHi(){
		System.out.println(this.name);
	}
	//该方法可以表示arg0正在被实例化的bean id
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("这个bean的名称是："+arg0);
	}
	//该方法可以传递一个beanFactory
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("这个factory是"+arg0.toString());
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("这个ApplicationContext是"+arg0);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("调用afterPropertiesSet");
	}
}
