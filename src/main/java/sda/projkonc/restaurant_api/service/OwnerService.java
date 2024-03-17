package sda.projkonc.restaurant_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sda.projkonc.restaurant_api.model.OwnerModel;
import sda.projkonc.restaurant_api.repository.OwnerRepository;

@Service
@RequiredArgsConstructor
public class OwnerService {
    private final OwnerRepository ownerRepository;
    public OwnerModel createNewOwner(String name) {
        OwnerModel model = new OwnerModel();
        model.setName(name);
        return ownerRepository.save(model);
    }
}
