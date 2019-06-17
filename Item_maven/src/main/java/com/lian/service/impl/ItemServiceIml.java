package com.lian.service.impl;

import com.lian.dao.ItemDao;
import com.lian.domain.Item;
import com.lian.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceIml implements ItemService {
    @Autowired
    private ItemDao itemDao;

    @Override
    public Item findById(int id) {
        return itemDao.findById(id);
    }
}