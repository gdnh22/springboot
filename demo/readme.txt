2019-5-6 11:23:49
启动一个空工程
JDK1.8

设置MAVEN
指定配置文件
勾选【自动导入】

new maven module，下一步
com.hydata

导入依赖
百度搜索：installing spring Boot
https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.example</groupId>
	<artifactId>myproject</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<!-- Inherit defaults from Spring Boot 复制此内容到pom-->
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.4.RELEASE</version>
	</parent>

	<!-- Add typical dependencies for a web application -- 复制此内容到pom-->
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
	</dependencies>

	<!-- Package as an executable jar -->
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>

改写POM，复制两个XML配置

src/main/java，create new class，
Name=com.hydata.controller.HelloController

官方第一个实例
https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html#getting-started-first-application-pom




代码区：
注解@？？？

@controller
配置阿里云，后台下载相关插件。
  <mirrors>
    <!-- mirror
     | Specifies a repository mirror site to use instead of a given repository. The repository that
     | this mirror serves has an ID that matches the mirrorOf element of this mirror. IDs are used
     | for inheritance and direct lookup purposes, and must be unique across the set of mirrors.
     |     -->
    <mirror>
      <id>mirrorId</id>
      <mirrorOf>repositoryId</mirrorOf>
      <name>Human Readable Name for this Mirror.</name>
	  <url>http://maven.aliyun.com/nexus/content/groups/public</url>
      <!--<url>http://my.repository.com/repo/path</url>  -->
    </mirror>
  </mirrors>

运行localhost:8080可以看到执行结果。



最终生成JAR包，内置TOMCAT
POM添加

11.5 Creating an Executable Jar
<!-- 该插件用于jar包-->
<build>
	<plugins>
		<plugin>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-maven-plugin</artifactId>
		</plugin>
	</plugins>
</build>

Maven窗口，Lifecycle，双击package
左边project窗口，target->ideal1-helloworld-1.0-SNAPSHOT.jar拷贝D:\
控制台 java -jar ideal1-helloworld-1.0-SNAPSHOT.jar，启动jar包。

注：默认情况下springboot只会扫描主程序类所在的包及子包。
java下的包，所以main函数必须在java目录下，否则访问会出错。



