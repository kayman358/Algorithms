/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbiTest;

import org.skife.jdbi.v2.DBI;
import test.JdbiHelper;

import test.MyDAO;

/**
 *
 * @author Kolade Arowolo
 */
public class TestDBI {
    public static void main(String[] args) {
        MyDAO dao = null;
        try{
        dao = JdbiHelper.getDBI().open(MyDAO.class);

       // dao.createSomethingTable();

        dao.insert(4, "John Doe");
        dao.update("Joe Martins", 2);
        String name = dao.findNameById(2);
        
        System.out.println("name is "+name);
//assertThat(name, equalTo("Aaron"));

dao.close();
        }catch(Exception ex){
            ex.getMessage();
        }
    }

}
