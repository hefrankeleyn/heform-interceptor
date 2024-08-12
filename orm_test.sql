create table if not exists orm_test.`user`(
 `id` int(11) not null auto_increment,
 `name` varchar(32) not null,
 `age`  int(11) not null,
 primary key (id),
 constraint user_name_index unique (name)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
