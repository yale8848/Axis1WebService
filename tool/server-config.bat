rem 注意修改端口
set Axis_Lib=%CURRENT_DIR%\axis1.4\axis\WEB-INF\lib
set Java_Cmd=Java -Djava.ext.dirs=%Axis_Lib%
java -Djava.ext.dirs=%Java_Cmd% org.apache.axis.client.AdminClient -lhttp://localhost:8080/services/AdminService deploy.wsdd