package com.example.flames;

import android.os.Bundle;
import android.widget.*;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.content.*;
import android.view.WindowManager;

public class MainActivity4 extends Activity {
Button go;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main_activity4);
		go=(Button)findViewById(R.id.frb);
		go.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent fgo=new Intent(MainActivity4.this,MainActivityt.class);
				startActivity(fgo);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity4, menu);
		return true;
	}

}
