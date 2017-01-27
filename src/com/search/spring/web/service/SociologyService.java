package com.search.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.search.spring.web.dao.Sociology;
import com.search.spring.web.dao.SociologyDao;
@Component
public class SociologyService {

	@Autowired
	private SociologyDao SociologyDao;

	public SociologyDao getSociologyDao() {
		return SociologyDao;
	}

	public void setSociologyDao(SociologyDao sociologyDao) {
		SociologyDao = sociologyDao;
	}

	public List<Sociology> getSociologys(){
		
		return SociologyDao.getSociologys();
	}
}
