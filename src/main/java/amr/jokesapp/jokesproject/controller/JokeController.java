package amr.jokesapp.jokesproject.controller;

import amr.jokesapp.jokesproject.services.JokeService;
import amr.jokesapp.jokesproject.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
   private final JokeService jokeService;


    public JokeController() {
        this.jokeService = new JokeServiceImpl();
    }

    @RequestMapping(path = "/")
    public String getJoke(Model model){
        model.addAttribute("joke",this.jokeService.getRandomJoke());
        return "index";
    }
}
