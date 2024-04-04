package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(Model model,
                          @RequestParam(value = "count", required = false) Byte count) {
        if (count == null || count > 5) {
            model.addAttribute("cars", carService.getCars());
            return "/cars";
        }
        model.addAttribute("cars", carService.getSomeCarsByCount(count));
        return "/cars";
    }
}
