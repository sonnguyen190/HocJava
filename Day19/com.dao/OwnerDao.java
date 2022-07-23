package com.dao;

import java.util.List;

import com.model.Owner;

public interface OwnerDao {

	List<Owner> findAll(String path);

	void save(List<Owner> list, String path);

}
