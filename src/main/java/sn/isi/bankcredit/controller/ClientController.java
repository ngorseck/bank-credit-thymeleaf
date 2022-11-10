package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @GetMapping("/list")
    public String list() {
        return "clients/list";
    }

    @GetMapping("/add")
    public String add() {
        return "clients/add";
    }
}
