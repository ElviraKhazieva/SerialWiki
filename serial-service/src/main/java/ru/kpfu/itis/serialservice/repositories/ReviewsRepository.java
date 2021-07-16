package ru.kpfu.itis.serialservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.serialservice.models.Review;
import ru.kpfu.itis.serialservice.models.Serial;

import java.sql.Date;
import java.util.List;

public interface ReviewsRepository extends JpaRepository<Review, Long> {

    List<Review> findAllBySerial(Serial serial);

    List<Review> findAllByAuthorId(Long id);

    List<Review> findAllByAuthorNickname(String nickname);

    List<Review> findAllByDateAfter(Date date);

    List<Review> findAllByDateBetween(Date from, Date to);

    List<Review> findAllByDateBefore(Date date);

}
