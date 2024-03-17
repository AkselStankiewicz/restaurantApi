package sda.projkonc.restaurant_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sda.projkonc.restaurant_api.dto.RestaurantRequiredDto;
import sda.projkonc.restaurant_api.model.AddressModel;
import sda.projkonc.restaurant_api.model.OwnerModel;
import sda.projkonc.restaurant_api.model.RestaurantModel;
import sda.projkonc.restaurant_api.repository.RestaurantRepository;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final OwnerService ownerService;
    private final AddressService addressService;
    public RestaurantModel registerRestaurant(RestaurantRequiredDto requiredDto) {

        RestaurantModel model = new RestaurantModel();
        OwnerModel ownerModel = ownerService.createNewOwner(requiredDto.getOwnerName());
        AddressModel addressModel = addressService.saveAddress(requiredDto.getAddress());
        model.setAddress(addressModel);
        model.setName(requiredDto.getName());
        model.setOwner(ownerModel);

        return restaurantRepository.save(model);
    }
}
