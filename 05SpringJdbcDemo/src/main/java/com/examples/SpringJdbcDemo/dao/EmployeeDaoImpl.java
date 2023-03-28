package com.examples.SpringJdbcDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.SpringJdbcDemo.entity.Employee;
import com.examples.SpringJdbcDemo.rowmapper.EmployeeRowMapper;

@Component("employeedao")
public class EmployeeDaoImpl implements EmployeeDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Employee employee) {
	
		String sql="insert into employee values(?,?,?)";
    	
    	int result=jdbcTemplate.update(sql,employee.getId(),employee.getFirstname(),employee.getLastname());
    	
    	System.out.print("Data inserted Successfully"+result);
    	
		return result;
	}
	@Override
	public int update(Employee employee) {
			
		String sql="update employee set firstname=?,lastname=? where id=?";
    	
    	int result=jdbcTemplate.update(sql,employee.getFirstname(),employee.getLastname(),employee.getId());
    	
    	System.out.print("Update Successfully"+result);
    	
		return result;
	}
	@Override
	public int delete(int id) {

		String sql="delete from employee where id=?";
    	
    	int result=jdbcTemplate.update(sql,id);
    	
    	System.out.print("Date  deleted "+result);
    	
		return result;
	}
	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		String sql="select * from employee where id=?";
		EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sql, employeeRowMapper,id);
		return employee;
	}
	@Override
	public List<Employee> read() {
		// TODO Auto-generated method stub
		String sql="select * from employee";
		EmployeeRowMapper employeeRowMapper=new EmployeeRowMapper();
		List<Employee> employees=jdbcTemplate.query(sql, employeeRowMapper);
		return employees;
	}

}
