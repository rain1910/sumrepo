package com.lian.dao;

import com.lian.domain.Item;
import org.apache.ibatis.annotations.Select;

public interface ItemDao {
   @Select("select * from item where id=#{id}")
    Item findById(int id);
}
