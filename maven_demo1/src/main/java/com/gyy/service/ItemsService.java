package com.gyy.service;

import com.gyy.domain.Items;

public interface ItemsService {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    Items findById(Integer id);
}
