package com.example.tocuheventreasrch;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewConfigurationCompat;
import androidx.databinding.DataBindingUtil;

import com.example.tocuheventreasrch.databinding.ActivityExperimentBinding;

public class ExperimentActivity extends AppCompatActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_experiment);
		ActivityExperimentBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_experiment);
		Toolbar toolbar = binding.toolbar;
		MyTextView textView = binding.myTextView;
		setSupportActionBar(toolbar);



//		textView.setOnClickListener(v -> {
//
//		});
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		switch (ev.getAction()) {
			case MotionEvent.ACTION_DOWN:
				Log.d("TAG","ExperimentActivity dispatch ACTION_DOWN");
				break;
			case MotionEvent.ACTION_MOVE:
				Log.d("TAG","ExperimentActivity dispatch ACTION_MOVE");
				break;
			case MotionEvent.ACTION_CANCEL:
				Log.d("TAG","ExperimentActivity dispatch ACTION_CANCEL");
				break;
			case MotionEvent.ACTION_UP:
				Log.d("TAG","ExperimentActivity dispatch ACTION_UP");
				break;
			default:
				break;
		}
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				Log.d("TAG","ExperimentActivity onTouchEvent ACTION_DOWN");
				break;
			case MotionEvent.ACTION_MOVE:
				Log.d("TAG","ExperimentActivity onTouchEvent ACTION_MOVE");
				break;
			case MotionEvent.ACTION_CANCEL:
				Log.d("TAG","ExperimentActivity onTouchEvent ACTION_CANCEL");
				break;
			case MotionEvent.ACTION_UP:
				Log.d("TAG","ExperimentActivity onTouchEvent ACTION_UP");
				break;
			default:
				break;
		}
		return super.onTouchEvent(event);
	//	return true;
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.toolbar,menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.touch_set:
				Intent intent = new Intent(ExperimentActivity.this, MainActivity.class);
				startActivity(intent);
				break;
			case R.id.dispatch:
				break;
		}
		return true;
	}

	private void toast(String information) {
		Toast.makeText(ExperimentActivity.this, information,Toast.LENGTH_SHORT).show();
	}
}
