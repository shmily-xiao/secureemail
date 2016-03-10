package com.secureemail.dao.impl;

import com.secureemail.dao.BaseDao;
import com.secureemail.query.BaseQuery;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;


/**
 * Created by simpletour_Jenkin on 2015/11/7.
 * 基础的实现
 */
public class BaseDaoImpl<PK> extends SqlSessionDaoSupport implements BaseDao<PK>{

    public String getNameSpace(){
        return this.getClass().getName();
    }

    public final String opof(String namespace, String op){
        return String.format("%s.%s",namespace,op);
    }

    @Override
    public <T extends BaseQuery> PK find(T query) {
        return this.getSqlSession().selectOne(opof(getNameSpace(),"find"),query);
    }

    @Override
    public <T extends BaseQuery> int delete(T query) {
        return this.getSqlSession().delete(opof(getNameSpace(),"delete"),query);
    }

    @Override
    public int update(PK query) {
        return this.getSqlSession().update(opof(getNameSpace(),"update"),query);
    }

    @Override
    public int insert(PK query) {
        return this.getSqlSession().insert(opof(getNameSpace(),"insert"),query);
    }

    @Override
    public <T extends BaseQuery> List<PK> list(T query) {
        return this.getSqlSession().selectList(opof(getNameSpace(),"list"),query);
    }

    @Override
    public <T extends BaseQuery> List<PK> query(T query) {
        return this.getSqlSession().selectList(opof(getNameSpace(),"query"),query);
    }

    @Override
    public <T extends BaseQuery> int count(T query) {
        return this.getSqlSession().selectOne(opof(getNameSpace(),"count"),query);
    }
}
