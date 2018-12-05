package kr.or.yi.mybatis_dev_psw.dao;

import kr.or.yi.mybatis_dev_psw.dto.UserPic;

public interface UserPicMapper {
	int insertUserPic(UserPic userPic);
	UserPic getUserPic(int id);
}
