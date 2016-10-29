package com.victor.life;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class myBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		String time =sdf.format(new Date());
		
		try {
			 PrintWriter  pw = new PrintWriter(new File("d:\\test.txt"));
			 pw.println("��bean���õ�ʱ��Ϊ"+time);
    		 pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		}
		System.out.println("���õ�ʱ��Ϊ"+time);
		return arg0;
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("���ú���postProcessAfterInitialization");
		return arg0;
	}

}
