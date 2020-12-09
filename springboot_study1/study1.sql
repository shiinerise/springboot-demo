USE springboot_study;
drop table if exists `user`;
CREATE TABLE IF NOT EXISTS `user` (
	`uid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;