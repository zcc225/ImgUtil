package com.zccpro;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.dennisit.org.util.PictureUtil;
import org.junit.Test;

public class ImgTest {

	@Test
	public void test() throws Exception{
		System.out.println("aa");
		BufferedImage compressImage = PictureUtil.compressImage("C:\\Users\\jhs\\Desktop\\22.jpg", 0.5F, 200, 200, true);
		 ImageIO.write(compressImage, "jpg", new File("C:\\Users\\jhs\\Desktop\\2233.jpg"));
		System.out.println(compressImage);
	}
}
