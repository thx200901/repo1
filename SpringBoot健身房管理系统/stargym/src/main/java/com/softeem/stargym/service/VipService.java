package com.softeem.stargym.service;

import com.softeem.stargym.entity.Vip;
import com.softeem.stargym.mapper.VipMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("vipService")
public class VipService {
    @Resource
    VipMapper mapper;

    public List<Vip> getAllVip() {
        return mapper.selectAllVip();
    }

    public Vip getVip(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    public void updateVip(Vip vip) {
        mapper.updateByPrimaryKeySelective(vip);
    }


    public void addVip(Vip vip) {
        mapper.insertSelective(vip);
    }

    public void deleteVip(int id) {
        mapper.deleteByPrimaryKey(id);
    }

    public List<Vip> selectVipByName(String name) {
        return mapper.selectVipByName(name);
    }
}
