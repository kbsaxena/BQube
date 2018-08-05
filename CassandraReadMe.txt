Go to website https://academy.datastax.com/planet-cassandra//cassandra/
Download   MSI Installer (64-bit) of v2.1.15
Install it.
Can see the UI for cassandra on http://localhost:8888/opscenter/index.html
you can see the records in this ui.

Go to run>datastax>cqlshell
Command prompt window will be open

1. Create a keyspace, In cassandra we create a key space instead of database. As data is a key value pair inside it.

> create keyspace cartzone with replication = {'class' : 'SimpleStrategy', 'replication_factor' : 3};

2. use created keyspace
>  use cartzone;

3. Create table/column family, in cassandra we call table as column family
> create table usersinfo(id uuid, name varchar, phone varchar, email varchar, PRIMARY KEY(id,email));

Here uuid in cassandra is a universal id for the records. We get the value for uuid using different cassandra functions.

4. 	can check the schema with 'select * from usersinfo', you will get following output

 id | email | name | phone
----+-------+------+-------

5. Add data to the table 
> cqlsh:cartzone> create table usersinfo(id uuid, name varchar, phone varchar, email varchar, PRIMARY KEY(id,email));
> cqlsh:cartzone> insert into usersinfo(id,name,phone,email) values(now(),'Raj','9876787654', 'raj@gmail.com');
> cqlsh:cartzone> insert into usersinfo(id,name,phone,email) values(now(),'Ram','9876787563', 'ram@gmail.com');
> cqlsh:cartzone> insert into usersinfo(id,name,phone,email) values(now(),'Rani','9876887563', 'rani@gmail.com');
> cqlsh:cartzone> insert into usersinfo(id,name,phone,email) values(now(),'Raju','9832845563', 'raju@gmail.com');
> cqlsh:cartzone> insert into usersinfo(id,name,phone,email) values(now(),'Venkat','9867855589', 'venkat@gmail.com');
> cqlsh:cartzone> insert into usersinfo(id,name,phone,email) values(now(),'Ramesh','9567857889', 'ramesh@yahoo.com');
> cqlsh:cartzone> insert into usersinfo(id,name,phone,email) values(now(),'gautham','9717856753', 'gautham@yahoo.co.in');
> cqlsh:cartzone> insert into usersinfo(id,name,phone,email) values(now(),'mani','9786457823', 'manikant@yahoo.co.in');

now() function is giving current time stamp as id.

6. select * from usersinfo;
id                                   | email                | name    | phone
--------------------------------------+----------------------+---------+------------
 855cd1b0-97ce-11e8-80b4-bb71d7d53b2c |  gautham@yahoo.co.in | gautham | 9717856753
 736b9e50-97ce-11e8-80b4-bb71d7d53b2c |     ramesh@yahoo.com |  Ramesh | 9567857889
 66148c80-97ce-11e8-80b4-bb71d7d53b2c |     venkat@gmail.com |  Venkat | 9867855589
 3f802520-97ce-11e8-80b4-bb71d7d53b2c |        raj@gmail.com |     Raj | 9876787654
 5ad38970-97ce-11e8-80b4-bb71d7d53b2c |       raju@gmail.com |    Raju | 9832845563
 958a3500-97ce-11e8-80b4-bb71d7d53b2c | manikant@yahoo.co.in |    mani | 9786457823
 484d1af0-97ce-11e8-80b4-bb71d7d53b2c |        ram@gmail.com |     Ram | 9876787563
 9a07a6d0-97ce-11e8-80b4-bb71d7d53b2c | manikant@yahoo.co.in |    mani | 9786457823
 513c8ce0-97ce-11e8-80b4-bb71d7d53b2c |       rani@gmail.com |    Rani | 9876887563




 
 















