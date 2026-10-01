//package com.abhishek.portfolio.model;
//
//import java.util.List;
//
///** Everything shown on the page. Edit the values in ProfileConfig. */
//public record Profile(
//        String name, String firstName, String lastName, String headline, String intro, String about,
//        String location, String email, String phone, String linkedin, String github,
//        String degree, String cgpa,
//        List<Skill> skills, List<Job> jobs, List<Project> projects,
//        List<Education> education, List<Certification> certifications) {
//
//    public record Skill(String name, String code, String color) {}
//    public record Job(String company, String role, String dates, List<String> points) {}
//    public record Project(String name, List<String> tech, List<String> points) {}
//    public record Education(String title, String place, String years, String score) {}
//    public record Certification(String name, String provider, String duration) {}
//}

package com.abhishek.portfolio.model;

import java.util.List;

/** Everything shown on the page. Edit the values in ProfileConfig. */

public class Profile {

    private String name;
    private String firstName;
    private String lastName;
    private String headline;
    private String intro;
    private String about;
    private String location;
    private String email;
    private String phone;
    private String linkedin;
    private String github;
    private String degree;
    private String cgpa;

    private List<Skill> skills;
    private List<Job> jobs;
    private List<Project> projects;
    private List<Education> education;
    private List<Certification> certifications;

    public Profile(
            String name, String firstName, String lastName, String headline,
            String intro, String about, String location, String email,
            String phone, String linkedin, String github, String degree,
            String cgpa, List<Skill> skills, List<Job> jobs,
            List<Project> projects, List<Education> education,
            List<Certification> certifications) {

        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.headline = headline;
        this.intro = intro;
        this.about = about;
        this.location = location;
        this.email = email;
        this.phone = phone;
        this.linkedin = linkedin;
        this.github = github;
        this.degree = degree;
        this.cgpa = cgpa;
        this.skills = skills;
        this.jobs = jobs;
        this.projects = projects;
        this.education = education;
        this.certifications = certifications;
    }

    public String name() { return name; }
    public String firstName() { return firstName; }
    public String lastName() { return lastName; }
    public String headline() { return headline; }
    public String intro() { return intro; }
    public String about() { return about; }
    public String location() { return location; }
    public String email() { return email; }
    public String phone() { return phone; }
    public String linkedin() { return linkedin; }
    public String github() { return github; }
    public String degree() { return degree; }
    public String cgpa() { return cgpa; }
    public List<Skill> skills() { return skills; }
    public List<Job> jobs() { return jobs; }
    public List<Project> projects() { return projects; }
    public List<Education> education() { return education; }
    public List<Certification> certifications() { return certifications; }

    public static class Skill {
        private String name;
        private String code;
        private String color;

        public Skill(String name, String code, String color) {
            this.name = name;
            this.code = code;
            this.color = color;
        }

        public String name() { return name; }
        public String code() { return code; }
        public String color() { return color; }
    }

    public static class Job {
        private String company;
        private String role;
        private String dates;
        private List<String> points;

        public Job(String company, String role, String dates, List<String> points) {
            this.company = company;
            this.role = role;
            this.dates = dates;
            this.points = points;
        }

        public String company() { return company; }
        public String role() { return role; }
        public String dates() { return dates; }
        public List<String> points() { return points; }
    }

    public static class Project {
        private String name;
        private List<String> tech;
        private List<String> points;

        public Project(String name, List<String> tech, List<String> points) {
            this.name = name;
            this.tech = tech;
            this.points = points;
        }

        public String name() { return name; }
        public List<String> tech() { return tech; }
        public List<String> points() { return points; }
    }

    public static class Education {
        private String title;
        private String place;
        private String years;
        private String score;

        public Education(String title, String place, String years, String score) {
            this.title = title;
            this.place = place;
            this.years = years;
            this.score = score;
        }

        public String title() { return title; }
        public String place() { return place; }
        public String years() { return years; }
        public String score() { return score; }
    }

    public static class Certification {
        private String name;
        private String provider;
        private String duration;

        public Certification(String name, String provider, String duration) {
            this.name = name;
            this.provider = provider;
            this.duration = duration;
        }

        public String name() { return name; }
        public String provider() { return provider; }
        public String duration() { return duration; }
    }
}