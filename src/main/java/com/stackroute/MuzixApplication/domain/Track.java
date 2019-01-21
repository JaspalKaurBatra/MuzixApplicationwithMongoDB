package com.stackroute.MuzixApplication.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Tracks")    //For MongoDB
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Track {
    @Id
    private int id;

    @ApiModelProperty(notes = "Name of the Track")
    private String name;

    @ApiModelProperty(notes = "Comment for the track")
    private String comment;

    public Track(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }
}
