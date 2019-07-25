package com.example.flames;

import android.net.Uri;
import android.os.Bundle;
import android.widget.*;
import android.content.*;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity3 extends Activity {
Button f,g,ss;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main_activity3);
		f=(Button)findViewById(R.id.feed);
		g=(Button)findViewById(R.id.get);
		ss=(Button)findViewById(R.id.share);
		ss.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent si=new Intent(Intent.ACTION_SEND);
				si.setType("text/plain");
				String uri="https://play.google.com/store/apps/details?id=com.example.flames";
				si.putExtra(Intent.EXTRA_TEXT,uri);
				startActivity(Intent.createChooser(si, "Share"));
						
			}
		});
		g.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ia=new Intent(MainActivity3.this,MainnActivity.class);
				startActivity(ia);
				finish();
			}
		});
		f.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ij=new Intent(Intent.ACTION_SEND);
				ij.setData(Uri.parse("email"));
				String[] s={"vivivijay57@gmail.com","vivivijay57@gmail.com"};
				ij.putExtra(Intent.EXTRA_EMAIL,s);
				ij.putExtra(Intent.EXTRA_SUBJECT,"Feedback");
				ij.putExtra(Intent.EXTRA_TEXT,"");
				ij.setType("message/rfc822");
				startActivity(Intent.createChooser(ij, "Choose mail app"));
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity3, menu);
		return true;
	}

}
