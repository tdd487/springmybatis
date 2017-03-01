package com.tdd.service.impl;

import com.tdd.dao.CityMapper;
import com.tdd.model.City;
import com.tdd.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/1.
 */
@Service
public class CityServiceImpl implements CityService{
    private CityMapper cityMapper;

    public City selectByName(String name){
        return cityMapper.selectByName(name);
    }

    public CityMapper getCityMapper() {
        return cityMapper;
    }

    @Autowired
    public void setCityMapper(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }


}
