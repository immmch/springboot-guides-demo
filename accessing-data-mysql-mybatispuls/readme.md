- 都不需要添加 `@Repository`, 报红是因为IDEA 验证问题; 如果要去掉红色波浪线, 在Mapper 接口类上加 `@Repository`
- pom.xml 相关配置 [必须] 不然无法读取mapper.xml文件,会出现:`Invalid bound statement (not found)` 错误!

```xml
<build>
        <!-- 如果不添加此节点mybatis的mapper.xml文件都会被漏掉。 -->
        <resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>false</filtering>
            </resource>
            <!--        <resource>-->
            <!--            <directory>src/main/resources</directory>-->
            <!--            <includes>-->
            <!--                <include>**/*.properties</include>-->
            <!--                <include>**/*.xml</include>-->
            <!--            </includes>-->
            <!--            <filtering>false</filtering>-->
            <!--        </resource>-->
        </resources>
    </build>
```



# sql 语句

```sql
-- sql 语句
DROP TABLE IF EXISTS user;

CREATE TABLE user
(
	id BIGINT(20) NOT NULL COMMENT '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
	PRIMARY KEY (id)
);

DELETE FROM user;

INSERT INTO user (id, name, age, email) VALUES
(1, 'Jone', 18, 'test1@baomidou.com'),
(2, 'Jack', 20, 'test2@baomidou.com'),
(3, 'Tom', 28, 'test3@baomidou.com'),
(4, 'Sandy', 21, 'test4@baomidou.com'),
(5, 'Billie', 24, 'test5@baomidou.com');

```