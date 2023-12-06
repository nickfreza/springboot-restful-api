package com.frezateam.springbootrestfulapi.AddressModule.controller;

import com.frezateam.springbootrestfulapi.UserModule.entity.User;
import com.frezateam.springbootrestfulapi.AddressModule.model.AddressResponse;
import com.frezateam.springbootrestfulapi.AddressModule.model.CreateAddressRequest;
import com.frezateam.springbootrestfulapi.UtilModule.model.WebResponse;
import com.frezateam.springbootrestfulapi.AddressModule.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping(
            path = "/api/contacts/{contactId}/addresses"
    )
    public WebResponse<AddressResponse> create(User user,
                                               @RequestBody CreateAddressRequest request,
                                               @PathVariable(value = "contactId") String contactId){
        request.setContactId(contactId);
        AddressResponse addressResponse = addressService.create(user, request);
        return WebResponse.<AddressResponse>builder().data(addressResponse).build();
    }
}
