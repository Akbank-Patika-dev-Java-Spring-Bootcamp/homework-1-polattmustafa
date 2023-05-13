package com.example.countries.mapper;

import com.example.countries.dto.CountryDTO;
import com.example.countries.model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    Country convertToCountry(CountryDTO countryDTO);

    CountryDTO convertToCountryDTO(Country country);

    List<CountryDTO> convertToCountryDTOList(List<Country> countryList);

}
