package com.gyy.service.impl;

import com.gyy.dao.ItemsDao;
import com.gyy.domain.Items;
import com.gyy.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
