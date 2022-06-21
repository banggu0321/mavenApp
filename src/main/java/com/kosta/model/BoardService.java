package com.kosta.model;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kosta.dto.BoardEmpVO;
import com.kosta.dto.BoardDTO;

@Service //Service역할의 component
public class BoardService {
	
	@Autowired //사용가능
	BoardDAO dao;
	
	/*
	@Autowired 
	public BoardService(BoardDAO dao) {
		super();
		this.dao = dao;
	}*/
	
	//b.bno, b.title, b.content, e.FIRST_NAME ||' '|| e.LAST_NAME fullname
	public List<BoardEmpVO> selectAllJoin() {
		return dao.selectAllJoin();
	}
	//1. ��� �Խ��� ��ȸ
	public List<BoardDTO> selectAll() {
		return dao.selectAll();
	}
	//2. ������ȸ (�ش� Bno)
	public BoardDTO selectByBoardNo(int post_no) {
		return dao.selectByBoardNo(post_no);
	}
	//3. ������ȸ (�ش� writer)
	public List<BoardDTO> selectByWriter(int writer_id) {
		return dao.selectByWriter(writer_id);
	}
	//4. ������ȸ (�ش� title) SQL_SELECT_TITLE
	public List<BoardDTO> selectByTitle(String title) {
		return dao.selectByTitle(title);
	}
	//5. ������ȸ (�ش� regdate) SQL_SELECT_REGDATE between ? and ?
	public List<BoardDTO> selectByRegDate(Date sdate, Date edate) {
		return dao.selectByRegDate(sdate, edate);
	}
	//INSERT
	public int boardInsert(BoardDTO post) {
		return dao.boardInsert(post);
	}
	//UPDATE
	public int boardUpdate(BoardDTO post) {
		return dao.boardUpdate(post);
	}
	//DELETE
	public int boardDelete(int writer_id) {
		return dao.boardDelete(writer_id);
	}
}
