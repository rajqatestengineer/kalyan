package com.quickr;

import org.testng.annotations.Test;

public class AddPost extends Base {

	
	@Test
	public void add_new_post() {
	
		
		Post post = new Post();
		
		post.add_post();
		
	}
	
}
