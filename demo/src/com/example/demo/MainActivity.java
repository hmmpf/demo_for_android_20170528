package com.example.demo;
/*********Author:HMMPF***************/
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Button button1=(Button)findViewById(R.id.button1);
		
		/*建立监听*/
		button1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent=new Intent(MainActivity.this,secondactivity.class);
				startActivity(intent);
			}
		});
		
		
		
		Button button2=(Button)findViewById(R.id.button2);
		
		/*建立监听*/
		button2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent=new Intent(MainActivity.this,thirdactivity.class);
				startActivity(intent);
			}
		});
		
		Button liangjingjing=(Button)findViewById(R.id.liangjingjing);
		
		/*建立监听*/
		liangjingjing.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent=new Intent(MainActivity.this,fourthactivity.class);
				startActivity(intent);
			}
		});
		
		Button baojing=(Button)findViewById(R.id.yijianbaojing);
		
		/*建立监听*/
		baojing.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent=new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:110"));
				startActivity(intent);
			}
		});
	}
}