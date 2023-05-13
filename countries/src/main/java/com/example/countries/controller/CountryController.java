package com.example.countries.controller;

import com.example.countries.dto.CountryDTO;
import com.example.countries.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/country")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @PostMapping
    public CountryDTO save(@RequestBody CountryDTO countryDTO) {
        var countryDto = countryService.save(countryDTO);
        return ResponseEntity.ok(countryDto).getBody();
    }

    @GetMapping
    public ResponseEntity<List<CountryDTO>> findAll() {
        List<CountryDTO> countryDTOList = countryService.findAll();
        return ResponseEntity.ok(countryDTOList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryDTO> findById(@PathVariable Long id) {
        CountryDTO countryDTO = countryService.findById(id);
        return ResponseEntity.ok(countryDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CountryDTO> updatePresident(@PathVariable Long id, @RequestParam String president) {
        CountryDTO countryDTO = countryService.updatePresident(id, president);
        return ResponseEntity.ok(countryDTO);
    }

}
