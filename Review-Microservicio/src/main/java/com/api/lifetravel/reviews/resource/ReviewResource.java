package com.api.lifetravel.reviews.resource;

import lombok.*;
import java.sql.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResource {
    private Long id;
//    private Long travelerId;
    //private Long planId;
    private String date;
    private String rating;
    private String comment;
}
