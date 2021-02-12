# my2020app

#CREATE TABLE USERS
CREATE TABLE `hb_student_tracker`.`users` (
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `hb_student_tracker`.`users`
 VALUES
 ('susmitha','{noop}test123',1),
 ('tom','{noop}test123',1),
 ('christo','{noop}test123',1);


 #CREATE TABLE authorities
CREATE TABLE `hb_student_tracker`.`authorities` (
  `username` VARCHAR(50) NOT NULL,
  `authority` VARCHAR(50) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities_ibfk_1`
  foreign key (`username`)
  REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `hb_student_tracker`.`authorities`
 VALUES
 ('susmitha','ROLE_EMPLOYEE'),
 ('tom','ROLE_EMPLOYEE'),
 ('tom','ROLE_MANAGER'),
 ('christo','ROLE_ADMIN'),
 ('christo','ROLE_EMPLOYEE');
