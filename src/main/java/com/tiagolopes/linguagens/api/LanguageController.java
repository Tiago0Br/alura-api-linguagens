package com.tiagolopes.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

	@Autowired
	private LanguageRepository repository;
	
	@GetMapping(value = "/linguagens")
	public List<Language> getLanguages() {
		return repository.findAll();
	}
	
	@PostMapping(value = "/linguagens")
	public Language createLanguage(@RequestBody Language language) {
		return repository.save(language);
	}
}
