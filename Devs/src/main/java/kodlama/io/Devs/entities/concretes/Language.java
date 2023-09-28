package kodlama.io.Devs.entities.concretes;

import nonapi.io.github.classgraph.json.Id;

public class Language {
    @Id
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Language() {
    }
    public Language(int id, String name) {
        this.id = id;
        this.name = name;
    }



}
