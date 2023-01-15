package br.com.dependency_injection.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Anotação para controlador rest
@RestController
// adicionando prefixo da rota
@RequestMapping("/person")
public class PersonController {

    // injetando dependências
    @Autowired
    private PersonService service;

    // Usando anotação RequestMapping para transformar a função em um controlador de
    // requisições rest
    // Usando variável que vem na rota da requisição (PathVariable)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonModel> findById(@PathVariable(value = "id") Long userId) {
        return ResponseEntity.ok(service.findById(userId));
    }

    // Usando notação GetMapping para transformar essa função em um controlador doo
    // metodo GET
    // Usando variável que vem no parametro de query (RequestParam)
    // Mudando valor para opcinal
    // Adicionando valor padrão
    @GetMapping()
    public ResponseEntity<PersonModel> person(
            @RequestParam(required = false, defaultValue = "123", name = "Rota raiz get Person") Long userId) {
        return ResponseEntity.ok(service.findById(userId));
    }

    // Buscando todas as pessoas....
    @GetMapping("/getAll")
    public ResponseEntity<List<PersonModel>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    // Criando pessoa....
    @PostMapping()
    public ResponseEntity<PersonModel> create(@RequestBody PersonModel person) {
        return ResponseEntity.ok(service.create(person));
    }

    // @RequestMapping(
    //  method = RequestMethod.GET,
    //  produces = MediaType.APPLICATION_JSON_VALUE,
    //  consumes = MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<PersonModel> createResquest(@PathVariable(value = "id") Long userId) {
    //     return ResponseEntity.ok(service.findById(userId));
    // }
    
    // alterando pessoa....
    @PutMapping()
    public ResponseEntity<PersonModel> put(@RequestBody PersonModel person) {
        return ResponseEntity.ok(service.create(person));
    }

    // @RequestMapping(
    //  method = RequestMethod.PUT,
    //  produces = MediaType.APPLICATION_JSON_VALUE,
    //  consumes = MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<PersonModel> putResquest(@PathVariable(value = "id") Long userId) {
    //     return ResponseEntity.ok(service.findById(userId));
    // }

    @DeleteMapping
    public ResponseEntity<PersonModel> delete(@RequestBody Long id) {
        return ResponseEntity.ok(null);
    }
}
