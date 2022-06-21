package com.kosta.mavenApp.section3_d02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kosta.dto.BoardDTO;
import com.kosta.dto.EmpVO;
import com.kosta.model.BoardService;
import com.kosta.model.EmpService;

public class DBUsingTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("di5_d02.xml");
		
		/*
		BoardService service = ctx.getBean("boardService",BoardService.class);
		List<BoardDTO> blist = service.selectAll();
		for(BoardDTO b :blist) {
			System.out.println(b);
		}*/
		EmpService service = ctx.getBean("eService", EmpService.class);
		for(EmpVO emp : service.selectAll()) {
			System.out.println(emp);
		}
	}
}
