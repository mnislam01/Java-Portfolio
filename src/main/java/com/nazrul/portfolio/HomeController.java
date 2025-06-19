package com.nazrul.portfolio;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    private final ProjectRepository projectRepository;

    public HomeController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping("/")
    public String home() {
        return "home"; // This will render home.html
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // This will render about.html
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("projects", projectRepository.findAll());
        return "projects"; // This will render about.html
    }

    @GetMapping("/contacts")
    public String contact() {
        return "contacts"; // This will render contact.html
    }
}
