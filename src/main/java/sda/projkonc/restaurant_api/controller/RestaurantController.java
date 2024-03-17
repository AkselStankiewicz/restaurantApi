package sda.projkonc.restaurant_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sda.projkonc.restaurant_api.dto.RestaurantRequiredDto;
import sda.projkonc.restaurant_api.model.RestaurantModel;
import sda.projkonc.restaurant_api.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService service;

    @PostMapping("/register")
    public ResponseEntity<RestaurantModel> registerRestaurant(@RequestBody RestaurantRequiredDto requiredDto) {
        return ResponseEntity.ok(service.registerRestaurant(requiredDto));
    }
}
