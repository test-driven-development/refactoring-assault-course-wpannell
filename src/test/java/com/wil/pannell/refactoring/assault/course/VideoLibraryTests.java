package com.wil.pannell.refactoring.assault.course;

import static org.junit.Assert.*;

import com.wil.pannell.refactoring.assault.course.Rating;
import com.wil.pannell.refactoring.assault.course.Video;
import com.wil.pannell.refactoring.assault.course.VideoLibrary;
import org.junit.Test;


public class VideoLibraryTests {

	@Test
	public void videosAddedToLibraryAreAvailableToRent() throws Exception {
		VideoLibrary videoLibrary = new VideoLibrary();
		Video video = new Video("Jaws", Rating.FIFTEEN);
		videoLibrary.addVideo(video);
		assertTrue(videoLibrary .hasVideo("Jaws"));
	}
	
	@Test
	public void videosNotAddedToLibraryAreAvailableToRent() throws Exception {
		VideoLibrary videoLibrary = new VideoLibrary();
		assertFalse(videoLibrary .hasVideo("Jaws"));
	}
	
}
