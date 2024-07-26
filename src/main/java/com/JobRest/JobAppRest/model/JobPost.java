package com.JobRest.JobAppRest.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Data
@NoArgsConstructor
@Component
@Entity
public class JobPost {
    @Id
    private int postId;


    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String>postTechStack;

    public JobPost(int postId, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }
}
