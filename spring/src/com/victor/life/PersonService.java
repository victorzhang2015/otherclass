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
		System.out.println("�����˸ù��췽��");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//Ҳ����ͨ��ע��ķ�ʽ������init-method
	@PostConstruct
	public void init(){
		System.out.println("���Լ��ĳ�ʼ������");
	}
	@PreDestroy
	public void destory(){
		System.out.println("���Լ������ٷ���");
	}
	public void sayHi(){
		System.out.println(this.name);
	}
	//�÷������Ա�ʾarg0���ڱ�ʵ������bean id
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("���bean�������ǣ�"+arg0);
	}
	//�÷������Դ���һ��beanFactory
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("���factory��"+arg0.toString());
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("���ApplicationContext��"+arg0);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����afterPropertiesSet");
	}
}
