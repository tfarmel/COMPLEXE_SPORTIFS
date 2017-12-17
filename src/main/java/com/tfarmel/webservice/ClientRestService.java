package com.tfarmel.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfarmel.dao.ClientRepository;
import com.tfarmel.entities.Client;

@RestController
public class ClientRestService {

	@Autowired
	private ClientRepository clientRepository;
	
	@RequestMapping
	public List<Client> getClients(){
		return clientRepository.findAll();
	}
}
