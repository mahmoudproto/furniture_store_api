package com.proto_inc.furniture_store;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class ItemServiceImp implements ItemService{
	
	
	private ItemRepository itemRepository;
	 
	public ItemServiceImp(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	@Override
	public Item saveItem(Item i) {
		return itemRepository.save(i);
	}

	@Override
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

	@Override
	public Item getItemById(long id) {
		Optional<Item> item= itemRepository.findById(id);
		if(item.isPresent())
			return itemRepository.getById(id);
		else
			throw new ConfigDataResourceNotFoundException(null);
	}

}
