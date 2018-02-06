/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Kolade Arowolo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.DriverManager;
import java.sql.SQLException;
import org.skife.jdbi.v2.DBI;


public class JdbiHelper {

    /**
     *
     */
    public JdbiHelper() {

    }

    private static DBI dbi = null;

    /**
     *
     * @return dbi instance
     */
    public final static DBI getDBI() {
        try {
            if (JdbiHelper.dbi == null) {
                DriverManager.registerDriver(new org.postgresql.Driver());
                JdbiHelper.dbi = new DBI("jdbc:postgresql://"
                        + "localhost:5432/bss",
                        "postgres", "admin");
            }

        } catch (SQLException e) {
        }

        return JdbiHelper.dbi;
    }
}
