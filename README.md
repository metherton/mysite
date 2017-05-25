# mysite

set up docker commands

mysql
docker run --name ons-mysql  -v /data/db/ons:/var/lib/mysql  -e MYSQL_ROOT_PASSWORD=?????? -e MYSQL_DATABASE=ethertons -e MYSQL_USER=ons_user -e MYSQL_PASSWORD=?????? -d mysql:5.6
docker run -p 8080:8080 —name ons-app -e ‘spring.datasource.url=jdbc:mysql://mysql:3306/ethertons’ -e ‘security.user.password=??????’ -e ‘spring.datasource.username=ons_user’ -e ‘spring.datasource.password=??????’ —link ons-mysql:mysql -d metherton/mysite
