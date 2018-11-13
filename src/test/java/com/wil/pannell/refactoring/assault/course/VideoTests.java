package com.wil.pannell.refactoring.assault.course;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VideoTests {
  @Ignore
	@Test(expected=CustomerUnderageException.class)
	public void customerMustBeOverTwelveToRentAVideoRatedTwelve() throws Exception {
		Customer customer = new Customer(null, null, "2004-01-01");
		Video video = new Video(null, Rating.TWELVE);
		video.rentFor(customer);
	}

  @Ignore
	@Test
	public void videoRentedByCustomerOfLegalAgeIsAddedToCustomersRentedVideos() throws Exception {
		Customer customer = new Customer(null, null, "1964-01-01");
		Video video = new Video(null, Rating.TWELVE);
		video.rentFor(customer);
		assertTrue(customer.getRentedVideos().contains(video));
	}
}
