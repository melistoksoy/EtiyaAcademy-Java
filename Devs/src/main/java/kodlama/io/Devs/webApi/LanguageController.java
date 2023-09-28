package kodlama.io.Devs.webApi;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("api/languages")
public class LanguageController {
    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }




    @GetMapping("/getall")
    public List<Language> getAll() {
        return languageService.getAll();

    }
    @GetMapping("/getById")
    public Language getById(int id){
        return languageService.getById(id);
    }
    @DeleteMapping("/delete")
    public void delete(int id){
        languageService.delete(id);
    }
    @PutMapping("/update")
    public void update(Language language){
        languageService.update(language);
    }
    @PostMapping("/add")
    public void add(Language language) throws Exception{
        languageService.add(language);
    }

}
