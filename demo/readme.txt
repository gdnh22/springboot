2019-5-6 11:23:49
����һ���չ���
JDK1.8

����MAVEN
ָ�������ļ�
��ѡ���Զ����롿

new maven module����һ��
com.hydata

��������
�ٶ�������installing spring Boot
https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.example</groupId>
	<artifactId>myproject</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<!-- Inherit defaults from Spring Boot ���ƴ����ݵ�pom-->
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.4.RELEASE</version>
	</parent>

	<!-- Add typical dependencies for a web application -- ���ƴ����ݵ�pom>
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

��дPOM����������XML����

src/main/java��create new class��
Name=com.hydata.controller.HelloController

�ٷ���һ��ʵ��
https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html#getting-started-first-application-pom




��������
ע��@������

@controller
���ð����ƣ���̨������ز����









��������JAR��������TOMCAT