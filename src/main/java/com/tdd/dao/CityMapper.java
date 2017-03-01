package com.tdd.dao;

import com.tdd.model.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    City selectByName(String name);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}