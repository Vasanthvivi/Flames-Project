package com.example.flames;

import android.os.Bundle;
import android.widget.*;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.content.*;
import android.view.WindowManager;

public class MainActivityenemy extends Activity {
Button bh;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main_activityenemy);
		bh=(Button)findViewById(R.id.enemb);
		bh.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent jh=new Intent(MainActivityenemy.this,MainActivityt.class);
				startActivity(jh);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activityenemy, menu);
		return true;
	}

}
