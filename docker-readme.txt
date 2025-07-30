- Install docker

- Download the MySQL image from docker hub website. 

- Command used from website: docker pull mysql:latest

- Run the image in cmd
Note : Docker desktop application should be running, for the docker engine to be running during the pull.
Note : C:\Users\User_name cmd location

- Once pull is completed host the docker image.

- docker run -e MYSQL_ROOT_PASSWORD=test -p 3306:3306 -d mysql:latest
	-e - make an environmental variable and make it available in container
	- MYSQL_ROOT_PASSWORD=test - root password for the root user
	-p port mapping
	3306:3306 - (Host)Spring application's DB port and containers DB port.
	-d specifies its a daemon container. Docker doesnt wait for the application to end, it just starts it.
	mysql:latest image name
	
- docker ps
	Lists all the active running containers
	
- docker kill 649d49f4daa7  (run only when necessary)
	Kills the container
	
- docker exec -it 649d49f4daa7 bash
	Command request for a bash, -it means interactive terminal
	
- bash-5.1# mysql -u root -p
	Bash interactive terminal opens log into mysql server.
	Password is test which we declared while running the image. (line 13)
	
- SQL commands used : 
	create database test;
	use test;
	create table user_entity( id int(6) unsigned auto_increment primary key, first_name varchar(30) not null, last_name varchar(30) not null, membership_id integer, creation_time varchar(100) not null);
	select * from user_entity;
		Empty set (0.011 sec)