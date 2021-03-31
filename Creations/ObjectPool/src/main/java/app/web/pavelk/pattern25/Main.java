package app.web.pavelk.pattern25;

import java.sql.Connection;

public class Main {
    public static void main(String args[]) {
        // Do something...

        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb:mem:PUBLIC;sql.syntax_pgs=true",
                "sa", "");

        // Get a connection:
        Connection con = pool.checkOut();
        System.out.println(pool.getLocked());

        // Return the connection:
        pool.checkIn(con);
        System.out.println(pool.getUnlocked());
    }
}