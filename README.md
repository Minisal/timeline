后端Springboot
前端 vue
后端测试 Jacoco
前端测试 vue test:unit

配置数据库
sudo mysql -u root -p 
create database db_timeline;
Create user ‘springuser’@‘%’ identified by ‘PASSWORD’;
Grant all on db_timeline.* to ‘springuser’@‘%’;

导入timeline.sql文件
source path\timeline.sql

mysql> show global variables like ‘port';
确定port为3306
否则修改配置文件
/Library/LaunchDaemons/com.oracle.oss.mysql.mysqld.plist
将：–port=3307
改为：–port=3306

启动前端
Vue ui 
导入项目
启动
