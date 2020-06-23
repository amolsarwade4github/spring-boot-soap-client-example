package com.demo.springbootsoapclientexample.service;

import com.demo.springbootsoapclientexample.auto.generated.GetCountryRequest;
import com.demo.springbootsoapclientexample.auto.generated.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class CountryService {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    private WebServiceTemplate webServiceTemplate;

    public static final String URI = "http://localhost:8091/soapWS";

    public GetCountryResponse getCountry(GetCountryRequest request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        GetCountryResponse response = (GetCountryResponse)webServiceTemplate.marshalSendAndReceive(URI, request);
        return response;
    }
}
