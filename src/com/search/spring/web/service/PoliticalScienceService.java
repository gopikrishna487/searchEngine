package com.search.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.search.spring.web.dao.PoliticalScience;
import com.search.spring.web.dao.PoliticalScienceDao;

@Component
public class PoliticalScienceService {

	@Autowired
	private PoliticalScienceDao PoliticalScienceDao;

	public PoliticalScienceDao getPoliticalScienceDao() {
		return PoliticalScienceDao;
	}

	public void setPoliticalScienceDao(PoliticalScienceDao politicalScienceDao) {
		PoliticalScienceDao = politicalScienceDao;
	}

	public List<PoliticalScience> getSociologys() {

		return PoliticalScienceDao.getPoliticalSciences();
	}

}
