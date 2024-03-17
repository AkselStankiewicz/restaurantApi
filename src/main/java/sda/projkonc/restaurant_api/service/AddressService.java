package sda.projkonc.restaurant_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sda.projkonc.restaurant_api.model.AddressModel;
import sda.projkonc.restaurant_api.repository.AddressRepository;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;
    public AddressModel saveAddress(AddressModel address) {
        return addressRepository.save(address);
    }
}
