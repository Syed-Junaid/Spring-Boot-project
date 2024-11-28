package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DemoItem;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/items")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @PostMapping
    public DemoItem createItem(@RequestBody DemoItem item) {
        return demoService.createItem(item);
    }

    @GetMapping("/{id}")
    public DemoItem getItem(@PathVariable int id) {
        return demoService.getItem(id);
    }

    @PutMapping("/{id}")
    public DemoItem updateItem(@PathVariable int id, @RequestBody DemoItem updatedItem) {
        return demoService.updateItem(id, updatedItem);
    }

    @DeleteMapping("/{id}")
    public DemoItem deleteItem(@PathVariable int id) {
        return demoService.deleteItem(id);
    }

    @GetMapping
    public Map<Integer, DemoItem> getAllItems() {
        return demoService.getAllItems();
    }
}
