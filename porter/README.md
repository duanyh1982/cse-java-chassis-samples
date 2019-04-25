这个项目帮助开发者学习如何使用CSE开发完整的微服务。 对应的指导文档参考：https://huaweicse.github.io/cse-java-chassis-doc/featured-topics/develop-microservice-using-cse.html

# 子项目介绍

子项目是Porter功能采用不一样的技术栈的实现，他们的业务功能是一样的，只是运行环境有差异，这些差异表现为性能、可以使用的组件等方面。

* porter_lightweight   

最轻量级、运行最高效的方式实现Porter应用。静态页面采用js + html + css直接托管到gateway-service。file-service和user-service均采用轻量级Vert.x HTTP服务。

* porter_springboot2   

gateway-service、file-service和user-service均采用Spring Boot打包运行。其中gateway-service的Web容器依然采用Vert.x HTTP服务， file-service和user-service采用Spring Boot提供的Web容器(Embedded Tomcat)。 


