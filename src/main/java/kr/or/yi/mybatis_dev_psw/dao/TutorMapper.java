package kr.or.yi.mybatis_dev_psw.dao;

import kr.or.yi.mybatis_dev_psw.dto.Tutor;

public interface TutorMapper {
	Tutor selectTutorById(int tutorId);
	Tutor selectTutorByTutorId(Tutor tutor);
}
