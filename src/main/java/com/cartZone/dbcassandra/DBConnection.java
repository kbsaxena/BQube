package com.cartZone.dbcassandra;

import com.datastax.driver.core.*;

public class DBConnection 
{

	public static void main(String[] args) {
	    String serverIp = "127.0.0.1";
	    String keyspace = "cartzone";

	    Cluster cluster = Cluster.builder()
	            .addContactPoints(serverIp)
	            .build();

	    Session session = cluster.connect(keyspace);


	    String cqlStatement = "SELECT * FROM usersinfo";
	    for (Row row : session.execute(cqlStatement)) {
	        System.out.println(row.toString());
	    }
	    session.close();
	    cluster.close();
	}
}