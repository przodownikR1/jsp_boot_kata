package pl.java.scalatech.repository.country;

import java.util.List;

import pl.java.scalatech.domain.Country;

public interface CountryRepository {

    List<Country> getList();
    Country save(Country country);
    void remove(Country country);
    Country findById(Long id);
    Country findByName(String name);
    long count();
    void removeAll();
}
