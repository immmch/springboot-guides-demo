- @MapperScan("com.sample.mapper") mapper接口扫描[必须]
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

- @Repository [必须]