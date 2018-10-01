package org.wecancodeit.Reviews;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class ReviewsController {

	@Resource
	ReviewRepository reviewRepo;

	@RequestMapping("/show-reviews")
	public String findAllCReviews(Model model) {
		model.addAttribute("courses", reviewRepo.findAll());
		return"reviews";
	}
	
	@RequestMapping("/review")
	public String findOneReview(@RequestParam(value="id") Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
	}
	
}
