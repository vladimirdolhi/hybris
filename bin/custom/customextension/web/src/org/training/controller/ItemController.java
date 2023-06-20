package org.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.data.ItemWithAllAttributesData;
import org.training.facade.ItemWithAllAttributesFacade;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Resource
    private ItemWithAllAttributesFacade itemWithAllAttributesFacade;

    @GetMapping
    public String showAllItems(Model model){
        List<ItemWithAllAttributesData> items = itemWithAllAttributesFacade.getAllItems();
        model.addAttribute("items", items);
        return "itemList";
    }

    @GetMapping("/{name}")
    public String showItem(@PathVariable String name, Model model){
        ItemWithAllAttributesData item = itemWithAllAttributesFacade.getItemData(name);
        model.addAttribute("item", item);
        return "itemDetails";
    }

}
