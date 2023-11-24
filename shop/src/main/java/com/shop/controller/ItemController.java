package com.shop.controller;

import com.shop.dto.ItemFormDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @GetMapping("/admin/item/new")
    public String itemForm(Model model) {
        model.addAttribute("itemFromDTO", new ItemFormDTO());
        return "/item/itemForm";
    }
}