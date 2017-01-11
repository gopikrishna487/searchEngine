package com.search.spring.web.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * @author RAJASEKHAR
 *<h2>TitleListASSIA</h2>
 *
 *<ol>persist into the database</ol>
 */

@Entity
public class TitleListASSIA {
	@Column
	@Id
	private String serialTitle;
	@Column
	private String ISSNPrint;
	
	private String ISSNElectronic;
	private String publisherName;
	private String countryOfPublication;
	private String ASSIA;
	public String getSerialTitle() {
		return serialTitle;
	}
	public void setSerialTitle(String serialTitle) {
		this.serialTitle = serialTitle;
	}
	public String getISSNPrint() {
		return ISSNPrint;
	}
	public void setISSNPrint(String iSSNPrint) {
		ISSNPrint = iSSNPrint;
	}
	public String getISSNElectronic() {
		return ISSNElectronic;
	}
	public void setISSNElectronic(String iSSNElectronic) {
		ISSNElectronic = iSSNElectronic;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getCountryOfPublication() {
		return countryOfPublication;
	}
	public void setCountryOfPublication(String countryOfPublication) {
		this.countryOfPublication = countryOfPublication;
	}
	public String getASSIA() {
		return ASSIA;
	}
	public void setASSIA(String aSSIA) {
		ASSIA = aSSIA;
	}
	@Override
	public String toString() {
		return "TitleListASSIA [serialTitle=" + serialTitle + ", ISSNPrint="
				+ ISSNPrint + ", ISSNElectronic=" + ISSNElectronic
				+ ", publisherName=" + publisherName
				+ ", countryOfPublication=" + countryOfPublication + ", ASSIA="
				+ ASSIA + "]";
	}

}
