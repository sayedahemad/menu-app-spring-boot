package com.menu.menuApplication.controller;

import com.menu.menuApplication.entity.Item;
import com.menu.menuApplication.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://3.20.1.164/:5173")
@RestController
@CrossOrigin
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/api/items")
    public Item saveItem(@RequestBody Item item) {

        return itemService.saveItem(item);
    }

    @GetMapping("/api/items")
    public List<Item> getAllItems() {

        return itemService.fetchAllItems();
    }

    @GetMapping("/api/items/{id}")
    public Item getItemById(@PathVariable("id") Long id) {
        return itemService.getItemById(id);
    }

    @PutMapping("/api/items/{id}")
    public Item updateItem(@PathVariable("id") Long id, @RequestBody Item item) {
        return itemService.updateItemById(id, item);
    }

    @DeleteMapping("/api/items/{id}")
    public String deleteItem(@PathVariable("id") Long id) {
        return itemService.deleteItemById(id);
    }
}