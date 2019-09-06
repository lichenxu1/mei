package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.Botany;
import com.bw.bean.Type;

public interface MyService {
	
	
	//查询列表
	List<Map<String, Object>>list(Map<String, Object>map);
	//首先进行删除中间表数据
	void delete(String did);
	//进行删除另一个表的数据
	void deletes(String did);
	//进行回显下拉
	List<Type> xia();
	//进行添加
	void add(Botany botany);
	//进行回显
	Botany show(int id);
	//进行修改
	void update(Botany botany);
}
