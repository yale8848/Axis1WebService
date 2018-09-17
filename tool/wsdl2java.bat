set CURRENT_DIR=%cd%
set Axis_Lib=%CURRENT_DIR%\axis1.4\axis\WEB-INF\lib
set Java_Cmd=Java -Djava.ext.dirs=%Axis_Lib%  
set Axis_wsdl=hello.wsdl
%Java_Cmd% org.apache.axis.wsdl.WSDL2Java -u http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl -s -S true