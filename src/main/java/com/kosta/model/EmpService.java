package com.kosta.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosta.dto.EmpVO;
import com.kosta.dto.JobVO;

//����ڿ�û -->Controller-->Service-->DAO-->DB
//		  <--		   <--		 <--   <--
//service�� DAO�� ȣ��
@Service("eService")
public class EmpService {
	
	@Autowired
	EmpDAO empDAO = new EmpDAO();
	//1. ��� ���� ��ȸ
	public List<EmpVO> selectAll() {
		return empDAO.selectAll();
	}
	//1-1. ��� jobs ��ȸ(emplist.jsp select-option�� ���� �߰�����)
	public List<JobVO> selectJobAll() {
		return empDAO.selectJobAll();
	}
	//1-2. ��� manager ��ȸ
	public Map<Integer,String> selectManagerAll() {
		return empDAO.selectManagerAll();
	}
	//2. ������ȸ(Ư���μ�)-department_id
	public List<EmpVO> selectByDept(int deptid) {
		return empDAO.selectByDept(deptid);
	}
	//3. ������ȸ(Ư���Ŵ���)-manager_id
	public List<EmpVO> selectByManager(int mid) {
		return empDAO.selectByManager(mid);
	}
	//4. ������ȸ(Ư��job)-job_id
	public List<EmpVO> selectByJob(String job_id) { //���� �޶� ��
		return empDAO.selectByJob(job_id);
	}
	//5. ������ȸ(Ư�� department_id, job_id, salary>=, hire_date>=?)
	public List<EmpVO> selectByCondition(int deptid, String job_id, double sal, String hire_date) {
		return empDAO.selectByCondition(deptid, job_id, sal, hire_date);
	}
	//6.Ư�� ���� 1�� ��ȸ-employee_id
	public EmpVO selectById(int empid) {
		return empDAO.selectById(empid);
	}
	//(�߰�-�̸����ߺ�üũ)SQL_SELECT_BYEMAIL
	public int selectByEmail(String email) {
		return empDAO.selectByEmail(email);
	}
	/*
	public EmpVO selectByEmail(String email) {
		return empDAO.selectByEmail(email);
	}
	*/
	
	//~DML
	//7. insert
	public int empInsert(EmpVO emp) {
		return empDAO.empInsert(emp);
	}
	//8. update(Ư�� ���� 1�� employee_id=?)
	public int empUpdate(EmpVO emp) {
		return empDAO.empUpdate(emp);
	}
	//9. update(���� department_id=?)
	public int empUpdateByDept(EmpVO emp, int deptid) {
		return empDAO.empUpdateByDept(emp, deptid);
	}
	//10. delete(Ư�� ���� 1�� employee_id=?)
	public int empDelete(int empid) {
		return empDAO.empDelete(empid);
	}
	//11. delete(���� department_id=?)
	public int empDeleteByDept(int deptid) {
		return empDAO.empDeleteByDept(deptid);
	}
}
