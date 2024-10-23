package com.centralbeat.centralbeat;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.centralbeat.centralbeat.model.CentralModel;
import com.centralbeat.centralbeat.repository.CentralRepository;

@Service
public class CentralService {
	
	@Autowired
	private CentralRepository repository;
	
	public String registerMusic(CentralModel model) {
		repository.save(model);
		return "Música Cadastrada";
	}
	
	public ResponseEntity<CentralModel> findMusicById(Long id){
		Optional<CentralModel> model = repository.findById(id);
		return model.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
	}
	
	public String deleteMusic(Long id) {
		repository.deleteById(id);
		return "Música Deletada";
	}
	
	public CentralModel updateMusic(Long id, CentralModel atualizado) {
		CentralModel model = repository.findById(id).get();
		model.setTitulo(atualizado.getTitulo());
		model.setData_de_lancamento(atualizado.getData_de_lancamento());
		model.setArtista(atualizado.getArtista());
		model.setReproducoes(atualizado.getReproducoes());
		model.setDescricao(atualizado.getDescricao());
		return repository.save(atualizado);
	}
}
