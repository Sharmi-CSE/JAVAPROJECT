package com.Tns.admin_service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class Adminservice1 {
	
	@Autowired
	
	private AdminServicesRepository1 repo;
	public List <Admin1> listAll()
	{
		return repo.findAll();
	}
	public Admin1 get(Integer ad_id)
	{
		return repo.findById(ad_id).get();
	}
	public void delete(Integer ad_id)
	{
		repo.deleteById(ad_id);
	}
	public void save (Admin1 adm)
	{
		repo.save(adm);
	}

}

