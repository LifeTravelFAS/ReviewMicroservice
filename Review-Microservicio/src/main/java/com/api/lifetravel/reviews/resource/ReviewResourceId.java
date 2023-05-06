package com.api.lifetravel.reviews.resource;


import lombok.*;

import java.sql.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResourceId {
    private Long id;
//    private TravelerResourceId traveler;
//    private PlanResourceId plan;
    private String date;
    private String rating;
    private String comment;
}
