package com.jiaown.lightswitch;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;
import android.os.Build;

public class MainActivity extends Activity implements OnCheckedChangeListener{
	
	private ToggleButton tb;
	private ImageView img;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//³õÊ¼»¯¿Ø¼þ
		tb = (ToggleButton) findViewById(R.id.toggleButton1);
		img = (ImageView) findViewById(R.id.imageView1);
		
		tb.setOnCheckedChangeListener(this);
	}
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		
		img.setBackgroundResource(isChecked?R.drawable.on:R.drawable.off);
		
	}



}
