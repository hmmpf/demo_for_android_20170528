package com.example.demo;
/*********Author:HMMPF***************/
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class fourthactivity extends Activity{
	private SensorManager sensormanager;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		setContentView(R.layout.fourthactivity);

		sensormanager= (SensorManager)getSystemService(Context.SENSOR_SERVICE);
		Sensor sensor=sensormanager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		sensormanager.registerListener(listener, sensor,sensormanager.SENSOR_DELAY_NORMAL);
	}
	
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		if(sensormanager!=null){
			sensormanager.unregisterListener(listener);
		}
	}
	
	private SensorEventListener listener=new SensorEventListener(){
		@Override
		public void onSensorChanged(SensorEvent event){
			float xval=Math.abs(event.values[0]);
			float yval=Math.abs(event.values[1]);
			float zval=Math.abs(event.values[2]);
			if(xval>=13||yval>=13||zval>=13){
				Toast.makeText(fourthactivity.this,"别摇了，听到了！！" , Toast.LENGTH_SHORT).show();
			}
		}
		
		@Override
		public void onAccuracyChanged(Sensor sensor,int accuracy){
			
		}
	};
	
	
	
}