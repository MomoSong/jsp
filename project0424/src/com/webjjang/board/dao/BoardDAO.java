package com.webjjang.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webjjang.board.dto.BoardDTO;
import com.webjjang.util.DBUtil;

public class BoardDAO {
	public List<BoardDTO> list(Integer page) throws Exception {
		List<BoardDTO> list = null;
		// 필요한 객체
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnection();
			String sql = "select no, title, writer, writedate, hit from board "
					+ " order by no desc";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				if(list == null) list = new ArrayList<>();
				list.add(
						new BoardDTO(rs.getInt("no"), 
								rs.getString("title"),
								null,
								rs.getString("writer"), 
								rs.getDate("writedate"), 
								rs.getInt("hit"))
						);
				
			}
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("DB오류");
		}finally{
			DBUtil.close(con, pstmt, rs);
		}
	}
}
