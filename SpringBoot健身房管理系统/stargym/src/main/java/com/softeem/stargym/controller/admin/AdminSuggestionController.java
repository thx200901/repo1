package com.softeem.stargym.controller.admin;

import com.softeem.stargym.entity.Suggestion;
import com.softeem.stargym.service.SuggestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminSuggestionController {
    @Resource(name="suggestionService")
    SuggestionService suggestionService;

    @RequestMapping("toSuggestion.hm")
    public String toSuggestion(Model model){
        List<Suggestion> suggestion = suggestionService.getAllSuggestion();
        model.addAttribute("allSuggestion",suggestion);
        return "admin/suggestion";
    }

    @RequestMapping("suggestionadd.hm")
    public String suggestionadd(){
        return "admin/suggestionadd";
    }

    @RequestMapping("updateSuggestion.hm")
    public String updateSuggestion(Suggestion suggestion){
        suggestionService.updateSuggestion(suggestion);
        return "redirect:toSuggestion.hm";
    }

    @RequestMapping("addSuggestion.hm")
    public String addSuggestion(Suggestion suggestion){
        suggestionService.addSuggestion(suggestion);
        return "redirect:toSuggestion.hm";
    }

    @RequestMapping("deleteSuggestion.hm")
    public String deleteSuggestion(int id){
        suggestionService.deleteSuggestion(id);
        return "redirect:toSuggestion.hm";
    }

    @RequestMapping("selectSuggestion")
    public String selectSuggestion(String name,Model model){
        List<Suggestion> suggestion = suggestionService.selectSuggestionByName(name);
        model.addAttribute("AllSuggestion",suggestion);
        return  "admin/suggestion";
    }
}
