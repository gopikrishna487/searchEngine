package com.search.spring.web.test.tests;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.search.spring.web.dao.TitleListASSIA;
import com.search.spring.web.dao.TitleListASSIADAO;

@ActiveProfiles("dev")
@ContextConfiguration(locations = {
		"classpath:com/search/spring/web/config/dao-context.xml",
		//"classpath:com/search/spring/web/config/security-context.xml",
		"classpath:com/search/spring/web/test/config/datasource.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class OfferDaoTests {
	
	private static Logger logger = Logger.getLogger(OfferDaoTests.class);
	
	@Autowired
	private TitleListASSIADAO TitleListASSIADao;
	
	
	/*@Before
	public void init() {
		JdbcTemplate jdbc = new JdbcTemplate(dataSource);

		jdbc.execute("delete from offers");
		jdbc.execute("delete from users");
	}*/
	
	@Test
	public void testGetTitleListASSIAs() {
		List<TitleListASSIA> listOfTitles= TitleListASSIADao.getTitleListASSIAs();
		logger.info(listOfTitles);
	}
	
		

}
