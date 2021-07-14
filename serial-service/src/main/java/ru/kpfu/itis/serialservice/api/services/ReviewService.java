package ru.kpfu.itis.serialservice.api.services;

import ru.kpfu.itis.serialservice.api.dto.ReviewDto;
import ru.kpfu.itis.serialservice.api.dto.ReviewForm;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    void addReview(ReviewForm form);

    void deleteReview(Long id);

    Optional<ReviewDto> getReviewById(Long id);

    List<ReviewDto> getSerialReviews(Long serialId);
}
