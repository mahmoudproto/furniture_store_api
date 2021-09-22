package com.proto_inc.furniture_store;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/items")
public class ItemController {

	private ItemService itemService;

	public ItemController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}
	
	@CrossOrigin()
	@PostMapping
	public ResponseEntity<Item> saveItem(@RequestBody Item item){
		return new ResponseEntity<Item>(itemService.saveItem(item), HttpStatus.CREATED);
	}
	
	@CrossOrigin()
	@GetMapping
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}
	
	@CrossOrigin()
	@GetMapping("{id}")
	public ResponseEntity<Item> getItemById(@PathVariable("id") long id){
		return new ResponseEntity<Item>(itemService.getItemById(id), HttpStatus.OK);
	}
	
}
