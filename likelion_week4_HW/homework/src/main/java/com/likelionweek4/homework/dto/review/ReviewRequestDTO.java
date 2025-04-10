package com.likelionweek4.homework.dto.review;

import com.likelionweek4.homework.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class ReviewRequestDTO {


    @Getter
    @AllArgsConstructor
    public static class CreateReviewInfo {
        @Setter
        private Long restaurantId;
        private int rating;
        private String comment;
        private LocalDateTime created_at;
    }

    @Getter
    @AllArgsConstructor
    public static class SearchReviewsInfo {
        @Setter
        private Long restaurantId;
    }

    @Getter
    @AllArgsConstructor
    public static class UpdateReviewInfo {
        @Setter
        private Long reviewId;
        private int rating;
        private String comment;
        private LocalDateTime created_at;
    }

    @Getter
    @AllArgsConstructor
    public static class DeleteReviewInfo {
        private Long reviewId;
    }
}
