package com.atguigu.day03_mybaits.test4;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atguigu.day03_mybaits.bean.Order;
import com.atguigu.day03_mybaits.util.MybatisUtils;

/*
 * 娴嬭瘯:銆�В鍐冲瓧娈靛悕涓庡疄浣撶被灞炴�鍚嶄笉鐩稿悓鐨勫啿绐�
 */
public class Test4 {

	public static void main(String[] args) {
		SqlSessionFactory factory = MybatisUtils.getFactory();
		SqlSession session = factory.openSession();
		
		String statement = "com.atguigu.day03_mybaits.test4.orderMapper.getOrder";
		statement = "com.atguigu.day03_mybaits.test4.orderMapper.getOrder2";
		Order order = session.selectOne(statement , 2);
		System.out.println(order);
	}
}
