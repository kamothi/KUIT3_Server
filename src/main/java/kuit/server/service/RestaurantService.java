package kuit.server.service;

import kuit.server.dao.RestaurantDao;
import kuit.server.dto.restaurant.RestaurantMenuRequest;
import kuit.server.dto.restaurant.RestaurantMenuResponse;
import kuit.server.dto.restaurant.RestaurantOrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantDao restaurantDao;

    public List<RestaurantOrderResponse> getOrders(Long restaurantId) {
        return restaurantDao.getOrders(restaurantId);
    }

    public List<RestaurantMenuResponse> getMenu(Long restaurantId) {
        return restaurantDao.getMenu(restaurantId);
    }

    public void createMenu(Long restaurantId, RestaurantMenuRequest menuRequest) {
        restaurantDao.createMenu(restaurantId,menuRequest);
    }
}
