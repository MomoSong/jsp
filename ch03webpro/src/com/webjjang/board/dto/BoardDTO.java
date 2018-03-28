package com.webjjang.board.dto;
// 글번호, 제목, 내용, 작성자, 작성일, 조회수
public class BoardDTO {

	private int no;
	private String title, content, writer, writeDate;
	private int hit;
	// 기본 생성자. 먼저 생성을 하고 나중에 setter를 이용해서 데이터를 넣는다.
	public BoardDTO() {
	}
	// 글쓰기용 생성자.
	public BoardDTO(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	// 글리스트용 생성자.
	public BoardDTO(int no, String title, String writer,
			String writeDate, int hit) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.writeDate = writeDate;
		this.hit = hit;
	}
	// 글보기용 생성자
	public BoardDTO(int no, String title, String content, String writer, String writeDate, int hit) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
		this.hit = hit;
	}
	
	// getter 와 setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", writeDate=" + writeDate + ", hit=" + hit + "]";
	}
	
}
