package com.example.flames;

import android.os.Bundle;
import android.content.*;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.*;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;

public class MainActivity extends Activity {
	TextView t,a,p,to,star;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		t=(TextView)findViewById(R.id.t);
		a=(TextView)findViewById(R.id.a);
		p=(TextView)findViewById(R.id.p);
		to=(TextView)findViewById(R.id.to);
		star=(TextView)findViewById(R.id.start);
		
		Animation an=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom);
		t.startAnimation(an);
		Animation sn=AnimationUtils.loadAnimation(getBaseContext(), R.anim.zoom2);
		a.startAnimation(sn);
		Animation tn=AnimationUtils.loadAnimation(getBaseContext(), R.anim.z3);
		p.startAnimation(tn);
		Animation fn=AnimationUtils.loadAnimation(getBaseContext(), R.anim.z4);
		to.startAnimation(fn);
		Animation ffn=AnimationUtils.loadAnimation(getBaseContext(), R.anim.z5);
		star.startAnimation(ffn);
		

		
		
		final Context c=null;

		
	}
	public void click(View v)
	{
		Intent i=new Intent(MainActivity.this,MainnActivity.class);
		startActivity(i);
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
