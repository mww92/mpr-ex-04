package mpr.exs.genealogy;

import java.util.List;

public interface Genealogy {
    /**
     * Dodanie osoby do bazy
     * @param p – osoba, którą dodajemy
     * @throws GenealogyException jeśli p jest już w bazie
     */ 
    void addPerson(Person p);

    /**
     * Usunięcie osoby z bazy
     * @param p – osoba, którą usuwamy
     * @throws GenealogyException jeśli p nie ma w bazie
     */ 
    void delPerson(Person p);

    /**
     * Ustalenie powiązania dziecko-matka
     * jeśli którakolwiek z osób (p, m) nie występuje w bazie,
     * to przed ustaleniem powiązania należy ją do niej dodać
     * @param p – osoba której ustalamy matkę
     * @param m – matka
     * @throws GenealogyException jeśli m nie jest kobietą
     */ 
    void setAsMother(Person p, Person m);

    /**
     * Ustalenie powiązania dziecko-ojciec
     * jeśli którakolwiek z osób (p, f) nie występuje w bazie,
     * to przed ustaleniem powiązania należy ją do niej dodać
     * @param p – osoba której ustalamy ojca 
     * @param f – ojciec
     * @throws GenealogyException jeśli f nie jest mężczyzną
     */ 
    void setAsFather(Person p, Person f);
    
    /**
     * Matka osoby
     * @param p – osoba, której rodzica szukamy.
     * @return matka osoby p
     * @throws GenealogyException jeśli p nie ma w bazie
     */ 
    Person getMotherOf(Person p);

    /**
     * Ojciec osoby
     * @param p – osoba, której rodzica szukamy.
     * @return ojciec osoby p
     * @throws GenealogyException jeśli p nie ma w bazie
     */ 
    Person getFatherOf(Person p);
    
    /**
     * Pełna lista rodzeństwa.
     * @param p – osoba, której rodzeństwa szukamy.
     * @return lista rodzeństwa
     * @throws GenealogyException jeśli p nie ma w bazie
     */ 
    List<Person> getSiblingsOf(Person p);

    /**
     * Drzewo genealogiczne osoby
     * @param p – osoba, której przodków szukamy.
     * @param depth – żądana głębokość drzewa
     * @return lista przodków w porządku „wgłąb”
     * @throws GenealogyException jeśli p nie ma w bazie
     */ 
    List<Person> getAncestorsDF(Person p, int depth);

    /**
     * Drzewo genealogiczne osoby
     * @param p – osoba, której przodków szukamy
     * @param depth – żądana głębokość drzewa
     * @return lista przodków w porządku „wszerz”
     * @throws GenealogyException jeśli p nie ma w bazie
     */ 
    List<Person> getAncestorsBF(Person p, int depth);

    /**
     * Liczba osób w bazie genealogicznej
     */
    int getSize();

    /**
     * Sprawdzenie czy p występuje w bazie genealogicznej
     */
    boolean exists(Person p);
}
