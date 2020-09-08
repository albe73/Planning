package com.recrea.restapi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.sql.DataSource;

import com.recrea.restapi.model.Planning;



@Stateless
public class PlanningDAO {

	
	//@PersistenceUnit(unitName = "planning")
//	EntityManagerFactory emf;
//	
	@PersistenceContext(unitName = "planning")
    EntityManager em;
	
	@Resource(name = "java/MYDS")
    private DataSource dataSource;
 
	

    public List<Planning> getAll() {
    	
//    	  EntityManagerFactory emf =
//    			     Persistence.createEntityManagerFactory(
//    			          "planning");
//    	em = emf.createEntityManager();
    	System.out.println("DataSource "+ dataSource.toString());
    	
    	try {
    		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://172.16.10.6:3306/plgatslink", "alberto",
				"alb.300dke");
            //Connection conn = dataSource.getConnection("alberto", "alb.300dke"); //dataSource.getConnection(username, password)
            //conn.setSchema("plgatslink");
            System.out.println("Schema "+conn.getSchema());
 
            Statement statement = conn.createStatement();
            String sql = "select count(*) from planning";
            ResultSet rs = statement.executeQuery(sql);
 
            int count = 1;
 
            while (rs.next()) {
//                System.out.println(String.format("Planning #%d: %-15s %s", count++,
//                        rs.getString("id"), rs.getString("oggetto")));
            	 System.out.println(String.format(rs.getString(1)));
 
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    	
    	
    	System.out.println("EntityManager " + em.isOpen()+ " " +em.toString()); 
    	return (List<Planning>) em.createNativeQuery("SELECT * FROM planning").getResultList();
        //return em.createNamedQuery("Planning.findAll", Planning.class).getResultList();
        //return em.createQuery("SELECT * FROM plgatslink.planning", Planning.class).getResultList();
		
    }

    public Planning findById(Long id) {
//    	EntityManagerFactory emf =
//			     Persistence.createEntityManagerFactory(
//			          "planning");
//    	em = emf.createEntityManager();
        return em.find(Planning.class, id);
    	//return null;
    }

//    public void update(Planning planning) {
//        em.merge(planning);
//    }
//    
//    public void update(Planning planning, String desc) {
//    	planning.setDescrizione("Messaggio nuovo");
//        em.merge(planning);
//    }

    public void create(Planning planning) {
        em.persist(planning);
    }

    public void delete(Planning planning) {
        if (!em.contains(planning)) {
        	planning = em.merge(planning);
        }

        em.remove(planning);
    }
}
