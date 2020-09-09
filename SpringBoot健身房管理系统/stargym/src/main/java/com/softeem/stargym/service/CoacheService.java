package com.softeem.stargym.service;

import com.softeem.stargym.entity.Coaches;
import com.softeem.stargym.mapper.CoachesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("coachesService")
public class CoacheService {
    @Resource
    CoachesMapper mapper;

    public List<Coaches> getAllCoaches() {
        return mapper.selectAllCoaches();
    }

    public Coaches getCoaches(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    public void updateCoaches(Coaches coaches) {
        mapper.updateByPrimaryKeySelective(coaches);
    }


    public void addCoaches(Coaches coaches) {
        mapper.insertSelective(coaches);
    }

    public void deleteCoaches(int id) {
        mapper.deleteByPrimaryKey(id);
    }

    public List<Coaches> selectCoachesByName(String name) {
        return mapper.selectCoachesByName(name);
    }
}
