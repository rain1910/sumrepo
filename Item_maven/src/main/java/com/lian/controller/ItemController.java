package com.lian.controller;

import com.lian.domain.Item;
import com.lian.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/show/{id}")
    public String showItem( @PathVariable("id") int id, Model model) {
        Item item = itemService.findById(id);
        model.addAttribute("item", item);
        return "item";
    }
}
