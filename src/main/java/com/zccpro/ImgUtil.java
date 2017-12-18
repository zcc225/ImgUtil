package com.zccpro;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
/**
 * 图片压缩加水印
 * @author zhangchangchao
 *
 */
public class ImgUtil {
	public static void main(String[] args) {
		/**
		 * 图片压缩
		 */
//		test1("C:\\Users\\jhs\\Desktop\\22.jpg","C:\\Users\\jhs\\Desktop\\2221.jpg");
		
		test11(new  File("C:\\Users\\jhs\\Desktop\\22.jpg"),"C:\\Users\\jhs\\Desktop\\2221.jpg");
//		
		
		/**
		 * 图片加水印
		 */
//		test2("C:\\Users\\jhs\\Desktop\\22.jpg", "C:\\Users\\jhs\\Desktop\\00.jpg", "C:\\Users\\jhs\\Desktop\\2200.jpg");  
		
		
		/**
		 * 图片旋转
		 */
//		test3("C:\\Users\\jhs\\Desktop\\22.jpg",180,"C:\\Users\\jhs\\Desktop\\2221.jpg");
	}

	private static void test2(String oldfilepath,String markpath,String newfilepath) {
		try {
			Thumbnails.of(oldfilepath).scale(0.8)  
			.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(markpath)), 0.5f)  //图片水印路径
			.outputQuality(0.8f).toFile(newfilepath);
			System.out.println("添加水印完成");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 图片压缩
	 */
	
	private static void test1(String oldfilepath,String newfilepath) {
		try {
			Thumbnails.of(oldfilepath) //待压缩图片
			.scale(0.2f) 
			.outputQuality(0.5f) 
			.toFile(newfilepath);//压缩后图片
			System.out.println("压缩完成了");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 图片压缩
	 */
	private static void test11(File oldfilepath,String newfilepath) {
		try {
			Thumbnails.of(oldfilepath) //待压缩图片
			.scale(0.2f) 
			.outputQuality(0.5f) 
			.toFile(newfilepath);//压缩后图片
			System.out.println("压缩完成了");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param oldfilepath
	 * @param num 角度 :eg: 90  180  
	 * @param newfilepath
	 */
	private static void test3(String oldfilepath,int num,String newfilepath){
		try {
			Thumbnails.of(oldfilepath).scale(0.5).rotate(num).toFile(newfilepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
	
	
}
