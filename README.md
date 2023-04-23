# 电商商城项目

作者：MrZGY \
日期：2023年4月22日

准备工作以及各个软件的版本\
MySQL:8.0.32\
Java:17\
IDEA:IntelliJ IDEA 2023.1\
Git:2.40.0

###### 步骤一
在GitHub/gitee中创建一个仓库,例如：“gmall”。
![1.jpg](png%2F1.jpg)
在IDEA的welcome to IntelliJ IDEA页面点击“get from VCS”\
进入到“Get from Version Control”该页面\
在左侧项目栏中点击“Repository URL”根据图片依次点击
![2.png](png%2F2.png)
![3.png](png%2F3.png)
###### 如果出现模块、包以及文件夹的小图标错乱和文件标黄的情况，那就是没有识别到项目
###### 按照图片点击，可以解决（我就是如此）
![4.png](png%2F4.png)
![5.png](png%2F5.png)
###### 步骤二
添加一个管理模块“gmall-user-manage”按照图片依次点击输入
![6.png](png%2F6.png)
![7.jpg](png%2F7.jpg)
![8.jpg](png%2F8.jpg)
最后点击创建“Create”即可生成该模块
###### 步骤三
配置pom.xml文件\
pom.xml文件是Maven项目的核心文件之一，其中定义了项目的元数据，依赖关系，构建配置和其他信息。、
这次在pom.xml文件里添加一个通用mapper 4.2.0\
![9.jpg](png%2F9.jpg)
下面提供该通用mapper配置代码

```xml
<dependency>
    <groupId>tk.mybatis</groupId>
    <artifactId>mapper-spring-boot-starter</artifactId>
    <version>4.2.0</version>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```
jj

###### 步骤四


###### 步骤五


###### 步骤六



###### 步骤七