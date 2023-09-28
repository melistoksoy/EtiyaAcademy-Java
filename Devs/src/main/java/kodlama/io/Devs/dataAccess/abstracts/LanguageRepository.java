package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface LanguageRepository {
    void add(Language language);
    void delete(int id);
    List<Language> getAll();
    void update(Language language);
    Language getById(int id);


}
