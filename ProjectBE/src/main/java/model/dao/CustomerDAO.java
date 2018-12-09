package model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.DbConfig;
import model.entity.Customer;

public class CustomerDAO {

	private DbConfig db;
	private Session sess;
	private Transaction ts;
	
	public CustomerDAO()
	{
		db = new DbConfig();
		sess = db.getSess();
	}
	
	public boolean insertCustomer(Customer c)
	{
		boolean b = true;
		try
		{
			ts = sess.beginTransaction();
			sess.save(c);
			ts.commit();
			
		}catch(Exception ex)
		{
			ts.rollback();
			b = false;
			ex.printStackTrace();
		}
		return b;
	}
	public boolean updateProduct(Customer c)
	{
		boolean b = true;
		try 
		{
			sess.beginTransaction();
			sess.update(c);
			sess.getTransaction().commit();
		}
		catch(Exception e)
		{
			sess.getTransaction().rollback();
			b = false;
		}
		return b;
	}
	
	//Select Query
	
	
	/*public List<Customer> getProducts()
	{
		List<Customer> lp = null;
		try 
		{
			sess.beginTransaction();
			Query<Customer> q = sess.createQuery("from Customer",Customer.class);
			q.getResultList(q);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lp;
	}
	*/
	//Delete QUery 
	
	/*public boolean deleteCustomer(c)
	{
		boolean b = true;
		try 
		{
			sess.beginTransaction();
			sess.delete(c);
			sess.getTransaction().commit();
		}
		catch(Exception e)
		{
			sess.getTransaction().rollback();
			b = false;
		}
		return b;
	}*/

}
