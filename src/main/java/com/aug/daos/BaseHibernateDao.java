package com.aug.daos;

import java.util.List;

public interface BaseHibernateDao<T> {

    public T getById(final Integer id);

    public List<T> findAll();
    
    public List<T> findBySearch(String search);

    public void save(final T entity);

    public void update(final T entity);

    public void delete(final T id);

}
