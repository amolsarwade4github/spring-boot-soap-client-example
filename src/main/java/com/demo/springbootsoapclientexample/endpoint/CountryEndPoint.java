package com.demo.springbootsoapclientexample.endpoint;

import com.demo.springbootsoapclientexample.auto.generated.GetCountryRequest;
import com.demo.springbootsoapclientexample.auto.generated.GetCountryResponse;
import com.demo.springbootsoapclientexample.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryEndPoint {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public GetCountryResponse getCountry(@RequestBody GetCountryRequest request) {
        return countryService.getCountry(request);
    }
}
