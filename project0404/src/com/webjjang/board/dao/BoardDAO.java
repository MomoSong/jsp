package com.webjjang.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.webjjang.board.dto.BoardDTO;
import com.webjjang.util.DBUtil;

public class BoardDAO {

	// 오라클에 접속할 때 필요한 정보들
	// 드라이버는 오라클사에서 제공한다 -> 찾아서 인식시켜야한다 : ojbdc6.jar
	;
	// 글리스트를 가져오는 메서드
	public List<BoardDTO> list() {
		// System.out.println("BoardDAO.list");
		List<BoardDTO> list = null;
		// RDBMS에서 데이터를 가져오는 프로그램 작성 할것

		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 처리문
		ResultSet rs = null; // 결과

		try {
			// 1. 드라이버확인
			// 2. 연결
			
			con = DBUtil.getConnection();

			// 3. sql
			String sql = "SELECT no, title, writer, writedate," + " hit FROM board ORDER BY no DESC";

			// 4. 처리문 객체
			pstmt = con.prepareStatement(sql);

			// 5. 실행
			rs = pstmt.executeQuery();

			// 6. 표시 -> 데이터 담기
			while (rs.next()) {
				// 데이터가 있는데 list가 null이면 생성해서 담는다
				if (list == null) {
					list = new ArrayList<>();
				}
				// 데이터 하나를 담을 수 있는 BoardDTO 객체를 생성한다.
				BoardDTO boardDTO = new BoardDTO();
				// 데이터를 rs에서 꺼내서 BoardDTO에 담는다.
				boardDTO.setNo(rs.getInt("no"));
				boardDTO.setTitle(rs.getString("title"));
				boardDTO.setWriter(rs.getString("writer"));
				boardDTO.setWriteDate(rs.getString("writedate"));
				boardDTO.setHit(rs.getInt("hit"));

				// list에 boardDTO를 담는다.
				list.add(boardDTO);
			}

		} catch (Exception e) {
			System.out.println("객체를 가져오는 중 오류 발생");
			e.printStackTrace();
		} finally {
			try {
				DBUtil.close(con, pstmt, rs);
			} catch (Exception e) {
				System.out.println("객체를 닫는 중 오류 발생");
				e.printStackTrace();
			}
		}

		return list;
	}

	// 글번호에 맞는 글보기 데이터를 가져오는 메서드
	public BoardDTO view(int no) {
		// System.out.println("BoardDAO.view() - " + no);
		BoardDTO boardDTO = null;
		//사용할 객체를 선언
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 처리문
		ResultSet rs = null; // 결과
		
		// 오라클에서 데이터를 가져와서 채우는 프로그램 작성 할것
		try {
			//1. 드라이버 확인 //2. 연결
			con = DBUtil.getConnection();
			//3. sql 작성
			String sql = "SELECT no, title, content, writer, writedate,"
							+ " hit FROM board WHERE no = ?"; //변하는 데이터 대신 물음표 ? 사용

			//4. 처리문 객체
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no); //첫 번째 ?에 no를 int로 셋팅
			
			//5. 실행
			rs = pstmt.executeQuery();
			
			//6. 표시
			if(rs.next()) {
				boardDTO = new BoardDTO(rs.getInt("no"), 
						rs.getString("title"), 
						rs.getString("content"), 
						rs.getString("writer"), 
						rs.getString("writedate"),
						rs.getInt("hit"));
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtil.close(con, pstmt, rs);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

		return boardDTO;
	}
	
	//조회수를 1 증가시키는 메서드 -> 글번호를 받아서 글번호에 맞는 조회수 증가
	public void increase(int no) {
		// System.out.println("BoardDAO.view() - " + no);
		//사용할 객체를 선언
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 처리문
		
		// 오라클에서 데이터를 가져와서 채우는 프로그램 작성 할것
		try {
			//1. 드라이버 확인 //2. 연결
			con = DBUtil.getConnection();
			
			//3. sql 작성
			String sql = "UPDATE board set hit = hit + 1 where no = ?";

			//4. 처리문 객체
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no); //첫 번째 ?에 no를 int로 셋팅
			
			//5. 실행 : UPDATE
			//select 인 경우는 executeQuery() 실행
			//그외 경우는 excuteUpdate() 실행
			pstmt.executeUpdate();
			
			//6. 표시 -> 오류가 없으면 정상처리
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtil.close(con, pstmt);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//게시판 글쓰기 처리
	public void write(BoardDTO boardDTO) {
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 처리문
		
		// 오라클에서 데이터를 가져와서 채우는 프로그램 작성 할것
		try {
			//1. 드라이버 확인 //2. 연결
			con = DBUtil.getConnection();
			
			//3. sql 작성
			String sql = "INSERT INTO board(no, title, content, writer) "
					+ " values(board_seq.nextval, ?, ?, ?)";

			//4. 처리문 객체
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardDTO.getTitle()); 
			pstmt.setString(2, boardDTO.getContent()); 
			pstmt.setString(3, boardDTO.getWriter()); 
			
			//5. 실행 : UPDATE
			//select 인 경우는 executeQuery() 실행
			//그외 경우는 excuteUpdate() 실행
			pstmt.executeUpdate();
			
			//6. 표시 -> 오류가 없으면 정상처리
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtil.close(con, pstmt);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void update(BoardDTO boardDTO) {
		// System.out.println("BoardDAO.view() - " + no);
		//사용할 객체를 선언
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 처리문
		
		// 오라클에서 데이터를 가져와서 채우는 프로그램 작성 할것
		try {
			//1. 드라이버 확인 //2. 연결
			con = DBUtil.getConnection();
			
			//3. sql 작성
			String sql = "UPDATE board SET title=?, content=?, writer=? WHERE "
					+ " no = ?";

			//4. 처리문 객체
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardDTO.getTitle()); 
			pstmt.setString(2, boardDTO.getContent()); 
			pstmt.setString(3, boardDTO.getWriter()); 
			pstmt.setInt(4, boardDTO.getNo());
			
			//5. 실행 : UPDATE
			//select 인 경우는 executeQuery() 실행
			//그외 경우는 excuteUpdate() 실행
			pstmt.executeUpdate();
			
			//6. 표시 -> 오류가 없으면 정상처리
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtil.close(con, pstmt);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(int no) {
		// System.out.println("BoardDAO.view() - " + no);
		//사용할 객체를 선언
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 처리문
		
		// 오라클에서 데이터를 가져와서 채우는 프로그램 작성 할것
		try {
			//1. 드라이버 확인 //2. 연결
			con = DBUtil.getConnection();
			
			//3. sql 작성
			String sql = "DELETE FROM board WHERE no = ?";
			//4. 처리문 객체
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			//5. 실행 : UPDATE
			//select 인 경우는 executeQuery() 실행
			//그외 경우는 excuteUpdate() 실행
			pstmt.executeUpdate();
			
			//6. 표시 -> 오류가 없으면 정상처리
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				DBUtil.close(con, pstmt);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
