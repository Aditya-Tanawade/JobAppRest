package com.JobRest.JobAppRest.repo;

import com.JobRest.JobAppRest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

    List<JobPost>findByPostProfileContainingOrPostDescContaining(String postTechStack,String postDesc);
}

//
////    List<JobPost> jobs= new ArrayList<>();
////
////    public JobRepo() {
//        jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
//
//        jobs.add(
//                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//                        3, List.of("HTML", "CSS", "JavaScript", "React")));
//
//        // Data Scientist Job Post
//        jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                List.of("Python", "Machine Learning", "Data Analysis")));
//
//        // Network Engineer Job Post
//        jobs.add(new JobPost(4, "Network Engineer",
//                "Design and implement computer networks for efficient data communication", 5,
//                List.of("Networking", "Cisco", "Routing", "Switching")));
//
//        // Mobile App Developer Job Post
//        jobs
//                .add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
//                        3, List.of("iOS Development", "Android Development", "Mobile App")));
//
//        // DevOps Engineer Job Post
//        jobs.add(
//                new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines",
//                        4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")));
//
//        // UI/UX Designer Job Post
//        jobs
//                .add(new JobPost(7, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces",
//                        2, List.of("User Experience", "User Interface Design", "Prototyping")));
//
//        // Cybersecurity Analyst Job Post
//        jobs
//                .add(new JobPost(8, "Cybersecurity Analyst", "Protect computer systems and networks from cyber threats",
//                        4, List.of("Cybersecurity", "Network Security", "Incident Response")));
//
//        // Full Stack Developer Job Post
//        jobs.add(new JobPost(9, "Full Stack Developer", "Experience in both front-end and back-end development",
//                5, List.of("JavaScript", "Node.js", "React", "Spring", "MongoDB")));
//
//        // Cloud Architect Job Post
//        jobs.add(new JobPost(10, "Cloud Architect", "Design and implement cloud infrastructure solutions", 6,
//                List.of("Cloud Computing", "AWS", "Azure", "Google Cloud")));
//
//        // Job Post 11
//        jobs.add(new JobPost(11, "Software Tester", "Ensure software quality through testing and validation", 3, List.of("Testing", "JUnit", "Selenium", "TestNG")));
//
//        // Job Post 12
//        jobs.add(new JobPost(12, "React Native Developer",
//                "Develop cross-platform mobile applications using React Native", 2,
//                List.of("React Native", "JavaScript", "Mobile App Development")));
//
//        // Job Post 13
//        jobs.add(new JobPost(13, "Business Analyst", "Analyze business processes and recommend improvements", 4,
//                List.of("Business Analysis", "Requirements Gathering", "Process Modeling")));
//
//        // Job Post 14
//        jobs.add(new JobPost(14, "Embedded Systems Engineer",
//                "Design and develop embedded systems for hardware applications", 5,
//                List.of("Embedded Systems", "C/C++", "Microcontrollers", "RTOS")));
//
//
//    }

//
//
//
//
//    public List<JobPost> getAllJobs(){
//        return jobs;
//    }
//
//    public void addjob(JobPost jobPost){
//        jobs.add(jobPost);
//        System.out.println(jobs);
//    }
//
//    public JobPost getJob(int postId) {
//
//        for(JobPost job:jobs){
//            if(job.getPostId()==postId)
//                return job;
//        }
//
//            return null;
//    }
//
//    public void updateJob(JobPost jobPost) {
//        for(JobPost jobPost1 : jobs){
//            if(jobPost1.getPostId()==jobPost.getPostId()){
//                jobPost1.setPostProfile(jobPost.getPostProfile());
//                jobPost1.setPostDesc(jobPost.getPostDesc());
//                jobPost1.setReqExperience(jobPost.getReqExperience());
//                jobPost1.setPostTechStack(jobPost.getPostTechStack());
//            }
//        }
//    }
//
//    public JobPost deletejob(int postId) {
//        for(JobPost job:jobs){
//            if(job.getPostId()==postId)
//                jobs.remove(job);
//        }
//        return null;
//    }

