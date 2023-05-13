package com.example.countries.service;

import com.example.countries.dto.CountryDTO;
import com.example.countries.mapper.CountryMapper;
import com.example.countries.model.Country;
import com.example.countries.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryDTO save(CountryDTO countryDTO) {
        Country country = CountryMapper.INSTANCE.convertToCountry(countryDTO);
        country = countryRepository.save(country);

        return CountryMapper.INSTANCE.convertToCountryDTO(country);
    }

    public List<CountryDTO> findAll() {
        List<Country> countryList = countryRepository.findAll();
        return CountryMapper.INSTANCE.convertToCountryDTOList(countryList);
    }

    public CountryDTO findById(Long id) {
        Country country = countryRepository.findById(id).orElseThrow();
        return CountryMapper.INSTANCE.convertToCountryDTO(country);
    }

    public CountryDTO updatePresident(Long id, String president) {
        Country country = countryRepository.findById(id).orElseThrow();
        country.setPresident(president);
        country = countryRepository.save(country);
        return CountryMapper.INSTANCE.convertToCountryDTO(country);
    }
}
