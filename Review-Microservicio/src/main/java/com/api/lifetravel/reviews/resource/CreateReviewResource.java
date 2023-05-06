package com.api.lifetravel.reviews.resource;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateReviewResource {

    @NotNull
    @Column(unique = true)
    private String date;

    @NotNull
    @Column
    @NotBlank
    private String rating;

    @Column
    @NotBlank
    @Size(max= 300)
    private String comment;

/*    @ManyToOne
    @JoinColumn(name = "plan_id")
    private PlanResourceId plan;

    @NotNull
    @NotBlank
    @ManyToOne
    @JoinColumn(name = "traveler_id")
    private TravelerResourceId traveler;*/


}
