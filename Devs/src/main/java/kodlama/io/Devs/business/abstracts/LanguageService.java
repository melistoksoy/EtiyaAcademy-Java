package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    void add(Language language) throws Exception;
    void delete(int id);
    List<Language> getAll();
    void update(Language language);
    Language getById(int id);
}
