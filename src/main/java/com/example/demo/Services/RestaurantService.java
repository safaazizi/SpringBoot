package com.example.demo.Services;

import com.example.demo.Repositories.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RestaurantService implements IRestaurantService {
    private RestaurantRepository restaurantRepository;
}
