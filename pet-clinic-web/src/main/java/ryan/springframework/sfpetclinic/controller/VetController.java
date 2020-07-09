package ryan.springframework.sfpetclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ryan.springframework.sfpetclinic.service.VetService;

@RequestMapping("/vets")
@Controller
public class VetController {

    @Autowired
    VetService vetService;

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }


}
