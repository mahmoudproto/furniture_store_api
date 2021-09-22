package com.proto_inc.furniture_store;

import java.util.List;

public interface ItemService {
	
	Item saveItem(Item i);
	List<Item> getAllItems();
	Item getItemById(long id);
	
}
