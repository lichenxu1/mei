package com.bw.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.bean.Botany;
import com.bw.bean.Type;
import com.bw.service.MyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


//名字命名不能和关键字一样
@Controller
public class MyController {

	@Resource
	private MyService service;
	
	
	@RequestMapping("list.do")
	public String list(Model model,
			@RequestParam(defaultValue="")String name,
			@RequestParam(defaultValue="1")int cpage){
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("name",name);
		
		PageHelper.startPage(cpage,3);
		
		List<Map<String, Object>> list = service.list(map);
		PageInfo<Map<String, Object>> page = new PageInfo<>(list);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("map", map);
		return "list";
		
	}
	
	//删除
	@RequestMapping("delete.do")
	public Object delete(String did){
		
		service.delete(did);//进行删除中间表
		service.deletes(did);//进行删除电影表
		
		return "redirect:list.do";
	}
	//进行回显下拉框
	@RequestMapping
	public Object xia(Model model){
		
		List<Type> xia = service.xia();
		model.addAttribute("xia", xia);
		return "add";
	}
	//进行添加
	@RequestMapping("add.do")
	public Object add(Botany botany){
		
		service.add(botany);
		return "redirect:list.do";
	}
	
	//进行回显
	@RequestMapping("show.do")
	public Object show(int id,Model model){
		
		Botany show = service.show(id);
		List<Type> xia = service.xia();
		model.addAttribute("xia", xia);
		model.addAttribute("show", show);
		
		return "update";
		
	}
	//进行修改
	@RequestMapping("update.do")
	public Object update(Botany botany){
		
		service.update(botany);
		return "redirect:list.do";
		
		
	}
}
