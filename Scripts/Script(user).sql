show tables;

select * from courses;

select stud_id as studid, name, email, dob, phone
from students
where stud_id=1;

select stud_id as studid, name, email, dob, phone from students;


Select stud_id, name, email, phone, a.addr_id, street, city, zip, country
from students s left outer join addresses a on	s.addr_id=a.addr_id;

Select stud_id, name, email, phone, a.addr_id, street,   city, zip, country   from students s left outer join addresses a on   s.addr_id=a.addr_id           WHERE stud_id=1;

select t.tutor_id, t.name as tutor_name, email, c.course_id, c.name, description, start_date, end_date
from tutors t left outer join addresses a on t.ADDR_ID=a.ADDR_ID
left outer join courses c on t.tutor_id=c.tutor_id;


alter table students add gender tinyint unsigned;


create table user_pics(
	id integer auto_increment primary key,
	name varcharacter(50),
	pic longblob,
	bio longtext
);

desc user_pics;

select * from students;


		select course_id, name, description, start_date, end_date from courses
