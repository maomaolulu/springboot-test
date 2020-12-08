1. Spring Boot 概述

1.1. Spring Boot 是什么

Spring Boot 是一套基于 Spring 框架的微框架。


1.2. Spring Boot 框架出现的背景

由于 Spring 是一个轻量级的企业开发框架， 主要的功能就是用于整合和管理其他框架。
随着整合的框架越来越多， Spring 的整合配置也日益繁琐。 在这个情况下， Spring 团体有了一个
想法： 就是将平时主流使用的到的框架的整合配置预先写好， 然后通过简单的几个参数就可以实
现框架的快速整合。
这个想法催生 Spring boot 框架。
我们将这个实现了各种主流框架与 Spring 的自动整合的框架 Spring boot 称为 Spring 微框架：

1.3. Spring Boot 的作用是什么

就是大大减少了 Spring 与其他框架整合的代码， 也实现了 Spring 开发的 Web 应用的快速部署；
简化Spring应用开发的一个框架；
整个Spring技术栈的一个大整合；
J2EE开发的一站式解决方案；

1.4. Spring Boot 的特点

1.实现了各种主流的框架的快速整合
2.实现了 Spring 的应用的快速部署， 使用 Spring Boot 的 Web 应用可以以 Jar 的方式部署。

1.5. Spring Boot 学习的前提

1.由于 Spring Boot 的最小配置都是基于 SpringMVC 框架的， 所以学习 Spring Boot 先要有 Spring
和 SpringMVC 框架的基础。
2.SpringBoot 默认不支持 JSP 视图， 官方推荐使用 Thymeleaf 或者 Freemarker 模板引擎。 本文档
没有对这两个模板引擎作详细介绍。

Spring Boot 中可以使用 Spring 框架的所有注解。 如果没有学过纯注解 Spring 框架配置， 需要先
学习 Spring 纯注解的配置。
所谓的纯注解： 就是一个 Spring 配置文件都没有的配置。
涉及 Spring 框架的纯注解配置类常用注解如下：
注解名
说明
@Configuration
声明一个配置类， 配置类的功能等同 spring 的配置文件（重点）
@Bean
将没有声明
@Component/@Controller/@Serivce/@Repository 的类加入到 Spring 容器等同于 Spring 配置文件的<bean>标签
@PropertySource
在 Spring 的配置里读取， 增加的这个注解， 可以使用@Value 注解获得 properties 文件的内容
@Value
获得上下文中， Properties 文件的内容等同与 Spring 配置文件的${key}
@ComponentScan
用于扫描类， 创建对象到 Spring 容器中等同 Spring 配置文件<context:component-scan>
@ConditionalOnMissingBean
表示如果 Spring 容器已经有该类的对象就不执行创建对象的方法再创建一次了。
