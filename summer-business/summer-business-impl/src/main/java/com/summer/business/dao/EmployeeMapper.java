package com.summer.business.dao;

import com.summer.business.core.bean.Employee;

import java.util.List;

/**
 * @author yuzhuozhang
 */
public interface EmployeeMapper {

    /**
     * 向员工表中添加数据
     * @param employee
     * @return
     */
    public int insert(Employee employee);

    /**
     * 根据id移除员工
     * @param id
     * @return
     */
    public int removeEmployeeById(int id);

    /**
     * 修改员工数据，根据员工的id
     * @param employee
     * @return
     */
    public int updateEmployee(Employee employee);

    /**
     * 查询所有的员工信息
     * @return 所有员工的信息
     */
    public List<Employee> queryAll();

    /**
     * 根据id查询员工信息
     * @param id
     * @return 员工信息
     */
    public Employee selectEmployeeById(int id);

}
