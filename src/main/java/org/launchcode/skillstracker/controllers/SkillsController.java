package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@ResponseBody
public class SkillsController {

    @RequestMapping
    public String skills(){
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have such skills to show you!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</html>";
    }


    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "form")
    public String skillsList() {
        return "<html>" +
                "<body>" +
                "<form action = 'skillsRank' method = 'post'>" + //submit a request to /hello
                "<h2>Name:</h2>"+
                "<input type = 'text' name='name'>" +
                "<h2>My favorite language:</h2>"+
                "<select name = 'language1' id = 'language-select'>" +
                "<option value='java'>" + "Java" + "</option>" +
                "<option value='javascript'>" + "JavaScript" + "</option>" +
                "<option value='python'>" + "Python" + "</option>" +
                "</select>" +
                "<h2>My second favorite language</h2>"+
                "<select name = 'language2' id = 'language-select'>" +
                "<option value='java'>" + "Java" + "</option>" +
                "<option value='javascript'>" + "JavaScript" + "</option>" +
                "<option value='python'>" + "Python" + "</option>" +
                "</select>" +
                "<h2>My second favorite language</h2>"+
                "<select name = 'language3' id = 'language-select'>" +
                "<option value='java'>" + "Java" + "</option>" +
                "<option value='javascript'>" + "JavaScript" + "</option>" +
                "<option value='python'>" + "Python" + "</option>" +
                "</select>" +
                "<br>"+
                "<br>"+
                "<input type = 'submit' value = 'Submit!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @RequestMapping("skillsRank")
    public String skillsRank(@RequestParam String name,
                             @RequestParam String language1,
                             @RequestParam String language2,
                             @RequestParam String language3){
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</html>";
    }
}
