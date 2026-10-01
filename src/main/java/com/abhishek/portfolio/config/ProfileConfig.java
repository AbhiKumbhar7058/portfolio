package com.abhishek.portfolio.config;

import com.abhishek.portfolio.model.Profile;
import com.abhishek.portfolio.model.Profile.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProfileConfig {

    @Bean
    public Profile profile() {
        return new Profile(
                "Abhishek Kumbhar",
                "Abhishek",
                "Kumbhar",
                "Java Developer | Spring Boot | Backend Enthusiast",
                "Computer Science and Engineering graduate with hands-on experience in Java, Spring Boot, Hibernate, REST APIs and MySQL. Passionate about building scalable backend solutions and eager to grow in a professional environment as a Java Developer.",
                "I'm a Computer Science and Engineering graduate from Sharad Institute of Technology College of Engineering. I have experience in backend development, API testing and building CRUD-based applications through internships and academic projects. I'm a calm, dedicated and problem-solving person who enjoys teamwork and continuous learning.",
                "Kolhapur, Maharashtra",
                "abhikumbhar112233@gmail.com",
                "+91 70588 51171",
                "www.linkedin.com/in/abhishek-kumbhar1",
                "www.github.com/AbhiKumbhar7058",
                "B.Tech (CSE) – 2025",
                "7.05",

                List.of(
                        new Skill("Java", "J", "#d95f02"),
                        new Skill("Spring Boot", "SB", "#63b64b"),
                        new Skill("Hibernate", "H", "#a38d48"),
                        new Skill("MySQL", "SQL", "#2474a9"),
                        new Skill("REST API", "API", "#4a86d9"),
                        new Skill("Postman", "P", "#f26b38"),
                        new Skill("JDBC", "DB", "#2e78c2"),
                        new Skill("HTML & CSS", "5", "#e34f26"),
                        new Skill("Git", "G", "#ef4a37"),
                        new Skill("VS Code", "VS", "#2979c9")
                ),

                List.of(
                        new Job(
                                "Spordia Softech Pvt. Ltd, Sangli",
                                "Intern – Computer Vision / AI",
                                "Jun 2025 – Dec 2025",
                                List.of(
                                        "Annotated and validated video data in CVAT for sports analytics.",
                                        "Developed Python and OpenCV scripts for frame extraction and the YOLOv5 pipeline.",
                                        "Contributed to YOLOv5 training cycles with annotated datasets."
                                )
                        ),
                        new Job(
                                "Happy Visitors Dot Com, Jaysingpur",
                                "Web Development Intern",
                                "Jan 2024 – Feb 2024",
                                List.of(
                                        "Developed backend logic using Java 8, Spring Boot and Hibernate.",
                                        "Optimised queries and improved database response time.",
                                        "Implemented MVC architecture and tested APIs using Postman."
                                )
                        )
                ),

                List.of(
                        new Project(
                                "Student Management System",
                                List.of("Java", "Spring Boot", "Hibernate", "MySQL"),
                                List.of(
                                        "Implemented CRUD operations using Hibernate ORM.",
                                        "Followed MVC architecture for a clean structure.",
                                        "Deployed on Apache Tomcat with database integration."
                                )
                        ),
                        new Project(
                                "Task Management System",
                                List.of("Java", "Spring Boot", "MySQL"),
                                List.of(
                                        "Role-based access for task creation, assignment and tracking.",
                                        "Designed relational DB schema in MySQL.",
                                        "Tested REST APIs using Postman."
                                )
                        )
                ),

                List.of(
                        new Education(
                                "B.Tech – Computer Science & Engineering",
                                "Sharad Institute of Technology College of Engineering, Ichalkaranji",
                                "2021 – 2025",
                                "CGPA: 7.05"
                        ),
                        new Education(
                                "HSC",
                                "Navajeevan Jr. College, Jaysingpur",
                                "2021",
                                "62.17%"
                        ),
                        new Education(
                                "SSC",
                                "Navajeevan High School, Jaysingpur",
                                "2019",
                                "60.80%"
                        )
                ),

                List.of()
        );
    }
}
