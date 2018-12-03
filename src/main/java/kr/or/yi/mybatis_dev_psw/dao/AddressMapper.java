package kr.or.yi.mybatis_dev_psw.dao;

import org.apache.ibatis.annotations.Select;

import kr.or.yi.mybatis_dev_psw.dto.Address;

public interface AddressMapper {
	@Select("select addr_id as addrid, street, state, zip, country from addresses where addr_id=#{id}")
	Address selectAddressById(int id);
}
