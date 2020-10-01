package com.mzz.Dao;

import com.mzz.po.Dept;

import java.util.List;

public interface DeptDao {
    /**
     *查询全部
     * @return
     */
    List<Dept> selectAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Dept selectOne(int id);


    int insert(Dept dept);

    int delete (int id);

    int update(Dept dept);


}
