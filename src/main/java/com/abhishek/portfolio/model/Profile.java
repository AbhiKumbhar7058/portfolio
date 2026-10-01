package com.abhishek.portfolio.model;

import java.util.List;

/** Everything shown on the page. Edit the values in ProfileConfig. */
public record Profile(
        String name, String firstName, String lastName, String headline, String intro, String about,
        String location, String email, String phone, String linkedin, String github,
        String degree, String cgpa,
        List<Skill> skills, List<Job> jobs, List<Project> projects,
        List<Education> education, List<Certification> certifications) {

    public record Skill(String name, String code, String color) {}
    public record Job(String company, String role, String dates, List<String> points) {}
    public record Project(String name, List<String> tech, List<String> points) {}
    public record Education(String title, String place, String years, String score) {}
    public record Certification(String name, String provider, String duration) {}
}
