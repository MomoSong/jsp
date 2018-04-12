package com.webjjang.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.webjjang.member.dto.MemberDTO;
import com.webjjang.util.DBUtil;

/*
 * 회원관리 DB 처리
 * */
public class MemberDAO {
	
	//id를 가지고 회원 정보를 불러오는 메서드 - id중복체크
	public MemberDTO selectById(String id) throws SQLException{
		System.out.println("MemberDAO.selectById()");
		// 결과를 저장해서 리턴하는 객체
		MemberDTO memberDTO = null;
		
		// 사용할 객체를 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//1.확인, 2.연결
			con = DBUtil.getConnection();
			//3. sql작성
			String sql = "SELECT memberid, name, password, regdate "
					+ " FROM member where memberid = ?";
			//4. 처리객체
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			//5. 실행
			rs = pstmt.executeQuery();
			
			//6. 표시 -> jsp: 데이터를 담아서 넘긴다. //regdate는 Date타입
			if(rs.next()) { //데이터가 있는경우. 반환값이 boolean이다.
				memberDTO = new MemberDTO(rs.getString("memberid"),
										rs.getString("name"),
										rs.getString("password"),
										rs.getDate("regdate")	);
			}
			
			
		}catch (Exception e) {
			throw new SQLException("회원 정보를 불러오는 중 DB오류");
		}finally {
			DBUtil.close(con, pstmt, rs);
		}
		//처리된 결과를 리턴한다. 
		return memberDTO;
	}
	
	//회원 가입 메서드
	public void insert(MemberDTO memberDTO) throws SQLException{
		System.out.println("MemberDAO.insert()");
		
		// 사용할 객체를 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//1.확인, 2.연결
			con = DBUtil.getConnection();
			//3. sql작성
			String sql = "INSERT INTO member(memberid, name, password) "
					+ " values(?, ?, ?)";
			//4. 처리객체
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberDTO.getId());
			pstmt.setString(2, memberDTO.getName());
			pstmt.setString(3, memberDTO.getPassword());
			
			pstmt.executeUpdate();
					
		}catch (Exception e) {
			throw new SQLException("회원 정보를 불러오는 중 DB오류");
		}finally {
			DBUtil.close(con, pstmt);
		}
	}
	
}
