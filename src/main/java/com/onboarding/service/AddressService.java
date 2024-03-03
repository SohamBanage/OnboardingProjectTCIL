package com.onboarding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onboarding.entity.Address;
import com.onboarding.repository.AddressRepository;

@Service
public class AddressService {

	private final AddressRepository addressRepository;
	
	public AddressService(AddressRepository addressRepository) {
		this.addressRepository=addressRepository;
	}
	
	public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }
}
