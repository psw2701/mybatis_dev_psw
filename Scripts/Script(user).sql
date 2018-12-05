show tables;

select * from courses;


select stud_id, name, email, phone, dob from students where stud_id=1;

select stud_id, name, email, phone, dob from students where stud_id=1;

select stud_id, name, email, phone, dob from students;

select addr_id as addrid, street, state, zip, country from addresses where addr_id=1;


select tutor_id, name as tutor_name, email, addr_id from tutors where tutor_id=1;

select t.tutor_id, t.name as tutor_name, email, a.addr_id, street, city, state, zip,
country, course_id, c.name, description, start_date, end_date
from tutors t left join addresses a on t.addr_id=a.addr_id
left join courses c on t.tutor_id=c.tutor_id
where t.tutor_id=1;