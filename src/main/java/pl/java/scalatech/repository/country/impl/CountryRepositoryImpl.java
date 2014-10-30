package pl.java.scalatech.repository.country.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import pl.java.scalatech.domain.Country;
import pl.java.scalatech.repository.country.CountryRepository;

import com.google.common.collect.Lists;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    List<Country> countries = Lists.newArrayList();

    @Override
    public List<Country> getList() {
        return this.countries;
    }

    @Override
    public Country save(Country country) {
        countries.add(country);
        return country;
    }

    @Override
    public void remove(Country country) {
        Optional<Country> countryLoaded = countries.stream().filter(d -> d.getId().equals(country.getId())).findAny();
        countryLoaded.ifPresent(d -> countries.remove(d));
    }

    @Override
    public Country findById(Long id) {
        Optional<Country> result = countries.stream().filter(d -> d.getId() == id).findFirst();
        return result.orElseThrow(() -> new IllegalArgumentException("not exists any object with id : " + id));
    }

    @Override
    public Country findByName(String name) {
        Optional<Country> result = countries.stream().filter(d -> d.getName().equals(name)).findFirst();
        return result.orElseThrow(() -> new IllegalArgumentException("not exists any object with name : " + name));
    }

    @Override
    public long count() {
        return countries.stream().count();
    }

    @Override
    public void removeAll() {
        countries.clear();

    }

}
