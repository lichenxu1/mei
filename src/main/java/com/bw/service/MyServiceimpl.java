package com.bw.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Botany;
import com.bw.bean.Type;
import com.bw.dao.MyDao;
@Service
public class MyServiceimpl implements MyService {

	@Autowired
	private MyDao dao;
	@Override
	public List<Map<String, Object>> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.list(map);
	}

	@Override
	public List<Type> xia() {
		// TODO Auto-generated method stub
		return dao.xia();
	}
	@Override
	public void add(Botany botany) {
		// TODO Auto-generated method stub
		dao.add(botany);
	}
	@Override
	public Botany show(int id) {
		// TODO Auto-generated method stub
		return dao.show(id);
	}
	@Override
	public void update(Botany botany) {
		// TODO Auto-generated method stub
		dao.update(botany);
	}

	@Override
	public void delete(String did) {
		// TODO Auto-generated method stub
		dao.delete(did);
	}

	@Override
	public void deletes(String did) {
		// TODO Auto-generated method stub
		dao.deletes(did);
	}






}
