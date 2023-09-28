package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1, "java"));
        languages.add(new Language(2, "C#"));
        languages.add(new Language(3, "Python"));
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(int id) {
        languages.remove(id);

    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void update(Language language) {
      getById(language.getId()).setName(language.getName());
    }

    @Override
    public Language getById(int id) {
        for(Language language: languages){
            if(language.getId()==id){
                return language;
            }
        }
        return null;
    }
}
