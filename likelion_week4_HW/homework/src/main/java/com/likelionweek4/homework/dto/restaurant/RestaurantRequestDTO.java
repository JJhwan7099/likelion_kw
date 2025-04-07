package com.likelionweek4.homework.dto.restaurant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class RestaurantRequestDTO {

    @Getter
    @AllArgsConstructor
    public static class CreateRestaurantInfo {
        String name;
        String address;
        int distance;
        double latitude;
        double longitude;
        String categoryGroup;
        String category;
    }

    @Getter
//    @NoArgsConstructor
//    @AllArgsConstructor
    @Setter
    public static class SearchRestaurantConditionInfo {
        private String name;
        private String categoryGroup;
        private String category;
        private Integer distance;
    }

    @Getter
    @AllArgsConstructor
    public static class SearchRestaurantByNameInfo {
        String name;
    }

    @Getter
    @AllArgsConstructor
    public static class SearchRestaurantByCategoryGroupInfo {
        String categoryGroup;
    }

    @Getter
    @AllArgsConstructor
    public static class SearchRestaurantByCategoryInfo {
        String category;
    }

    @Getter
    @AllArgsConstructor
    public static class SearchRestaurantByDistanceInfo {
        int distance;
    }



    @Getter
    @AllArgsConstructor
    public static class UpdateRestaurantInfo {
        @Setter
        Long id;
        String name;
        String address;
        int distance;
        double latitude;
        double longitude;
        String categoryGroup;
        String category;
    }

    @Getter
    @AllArgsConstructor
    public static class DeleteRestaurantInfo {
        Long id;
    }
}
