package br.com.edsonandrade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.edsonandrade.entity.PerfilEntity;
import br.com.edsonandrade.repository.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	private PerfilRepository perfilRepository;

	public List<PerfilEntity> getAll() {
		return perfilRepository.findAll();
	}
}
