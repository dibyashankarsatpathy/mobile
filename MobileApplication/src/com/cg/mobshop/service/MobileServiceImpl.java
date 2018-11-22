package com.cg.mobshop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mobshop.dao.MobileDao;
import com.cg.mobshop.dto.Mobiles;


@Service("service")
@Transactional
public class MobileServiceImpl implements MobileService {
	@Autowired
	MobileDao dao;
	@Override
	public List<Mobiles> getAllMobiles() {
		// TODO Auto-generated method stub
		return dao.getAllMobiles();
	}
	
	
	

}
