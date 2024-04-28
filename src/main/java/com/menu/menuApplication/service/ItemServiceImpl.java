package com.menu.menuApplication.service;

import com.menu.menuApplication.entity.Item;
import com.menu.menuApplication.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> fetchAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Long id) {
        Optional<Item> item = itemRepository.findById(id);
        if (item.isPresent()) {
            return item.get();
        }
        return null;
    }

    @Override
    public Item updateItemById(Long id, Item item) {
        Optional<Item> item1 = itemRepository.findById(id);

        if (item1.isPresent()) {
            Item originalItem = item1.get();

            if (Objects.nonNull(item.getItemName()) && !"".equalsIgnoreCase(item.getItemName())) {
                originalItem.setItemName(item.getItemName());
            }
            if (Objects.nonNull(item.getItemPrice()) && item.getItemPrice() != 0) {
                originalItem.setItemPrice(item.getItemPrice());
            }
            if (Objects.nonNull(item.getItemRating()) && item.getItemRating() != 0) {
                originalItem.setItemRating(item.getItemRating());
            }
            return itemRepository.save(originalItem);
        }
        return null;
    }

    @Override
    public String deleteItemById(Long id) {
        if (itemRepository.findById(id).isPresent()) {
            itemRepository.deleteById(id);
            return "Item deleted successfully";
        }
        return "No such item in the database";
    }
}