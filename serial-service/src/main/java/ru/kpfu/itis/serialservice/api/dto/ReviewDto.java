package ru.kpfu.itis.serialservice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.itis.serialservice.models.Review;
import ru.kpfu.itis.serialservice.models.Serial;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewDto {

    private Long authorId;

    private String authorName;

    private String text;

    private LocalDate date;

    private Long serialId;

    public static ReviewDto from(Review review){
        return ReviewDto.builder()
                .authorId(review.getAuthorId())
                .authorName(review.getAuthorNickname())
                .text(review.getText())
                .date(review.getDate().toLocalDate())
                .serialId(review.getSerial().getId())
                .build();
    }

    public static List<ReviewDto> from(List<Review> reviews){
        return reviews.stream().map(ReviewDto::from).collect(Collectors.toList());
    }
}
