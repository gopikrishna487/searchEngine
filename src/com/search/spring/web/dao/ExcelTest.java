package com.search.spring.web.dao;

import com.search.spring.web.controllers.HomeController;
import com.varra.log.ConsoleLogger;
import com.varra.log.LoggerConstants;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import static com.varra.props.VarraProperties.getPropertyAsGeneric;
import static com.varra.props.VarraProperties.setProperty;
import static com.varra.spring.SpringContext.setConfigFileName;

public class ExcelTest {
	private static Logger logger = Logger.getLogger(ExcelTest.class);

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		logger.info("Starting of the main class............");
		setProperty(LoggerConstants.LOG_CLASS_FQ_NAME,
				ConsoleLogger.class.getName());
		// setConfigFileName("/krishna/varra/workspaces/own/searchEngine/src/com/search/spring/web/config/dao-context.xml");
		setConfigFileName("C:/Users/RAJASEKHAR/workspace/uniKasselSearchEngine/src/com/search/spring/web/config/dao-context.xml");
		// String excelFilePath =
		// "/Users/rareddy/Downloads/titlelist_assia.xls";
		String excelFilePath = "C:/titlelist_assia.xls";
		ASSIAExcelParcer reader = new ASSIAExcelParcer();
		List<TitleListASSIA> listBooks = reader
				.readBooksFromExcelFile(excelFilePath);
		System.out.println(listBooks);
		// logger.info(listBooks);
		final TitleListASSIADAO books = getPropertyAsGeneric("TitleListASSIADAO");
		System.out.println("ExcelTest.main: " + listBooks.get(0));
		books.saveOrUpdate(listBooks.get(0));
		List<TitleListASSIA> ls = books.getTitleListASSIAs();
		System.out.println(ls);

		// Create session Factory Objects and session objects

		/*
		 * SessionFactory sessionFactory = new
		 * AnnotationConfiguration().configure() .buildSessionFactory(); Session
		 * session = sessionFactory.openSession(); session.beginTransaction();
		 * 
		 * //ExcelTest t =new ExcelTest();
		 * 
		 * Query que = session.createQuery("from TitleListASSIA");
		 * List<TitleListASSIA> TitleListASSIA = (List<TitleListASSIA>)
		 * que.list();
		 * 
		 * for (TitleListASSIA x : TitleListASSIA) { System.out.println(x); }
		 * 
		 * System.out.println(TitleListASSIA.size());
		 * 
		 * for (int i = 1; i < 20; i++) { TitleListASSIA books = new
		 * TitleListASSIA(); books.setASSIA(listBooks.get(i).getASSIA());
		 * books.setCountryOfPublication(listBooks.get(i)
		 * .getCountryOfPublication());
		 * books.setISSNElectronic(listBooks.get(i).getISSNElectronic());
		 * books.setISSNPrint(listBooks.get(i).getISSNPrint());
		 * books.setPublisherName(listBooks.get(i).getPublisherName());
		 * books.setSerialTitle(listBooks.get(i).getSerialTitle());
		 * 
		 * session.save(books);
		 * 
		 * }
		 * 
		 * 
		 * // commit and close the transaction
		 * session.getTransaction().commit(); session.close();
		 */

		/*
		 * TitleListASSIA dd = books.getTitleListASSIA("0096-140X");
		 * System.out.println(dd);
		 * 
		 * boolean del = books.delete("0096-140X"); System.out.println(del);
		 */

	}
}
