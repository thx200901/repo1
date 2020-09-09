package com.softeem.stargym.service;

import com.softeem.stargym.entity.Advert;
import com.softeem.stargym.mapper.AdvertMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("advertService")
public class AdvertService {

    @Resource
    AdvertMapper mapper;


    public List<Advert> getAllAdvert(){
        return mapper.selectAllAdvert();
    }

    public Advert getAdvert(int id){
        return mapper.selectByPrimaryKey(id);
    }

    public void updateAdvert(Advert advert){
        mapper.updateByPrimaryKeySelective(advert);
    }

    public void addAdvert(Advert advert){
        mapper.insertSelective(advert);
    }

    public void deleteAdvert(int id){
        mapper.deleteByPrimaryKey(id);
    }

    public List<Advert> selectAdvertByName(String name){
        return mapper.selectAdvertByName(name);
    }


}
