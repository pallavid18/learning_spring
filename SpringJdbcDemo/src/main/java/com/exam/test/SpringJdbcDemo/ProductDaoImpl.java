package com.exam.test.SpringJdbcDemo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ProductDaoImpl implements ProductDataAccess {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(Product p) {
		String sql = "INSERT INTO Product(pname, pprice, pquality) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, p.getPname(), p.getPprice(), p.getPquality());
		System.out.println("Product Inserted");

	}

	@Override
	public List<Product> findAll() {
		String sql = "SELECT * FROM Product";

		return jdbcTemplate.query(sql, new RowMapper<Product>() {
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p = new Product();
				p.setId(rs.getInt("pid"));
				p.setPname(rs.getString("pname"));
				p.setPprice(rs.getDouble("pprice"));
				p.setPquality(rs.getString("pquality"));
				return p;
			}
		});
	}

	@Override
	public void delete(int pid) {
		String sql = "DELETE FROM Product WHERE pid=?";
		jdbcTemplate.update(sql, pid);
		System.out.println("Product Deleted");

	}

}
