package com.gyy.test;

import com.gyy.dao.ItemsDao;
import com.gyy.domain.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
    @Test
    public void testFindById(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ItemsDao itemsDao = applicationContext.getBean(ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items);
    }
}
