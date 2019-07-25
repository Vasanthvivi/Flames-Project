package com.example.flames;

import android.os.Bundle;
import android.widget.*;
import android.app.Activity;
import android.content.*;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivityt extends Activity {
Button friend,love,aff,mar,ene,sib,back;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main_activityt);
		friend=(Button)findViewById(R.id.fr);
		love=(Button)findViewById(R.id.lo);
		aff=(Button)findViewById(R.id.Af);
		mar=(Button)findViewById(R.id.ma);
		ene=(Button)findViewById(R.id.en);
		sib=(Button)findViewById(R.id.si);
		back=(Button)findViewById(R.id.tbk);
		friend.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent fr=new Intent(MainActivityt.this,MainActivity4.class);
				startActivity(fr);
				finish();
			}
		});
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent bk=new Intent(MainActivityt.this,MainnActivity.class);
				startActivity(bk);
				finish();
			}
		});
		love.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent il=new Intent(MainActivityt.this,MainActivityl.class);
				startActivity(il);
				finish();
			}
		});
		aff.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ia=new Intent(MainActivityt.this,MainActivityaf.class);
				startActivity(ia);
				finish();
			}
		});
mar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent im=new Intent(MainActivityt.this,MainActivitymar.class);
				startActivity(im);
				finish();
			}
		});
ene.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent ie=new Intent(MainActivityt.this,MainActivityenemy.class);
		startActivity(ie);
		finish();
	}
});
sib.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent isi=new Intent(MainActivityt.this,MainActivitysib.class);
		startActivity(isi);
		finish();
	}
});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activityt, menu);
		return true;
	}

}
