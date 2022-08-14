package com.example.periodictablestudybuddy.Utilities;

import android.util.DisplayMetrics;
import android.view.WindowManager;

public class Dimensions {

	private static Dimensions instance = null;

	private final boolean IS_LANDSCAPE;
	private final short HEIGHT;
	private final short WIDTH;
	
	public static Dimensions getInstance() {
		if (instance == null) {
		    System.out.println("Dimensions instance doesn't exist!");
		}
		return instance;
	}

	public static void setInstance(WindowManager windowManager) {
		if (instance == null) {
			DisplayMetrics displayMetrics = new DisplayMetrics();
			windowManager.getDefaultDisplay().getMetrics(displayMetrics);
			instance = new Dimensions(displayMetrics);
		} else {
			System.out.println("Dimensions instance exists already!");
		}
	}

	private Dimensions(DisplayMetrics displayMetrics) {
		HEIGHT = (short)(displayMetrics.widthPixels);
		WIDTH = (short)(displayMetrics.heightPixels);
		IS_LANDSCAPE = true;
	}

	public short getWidth(float factor) {
	    if (IS_LANDSCAPE) {
	    	return (short) (this.WIDTH * factor);
		} else {
			return (short) (this.HEIGHT * factor);
		}
	}

	public short getHeight(float factor) {
		if (IS_LANDSCAPE) {
			return (short)(this.HEIGHT * factor);
		} else {
			return (short)(this.WIDTH * factor);
		}
	}
}