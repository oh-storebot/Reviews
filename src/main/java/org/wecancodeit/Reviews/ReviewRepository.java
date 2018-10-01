package org.wecancodeit.Reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class ReviewRepository {

private Map<Long, Reviews> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Reviews bbq = new Reviews(1L, "BBQ Review", "/images/bbq.jpg", "food", "This bbq is great");
		Reviews chicken = new Reviews(2L, "Chicken Review", "/images/chicken.jpg", "food", "This chicken is good");
		Reviews fish = new Reviews(3L, "Fish Review", "/images/fish.jpg", "food", "This fish is fishy");
		
		reviewList.put(bbq.getId(), bbq);
		reviewList.put(chicken.getId(), chicken);
		reviewList.put(fish.getId(), fish);
	}
	
	//for testing purposes only
	public ReviewRepository(Reviews...reviews) {
		for(Reviews review : reviews) {
		reviewList.put(review.getId(), review);
		}
	}

	public Reviews findOne(long id) {
		// TODO Auto-generated method stub
		return reviewList.get(id);
	}

	public Collection<Reviews> findAll() {
		
		return reviewList.values();
	}
}
