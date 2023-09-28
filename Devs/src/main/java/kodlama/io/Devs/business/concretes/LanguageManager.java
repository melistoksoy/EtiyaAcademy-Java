package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    public void add(Language language) throws Exception {
        if(language.getName()==null) {
            throw new Exception("Programlama dili boş bırakılamaz!");
        }
        for (Language existingLanguage : languageRepository.getAll()) {
            if (language.getName().equals(existingLanguage.getName())) {
                throw new Exception("Aynı isim tekrarlanamaz!");
            }
        }
        languageRepository.add(language);


    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void update(Language language) {
        languageRepository.update(language);
    }

    @Override
    public Language getById(int id) {
        return languageRepository.getById(id);
    }
}
