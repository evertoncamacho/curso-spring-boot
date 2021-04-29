package br.com.evertoncamacho.springboot2.controller;

import br.com.evertoncamacho.springboot2.domain.Anime;
import br.com.evertoncamacho.springboot2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController //Esta anotação já inclui o @Controller e @ResponseBody
@RequestMapping("anime")
@Log4j2
//@AllArgsConstructor //Anotação do lombok para criar um construtor com todos os atributos da classe
@RequiredArgsConstructor //O construtor é criado apenas com os atributos definidos com final
public class AnimeController {
    private final DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<Anime> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime("Berserk"));
    }
}
