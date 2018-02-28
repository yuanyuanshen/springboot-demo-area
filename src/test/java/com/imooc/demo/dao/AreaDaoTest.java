package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() throws Exception {
        List<Area> list = areaDao.queryArea();
        assertEquals(3,list.size());
        for (Area area:list
             ) {
            System.out.println(area.getAreaName());
        }
    }

    @Test
    public void queryAreaById() throws Exception {
        Area area = areaDao.queryAreaById(2);
        System.out.println(area.getAreaName());
    }

    @Test
    public void insertArea() throws Exception {
        Area area1 = new Area();
        area1.setAreaName("西苑");
        area1.setPriority(5);
        int priority = areaDao.insertArea(area1);
        System.out.println(priority);
    }

    @Test
    public void updateArea() throws Exception {
        Area area1 = new Area();
        area1.setAreaId(12);
        area1.setPriority(8);
        int effectNum = areaDao.updateArea(area1);
        System.out.println(effectNum);
    }

    @Test
    public void deleteArea() throws Exception {
        int effectNum = areaDao.deleteArea(2);
        System.out.println(effectNum);
    }

}