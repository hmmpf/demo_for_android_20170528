package com.example.demo;
/*********Author:HMMPF***************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class thirdactivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.thirdactivity);
		
		Button buttonrandom=(Button)findViewById(R.id.random);
		
		final ArrayList name_list=new ArrayList();
		
		final ArrayList location_list=new ArrayList();
		final ArrayList act_list=new ArrayList();
		
		try{
			InputStream a=getResources().getAssets().open("name.txt");
			InputStreamReader b=new InputStreamReader(a,"GBK");
			BufferedReader c=new BufferedReader(b);
			String name="";
			String temp="";
			
			while((temp=c.readLine())!=null){
				name_list.add(temp);
			}
			c.close();
			b.close();
			a.close();
		}catch(IOException e){
				e.printStackTrace();
			}
			
			try{
				InputStream a=getResources().getAssets().open("location.txt");
				InputStreamReader b=new InputStreamReader(a,"GBK");
				BufferedReader c=new BufferedReader(b);
				String location="";
				String temp="";
				
				while((temp=c.readLine())!=null){
					location_list.add(temp);
				}
				c.close();
				b.close();
				a.close();
			}catch(IOException e){
					e.printStackTrace();
				}
				
				try{
					InputStream a=getResources().getAssets().open("act.txt");
					InputStreamReader b=new InputStreamReader(a,"GBK");
					BufferedReader c=new BufferedReader(b);
					String act="";
					String temp="";
					while((temp=c.readLine())!=null){
						act_list.add(temp);
					}
					c.close();
					b.close();
					a.close();
				}catch(IOException e){
						e.printStackTrace();
					}
		
		
		final TextView name=(TextView)findViewById(R.id.name);
		final TextView location=(TextView)findViewById(R.id.location);
		final TextView act=(TextView)findViewById(R.id.act);
		Log.e("asdf","jinzhanzhengchang");
		
		buttonrandom.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				int num1=(int)(Math.random()*10);
				int num2=(int)(Math.random()*10);
				int num3=(int)(Math.random()*10);
				
				name.setText((CharSequence) name_list.get(num1));
				location.setText((CharSequence) location_list.get(num2));
				act.setText((CharSequence) act_list.get(num3));
				
			}
		});
		

	}
}