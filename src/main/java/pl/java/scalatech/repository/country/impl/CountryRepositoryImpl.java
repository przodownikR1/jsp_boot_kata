package pl.java.scalatech.repository.country.impl;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Repository;

import pl.java.scalatech.domain.Country;
import pl.java.scalatech.repository.country.CountryRepository;

import com.google.common.collect.Lists;

@Repository
@Slf4j
public class CountryRepositoryImpl implements CountryRepository {

    AtomicLong ids = new AtomicLong();

    List<Country> countries = Lists.newArrayList();

    @Override
    public List<Country> getList() {
        return this.countries;
    }

    @Override
    public Country save(Country country) {
        Optional<Country> result = countries.stream().filter(d -> d.getId() == country.getId()).findFirst();
        if (result.isPresent()) {
            countries.remove(result.get());
        }
        if (country.getId() == null) {
            country.setId(ids.getAndIncrement());
        }
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
