package com.shiva.spring.search.test.controller.Spring_test1;

import java.io.IOException;
import java.util.List;

public class ExcelTest {
	public static void main(String[] args) throws IOException {
		String excelFilePath = "C:/Books.xlsx";
		ReadingBeanFromExcel reader = new ReadingBeanFromExcel();
		List<Book> listBooks = reader.readBooksFromExcelFile(excelFilePath);
		System.out.println(listBooks);
	}
}
