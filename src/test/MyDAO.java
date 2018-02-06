/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import org.skife.jdbi.v2.sqlobject.binders.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

/**
 *
 * @author Kolade Arowolo
 */
public interface MyDAO {
    @SqlUpdate("create table something (id int primary key, name varchar(100))")
  void createSomethingTable();

  @SqlUpdate("insert into something (id, name) values (:id, :name)")
  void insert(@Bind("id") int id, @Bind("name") String name);

  @SqlQuery("select name from something where id = :id")
  String findNameById(@Bind("id") int id);
  
  @SqlQuery("SELECT id from something where id = :id")
     long findIfExists(@Bind("id") long id);
     
  @SqlUpdate("Update something SET name = :name WHERE id = :id")
    void update (@Bind ("name") String name,
            @Bind ("id") int id);

  /**
   * close with no args is used to close the connection
   */
  void close();
}
