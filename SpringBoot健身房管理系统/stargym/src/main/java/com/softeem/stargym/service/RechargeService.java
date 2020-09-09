package com.softeem.stargym.service;

import com.softeem.stargym.entity.Recharge;
import com.softeem.stargym.mapper.RechargeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("rechargeService")
public class RechargeService {
    @Resource
    RechargeMapper mapper;

    public List<Recharge> getAllRecharge(){
        return mapper.selectAllRecharge();
    }

    public Recharge getRecharge(int id){
        return mapper.selectByPrimaryKey(id);
    }

    public void updateRecharge(Recharge recharge){
        mapper.updateByPrimaryKeySelective(recharge);
    }

    public void addRecharge(Recharge recharge){
        mapper.insertSelective(recharge);
    }

    public void deleteRecharge(int id){
        mapper.deleteByPrimaryKey(id);
    }

    public List<Recharge> selectRechargeByName(String name){
        return mapper.selectRechargeByName(name);
    }

}
