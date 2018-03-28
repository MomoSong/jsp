package com.webjjang.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webjjang.board.dto.BoardDTO;
import com.webjjang.util.DBUtil;

public class BoardDAO {

	public List<BoardDTO> list() {
		// TODO Auto-generated method stub
		System.out.println("BoardDAO.list()");
		// 넘겨줄 데이터 객체를 선언만 한다.
		List<BoardDTO> list = null;
		// 사용한 객체 선언 : 연결, 처리문, 결과
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//1. 드라이버 확인, 2. 연결
			con = DBUtil.getConnection();
			//3. sql 작성
			String sql = "select no, title, writer, "
					+ " to_char(writedate, 'yyyy-mm-dd') writedate"
					+ " , hit from board "
					+ " order by no desc ";
			//4. 처리문 객체
			pstmt = con.prepareStatement(sql);
			//5. 실행
			rs = pstmt.executeQuery();
			//6. 표시 - 여러개의 데이터이므로 while
			while (rs.next()) {
				// list가 null이면 생성
				if(list == null) list= new ArrayList<>();
				BoardDTO boardDTO = new BoardDTO
						(rs.getInt("no"),
						rs.getString("title"),
						rs.getString("writer"),
						rs.getString("writedate"),
						rs.getInt("hit"));
				list.add(boardDTO);
			} // end of while
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				//7.닫기
				DBUtil.close(con, pstmt, rs);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} // end of try~catch~finally
		System.out.println(list);
		return list;
	}

}
