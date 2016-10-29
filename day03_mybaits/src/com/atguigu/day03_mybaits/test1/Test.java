package com.atguigu.day03_mybaits.test1;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.atguigu.day03_mybaits.bean.User;
import com.atguigu.day03_mybaits.util.MybatisUtils;

/*
 * mybatis蹇�鍏ラ棬
 */
public class Test {

	public static void main(String[] args) throws IOException {
		SqlSession session = MybatisUtils.getFactory().openSession();
		String statement = "com.atguigu.day03_mybaits.test1.userMapper.getUser";
		User user = session.selectOne(statement, 2);
		session.close();
		System.out.println(user);
	}
}
