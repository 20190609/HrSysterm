package cn.edu.hzvtc.dao;

import cn.edu.hzvtc.entity.Department;
import java.util.List;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Tue Jun 08 12:53:44 CST 2021
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Tue Jun 08 12:53:44 CST 2021
     */
    List<Department> selectAll();

}