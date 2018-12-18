package com.gyy.dao;

import com.gyy.domain.Items;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    Items findById(Integer id);
}
