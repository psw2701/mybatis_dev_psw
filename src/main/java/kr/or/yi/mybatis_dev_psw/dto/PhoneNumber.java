package kr.or.yi.mybatis_dev_psw.dto;

import org.apache.ibatis.type.Alias;

@Alias("PhoneNumber")
public class PhoneNumber {
	private String countryCode;
	private String stateCode;
	private String number;
	
	public PhoneNumber() {
		// TODO Auto-generated constructor stub
	}

	public PhoneNumber(String countryCode, String stateCode, String number) {
		this.countryCode = countryCode;
		this.stateCode = stateCode;
		this.number = number;
	}
	
	
	/**
	 * @param str "000-0000-0000"
	 *
	 */
	public PhoneNumber(String str) {
		if(str !=null) {
			String[] parts = str.split("-");
			if(parts.length > 0) this.countryCode = parts[0];
			if(parts.length > 1) this.stateCode = parts[1];
			if(parts.length > 2) this.number = parts[2];
		}
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("%s-%s-%s", countryCode, stateCode, number);
	}
	
	
	
}
