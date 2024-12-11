package com.villancio.gtb_api.domain.repository;

import com.villancio.gtb_api.domain.dto.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository {
    List<Review> getAll();
    Optional<Review> getReview(int idReview);
    Optional<List<Review>> findByDistrict(int idDistrict);
    Optional<List<Review>> findByName(String observacion);
    Review save(Review review);
    void delete(int idReview);
}
