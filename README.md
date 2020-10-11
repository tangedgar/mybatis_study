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

