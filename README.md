## Axis1 通过wsdl文件生成服务器端代码并部署

> 最近对接联通VAC，对方给了个文档和WSDL文件，目的要通过WSDL约束生成服务器端框架；通过几天折腾，找到一种解决方案是通过Axis1框架；
> 由于联通提供WSDL版本旧(2009)，尝试过Axis2,Apache CXF,Spring WS,都不能满足需求；

## 以 http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl 获取手机号信息的wsdl为例子 

## 生成过程

- 先将tool\asix1.4\asix\WEB-INF拷贝到新建web项目的WEB-INF
- cd tool
- wsdl2java.bat 生成服务器端源码，以及deploy.wsdd，undeploy.wsdd
- 将源码拷贝到项目java目录下，注意包括包名同时拷贝
- 配置web项目，启动项目
- 将deploy.wsdd，undeploy.wsdd 拷贝到tool目录下
- cd tool
- server-config.bat 在out(根据项目而定)目录生成server-config.wsdd，拷贝server-config.wsdd至项目WEB-INF中
- 启动项目

## webservice信息

- http://localhost:8080/services  列出所有服务，点击某一个看详情

## 客户端调用例子： https://github.com/yale8848/Axis1WebServiceClient
