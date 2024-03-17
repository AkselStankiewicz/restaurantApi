package sda.projkonc.restaurant_api.dto;

import lombok.Getter;
import lombok.Setter;
import sda.projkonc.restaurant_api.model.AddressModel;

@Setter
@Getter
public class RestaurantRequiredDto {
    private String name;
    private String ownerName;
    private AddressModel address;
}
