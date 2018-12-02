package model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;

import config.DbConfig;
import model.entity.Product;

public class ProductDAO {

	private DbConfig db;
	private Session sess;
	private Transaction ts;
	
	public ProductDAO()
	{
		db = new DbConfig();
		sess = db.getSess();
	}
	
	public boolean insertProduct(Product p)
	{
		boolean b = true;
		try
		{
			ts = sess.beginTransaction();
			sess.save(p);
			ts.commit();
			
		}catch(Exception ex)
		{
			ts.rollback();
			b = false;
			ex.printStackTrace();
		}
		return b;
	}
	public boolean updateProduct(Product p)
	{
		boolean b = true;
		try 
		{
			sess.beginTransaction();
			sess.update(p);
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
	
	
	public List<Product> getProducts()
	{
		List<Product> lp = null;
		try 
		{
			sess.beginTransaction();
			Query<Product> q = sess.createQuery("from Product",Product.class);
			q.getResultList(q);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lp;
	}
	
	//Delete QUery 
	
	public boolean deleteProduct(p)
	{
		boolean b = true;
		try 
		{
			sess.beginTransaction();
			sess.delete(p);
			sess.getTransaction().commit();
		}
		catch(Exception e)
		{
			sess.getTransaction().rollback();
			b = false;
		}
		return b;
	}

}
