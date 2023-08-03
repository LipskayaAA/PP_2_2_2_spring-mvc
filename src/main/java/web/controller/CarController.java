package web.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.carDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printTable(Model model, @RequestParam(required = false, defaultValue = "5") int count) {


        if(count >= 5) {
            model.addAttribute("carsList", new carDao().getAll());
        } else {
            model.addAttribute("carsList", new carDao().show(count));
        }
        return "cars";
    }
}