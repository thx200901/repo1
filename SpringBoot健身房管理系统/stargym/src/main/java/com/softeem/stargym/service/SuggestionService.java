package com.softeem.stargym.service;

import com.softeem.stargym.entity.Suggestion;
import com.softeem.stargym.mapper.SuggestionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("suggestionService")
public class SuggestionService {
    @Resource
    SuggestionMapper mapper;
    public List<Suggestion> getAllSuggestion(){
        return mapper.selectAllSuggestion();
    }

    public Suggestion getSuggestion(int id){
        return mapper.selectByPrimaryKey(id);
    }

    public void updateSuggestion(Suggestion suggestion){
        mapper.updateByPrimaryKeySelective(suggestion);
    }

    public void addSuggestion(Suggestion suggestion){
        mapper.insertSelective(suggestion);
    }

    public void deleteSuggestion(int id){
        mapper.deleteByPrimaryKey(id);
    }

    public List<Suggestion> selectSuggestionByName(String name){
        return mapper.selectSuggestionByName(name);
    }

}
