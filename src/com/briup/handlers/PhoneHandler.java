package com.briup.handlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.briup.pojo.PhoneNumber;

//自定义的类型处理器
//泛型参数定义该类型处理器处理的自定义类型是谁
public class PhoneHandler 
			extends BaseTypeHandler<PhoneNumber>{
	@Override
	public PhoneNumber getNullableResult(
			ResultSet rs, String name)
			throws SQLException {
			//100-101-110
		return new PhoneNumber(rs.getString(name));
	}
	@Override
	public PhoneNumber getNullableResult(
			ResultSet rs, int index)
			throws SQLException {
		return new PhoneNumber(rs.getString(index));
	}
	@Override
	public PhoneNumber getNullableResult(
			CallableStatement arg0, int arg1)
			throws SQLException {
		return null;
	}

	//用来告诉mybatis遇到phoneNumber的数据类型之后，
	//PreparedStatement如何处理该类型，应该调用setXxx
	@Override
	public void setNonNullParameter(
			PreparedStatement pst, int index,
			PhoneNumber phone, JdbcType arg3) throws SQLException {
		//101-001-119
		pst.setString(index,
				phone.getAsString());
	}
}






