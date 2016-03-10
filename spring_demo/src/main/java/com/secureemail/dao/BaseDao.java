package com.secureemail.dao;

import com.secureemail.query.BaseQuery;

import java.util.List;

/**
 * Created by simpletour_Jenkin on 2015/11/7.
 * 基本的操作
 */
public interface  BaseDao<PK>{
    /**
     * 查找
     * @param query
     * @return
     */
    public <T extends BaseQuery> PK find(T query);

    /**
     * 删除
     * @param query
     * @return
     */
    public <T extends BaseQuery> int delete(T query);

    /**
     * 更新
     * @param query
     * @return
     */
    public int update(PK query);

    /**
     * 添加
     * @param query
     * @return
     */
    public int insert(PK query);

    /**
     * 不带分页的列表查询
     * @param query
     * @return
     */
    public <T extends BaseQuery> List<PK>  list(T query);


    /**
     * 带分页的列表查询
     * @param query
     * @return
     */
    public <T extends BaseQuery> List<PK> query(T query);


    /**
     * 统计满足条件的记录
     * @param query
     * @param <T>
     * @return
     */
    public <T extends BaseQuery> int count(T query);
}
