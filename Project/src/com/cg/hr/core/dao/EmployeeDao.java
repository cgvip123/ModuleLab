package com.cg.hr.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.exception.EmpException;
import com.cg.hr.util.DBUtil;

public class EmployeeDao implements IEmployeeDao {

	private Connection con;
	public  EmployeeDao() {
		DBUtil util = new DBUtil();
		con = util.getConnect();
	}
	/*@Override
	public Employee addEmp(Employee e) {
		enTrans.begin();
		em.persist(e); //Insert Operation
		enTrans.commit();
		return e;
	}
*/
	@Override
	public ArrayList<Employee> fetchAllEmp() throws EmpException {
		Statement stmt =null;
		ResultSet rs = null;
		
		ArrayList<Employee> emplist = new ArrayList<>();
		try {
			stmt = con.createStatement();
			rs  = stmt.executeQuery("Select emp_id,emp_name,emp_sal from emp1");
			
			while(rs.next())
			{
				int empno = rs.getInt(1);
				String empnm = rs.getString(2);
				float empSal = rs.getFloat(3);
				
				Employee emp = new Employee(empno, empnm, empSal);
				emplist.add(emp);
			}
			return emplist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmpException("Something went wrong");
		}
		finally {
			try {
					if(rs != null)
					{
						rs.close();
					}
					if(stmt != null)
					{
						stmt.close();
					}
			} catch (Exception e2) {
				throw new EmpException("Something chull happen");
			}
		}
	}
	@Override
	protected void finalize() throws Throwable {
		if(con != null)
		{
			con.close();
		}
		super.finalize();
	}

	/*@Override
	public Employee deleteEmp(int empid) {
		Employee e1 = em.find(Employee.class, empid);
		enTrans.begin();
		em.remove(e1);
		enTrans.commit();
		return e1;
	}*/

	@Override
	public Employee getEmpByEid(int empid) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		Employee ee = new Employee();
		try {
			pst = con.prepareStatement("Select emp_id,emp_name,emp_sal from emp1 where emp_id = ?");
			pst.setInt(1, empid);
			rs = pst.executeQuery();
			
			while(rs.next())
			{
				int empno = rs.getInt(1);
				String empnm = rs.getString(2);
				float empSal = rs.getFloat(3);
				ee.setEmpid(empno);
				ee.setEmpName(empnm);
				ee.setEmpSal(empSal);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ee;
	}

	/*@Override
	public Employee updateEmp(int empid, String newName, float newSal) {
		// TODO Auto-generated method stub
		Employee ee = em.find(Employee.class, empid);
		ee.setEmpName(newName);
		ee.setEmpSal(newSal);
		enTrans.begin();
		em.merge(ee);
		enTrans.commit();
		return ee;
	}*/

}
