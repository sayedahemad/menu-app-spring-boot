package com.menu.menuApplication.service;

import com.menu.menuApplication.entity.Item;

import java.util.List;

public interface ItemService {

    Item saveItem(Item item);

    List<Item> fetchAllItems();

    Item getItemById(Long id);

    Item updateItemById(Long id, Item item);

    String deleteItemById(Long id);
}