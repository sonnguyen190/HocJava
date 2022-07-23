package com.service;

import java.util.List;

import com.model.Owner;

public interface OwnerService {

	void displayAll(List<Owner> list);

	Owner findOwnerById(List<Owner> list, int id);

	List<Owner> add(List<Owner> list, Owner owner, int index);

	List<Owner> remove(List<Owner> list, int index);

}
