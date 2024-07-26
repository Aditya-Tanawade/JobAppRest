package com.JobRest.JobAppRest.controller;


import com.JobRest.JobAppRest.model.JobPost;
import com.JobRest.JobAppRest.service.JobService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class JobRestController {

    @Autowired
     private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getjob(@PathVariable int postId){
       return service.getjob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addjob(jobPost);
        return service.getjob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updatejob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getjob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.Deletejob(postId);
        return "Job Deleted Successfully";
    }

    @GetMapping("load")
    public  String loadData(){
        service.load();
        return "Success";
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost>searchByKeyword(@PathVariable ("keyword") String keyword){
       return service.search(keyword);
    }
}
