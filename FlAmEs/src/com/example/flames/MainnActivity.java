package com.example.flames;



import android.os.Bundle;
import android.content.*;
import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.*;

public class MainnActivity extends Activity {
EditText e1,e2;
Button about,submit,exit,more;
TextView hey;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_PROGRESS);
		setContentView(R.layout.mainn);
		hey=(TextView)findViewById(R.id.hey);
		
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		submit=(Button)findViewById(R.id.s);
		about=(Button)findViewById(R.id.a);
		exit=(Button)findViewById(R.id.e);
		more=(Button)findViewById(R.id.mo);
		submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String ss=e1.getText().toString().trim();
				String sss=e2.getText().toString().trim();
				if(ss.isEmpty()||sss.isEmpty())
				{
					Toast.makeText(getBaseContext(), "Enter name",Toast.LENGTH_SHORT).show();
				}
				else if(ss.isEmpty() && sss.isEmpty())
				{
					Toast.makeText(getBaseContext(), "Enter name",Toast.LENGTH_SHORT).show();
				}
				
				{
					
				}
				char as;
				String ans="";
				
				String sm="";
				for(int i=0;i<ss.length();i++)
				{
				as=ss.charAt(i);
				if(as!=' ')
				
					
				ans=ans+as;
				ss=ss.replace(as, ' ');
								}
				for(int i=0;i<sss.length();i++)
				{
				as=sss.charAt(i);
				if(as!=' ')
				
					
				sm=sm+as;
				sss=sss.replace(as, ' ');
								}
				int k=0;
				char[] cc=new char[20];
				char[] dd=new char[20];
				dd=sm.toCharArray();
				cc=ans.toCharArray();
				for(int r=0;r<ans.length();r++)
				{
					for(int t=0;t<sm.length();t++)
					{
						if(cc[r]==dd[t])
						k++;
							
						
					}
				}
				int len1=ss.length();
				int len2=sss.length();
				int r1=len1-k;
				int r2=len2-k;
				int r3=r1+r2;
				if(r3==3 || r3==5 || r3==14 || r3==16)
				{
					LayoutInflater li = getLayoutInflater();
					View layout = li.inflate(R.layout.ff,
			          (ViewGroup) findViewById(R.id.fff));
			     
			        Toast toast = new Toast(getApplicationContext());
			        toast.setDuration(Toast.LENGTH_SHORT);
			        toast.setGravity(Gravity.FILL, 0, 0);
			        toast.setView(layout);
			        toast.show();
			        Toast.makeText(getBaseContext(), "Best Friends in the World",Toast.LENGTH_SHORT).show();
					
				}
				else if(r3==10)
				{
					LayoutInflater li = getLayoutInflater();
					View layout = li.inflate(R.layout.ll,
			          (ViewGroup) findViewById(R.id.lll));
			     
			        Toast toast = new Toast(getApplicationContext());
			        toast.setDuration(Toast.LENGTH_SHORT);
			        toast.setGravity(Gravity.FILL, 0, 0);
			        toast.setView(layout);
			        toast.show();
			        Toast.makeText(getBaseContext(), "You love her/him",Toast.LENGTH_SHORT).show();
				}
				else if(r3==12 || r3==8 || r3==13)
				{
					LayoutInflater li = getLayoutInflater();
					View layout = li.inflate(R.layout.aa,
			          (ViewGroup) findViewById(R.id.aaa));
			     
			        Toast toast = new Toast(getApplicationContext());
			        toast.setDuration(Toast.LENGTH_SHORT);
			        toast.setGravity(Gravity.FILL, 0, 0);
			        toast.setView(layout);
			        toast.show();
					Toast.makeText(getBaseContext(), "Affection with you!!",Toast.LENGTH_SHORT).show();
				}
				else if(r3==6 || r3==11 || r3==15)
				{
					LayoutInflater li = getLayoutInflater();
					View layout = li.inflate(R.layout.mm,
			          (ViewGroup) findViewById(R.id.mmm));
			     
			        Toast toast = new Toast(getApplicationContext());
			        toast.setDuration(Toast.LENGTH_SHORT);
			        toast.setGravity(Gravity.FILL, 0, 0);
			        toast.setView(layout);
			        toast.show();
			        Toast.makeText(getBaseContext(), "You will Marry him/her",Toast.LENGTH_SHORT).show();
				}
				else if(r3==2 || r3==4 || r3==9 || r3==7)
				{
					LayoutInflater li = getLayoutInflater();
					View layout = li.inflate(R.layout.ee,
			          (ViewGroup) findViewById(R.id.eee));
			     
			        Toast toast = new Toast(getApplicationContext());
			        toast.setDuration(Toast.LENGTH_SHORT);
			        toast.setGravity(Gravity.FILL, 0, 0);
			        toast.setView(layout);
			        toast.show();
				Toast.makeText(getBaseContext(), "He/She is your Enemy...",Toast.LENGTH_SHORT).show();
				}
				else if(r3==1)
				{
					LayoutInflater li = getLayoutInflater();
					View layout = li.inflate(R.layout.ss,
			          (ViewGroup) findViewById(R.id.sss));
			     
			        Toast toast = new Toast(getApplicationContext());
			        toast.setDuration(Toast.LENGTH_SHORT);
			        toast.setGravity(Gravity.FILL, 0, 0);
			        toast.setView(layout);
			        toast.show();
					Toast.makeText(getBaseContext(), "He/She is your Sibling!!",Toast.LENGTH_SHORT).show();
				}
				
			}
		});
		exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ii=new Intent(MainnActivity.this,MainActivity3.class);
				startActivity(ii);
				finish();
			}
		});
		more.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent qu=new Intent(MainnActivity.this,MainActivityt.class);
				startActivity(qu);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mainn, menu);
		return true;
	}

}
