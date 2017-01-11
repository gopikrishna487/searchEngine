package com.search.spring.web.dao;

import java.io.IOException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class ExcelTest {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		String excelFilePath = "C:/titlelist_assia.xls";
		ASSIAExcelParcer reader = new ASSIAExcelParcer();
		List<TitleListASSIA> listBooks = reader
				.readBooksFromExcelFile(excelFilePath);
		System.out.println(listBooks);
		
		TitleListASSIADAO books = new TitleListASSIADAO();
		List<TitleListASSIA> ls = books.getTitleListASSIAs();
		System.out.println(ls.size());

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
