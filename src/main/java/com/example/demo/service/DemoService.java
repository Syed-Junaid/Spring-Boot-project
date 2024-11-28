package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.DemoItem;

@Service
public class DemoService {
    private final Map<Integer, DemoItem> inMemoryDatabase = new HashMap<>();

    public DemoItem createItem(DemoItem item) {
        inMemoryDatabase.put(item.getId(), item);
        return item;
    }

    public DemoItem getItem(int id) {
        return inMemoryDatabase.get(id);
    }

    public DemoItem updateItem(int id, DemoItem updatedItem) {
        inMemoryDatabase.put(id, updatedItem);
        return updatedItem;
    }

    public DemoItem deleteItem(int id) {
        return inMemoryDatabase.remove(id);
    }

    public Map<Integer, DemoItem> getAllItems() {
        return inMemoryDatabase;
    }
}
