# mybatis学习

## 数据库准备

```sql
-- 查看数据库
SHOW DATABASES;

-- 创建数据库
CREATE DATABASE mybatis_study

-- 创建数据表
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `pwd` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

-- 插入数据
insert into user(id, name, pwd)
values (1, '张三', '123456'),
       (2, '李四', '123457'),
       (3, '王五', '123458');
```

## 创建存储过程

```plsql
-- 插入数据
CREATE PROCEDURE adduser(OUT code int,
                         OUT info varchar(30) character set utf8,
                         IN userid int,
                         IN username varchar(30) character set utf8,
                         IN password varchar(30) character set utf8)
label:BEGIN
    DECLARE count int DEFAULT 0;
    set code = 1;
    set info = '成功';
    select count(*) into count from user where id=userid;
    IF count > 0 THEN
        set code = -1;
        set info = '输入ID已经存在';
        LEAVE label; # 退出存储过程
    ELSEIF username = '' or password = '' THEN
        set code = -1;
        set info = '用户名或密码不能为空';
        LEAVE label; # 退出存储过程
    end if;
    INSERT INTO user(id, name, pwd) values (userid, username, password);
END;

-- 删除数据
create procedure deleteuser(OUT code int,
                            OUT info varchar(30) character set utf8,
                            IN userid int)
label:BEGIN
    Declare max_id INT;
    set code = 1;
    set info = '成功';
    select max(id) into max_id from user;
    IF userid = '' or userid < 1 THEN
        set code = -1;
        set info = '输入的userid错误';
        LEAVE label; # 退出存储过程
    elseif userid > max_id THEN
        set code = -1;
        set info = '输入的userid超过最大值';
        LEAVE label; # 退出存储过程
    end if;
    delete from user where id=userid;
END;

-- 修改数据
CREATE PROCEDURE updateuser(OUT code int,
                            OUT info varchar(30) character set utf8,
                            IN userid int,
                            IN username varchar(30) character set utf8,
                            IN password varchar(30) character set utf8)
label:BEGIN
    Declare max_id INT;
    set code = 1;
    set info = '成功';
    select max(id) into max_id from user;
    IF userid = '' or userid < 1 THEN
        set code = -1;
        set info = '输入的userid错误';
        LEAVE label; # 退出存储过程
    elseif userid > max_id THEN
        set code = -1;
        set info = '输入的userid超过最大值';
        LEAVE label; # 退出存储过程
    end if;
    update user set name = username,pwd=password where id=userid;
END;

-- 查询数据
CREATE PROCEDURE queryuser(OUT code int,
                            OUT info varchar(30) character set utf8,
                            IN userid int)
label:BEGIN
    Declare max_id INT;
    set code = 1;
    set info = '成功';
    select max(id) into max_id from user;
    IF userid < 0 THEN
        set code = -1;
        set info = '输入的userid错误';
        LEAVE label; # 退出存储过程
    elseif userid > max_id THEN
        set code = -1;
        set info = '输入的userid超过最大值';
        LEAVE label; # 退出存储过程
    elseif userid = 0 THEN
        select id,name,pwd from user;
    else
        select id,name,pwd from user where id = userid;
    end if;
END;
```

