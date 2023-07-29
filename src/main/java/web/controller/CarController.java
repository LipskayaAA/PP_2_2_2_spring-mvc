package web.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printTable(Model model, @RequestParam(required = false, defaultValue = "5") Integer count) {
        if(count.compareTo(5) > 0 || count.compareTo(0) < 0) {
            count = 5;
        }
        List<Car> carsList = Arrays.asList(
                new Car(1, "Toyota",  10),
                new Car(2, "BMW",  3),
                new Car(3, "Mercedes",  15),
                new Car(4, "Hyundai",  40),
                new Car(5, "Kia", 20));
        model.addAttribute("carsList", carsList.subList(0, count));
        return "cars";
    }

}