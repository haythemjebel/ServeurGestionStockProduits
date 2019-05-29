package com.haythem.service;

import java.util.List;

public interface IcrudService<T,ID> {
	List<T>getAll();
	void add(T entity);
	void update(T entity);
	void delete(Long ID);

}
