package com.search.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.search.spring.web.dao.TitleListASSIA;
import com.search.spring.web.dao.TitleListASSIADAO;

@Component
public class TitleListASSIAService {
	@Autowired
	private TitleListASSIADAO TitleListASSIADao;

	public TitleListASSIADAO getTitleListASSIADao() {
		return TitleListASSIADao;
	}

	public void setTitleListASSIADao(TitleListASSIADAO titleListASSIADao) {
		TitleListASSIADao = titleListASSIADao;
	}

	public List<TitleListASSIA> getTitleListASSIAs(){
		
		return TitleListASSIADao.getTitleListASSIAs();
	}
}
