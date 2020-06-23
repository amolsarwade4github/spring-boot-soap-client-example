package com.demo.springbootsoapclientexample.service;

import com.demo.springbootsoapclientexample.auto.generated.GetUserRequest;
import com.demo.springbootsoapclientexample.auto.generated.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class UserService {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    private WebServiceTemplate webServiceTemplate;

    public static final String URI = "http://localhost:8091/soapWS";

    public GetUserResponse getUser(GetUserRequest request) {
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        GetUserResponse response = (GetUserResponse)webServiceTemplate.marshalSendAndReceive(URI, request);
        return response;
    }
}
