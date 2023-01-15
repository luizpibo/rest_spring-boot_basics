package br.com.dependency_injection.person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public PersonModel findById(Long personId) {
        logger.info("Buscando pessoa com o id: " + personId);
        PersonModel pessoa = new PersonModel();
        pessoa.setName("luiz");
        pessoa.setAddress("qn 30");
        pessoa.setGender("Male");
        pessoa.setId(personId);
        return pessoa;
    }

    public PersonModel create(PersonModel person) {
        logger.info("Adicionando pessoa nova");
        return person;
    }

    public List<PersonModel> findAll() {
        logger.info("Buscando todas as pessoas");

        List<PersonModel> pessoas = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            PersonModel pessoa = new PersonModel();
            pessoa.setId(counter.incrementAndGet());
            pessoa.setName("luiz-" + counter.get());
            pessoa.setAddress("qn 30");
            pessoa.setGender("Male");
            pessoas.add(pessoa);
        }
        return pessoas;
    }
}
