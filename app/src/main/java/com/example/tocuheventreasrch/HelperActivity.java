package com.example.tocuheventreasrch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.TextView;

import com.example.tocuheventreasrch.databinding.ActivityHelperBinding;

public class HelperActivity extends AppCompatActivity {
	private TextView xVelocityText;
	private TextView yVelocityText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_helper);
		ActivityHelperBinding dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_helper);
		xVelocityText = dataBinding.xVelocity;
		yVelocityText = dataBinding.yVelocity;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		VelocityTracker velocityTracker = VelocityTracker.obtain();
		velocityTracker.addMovement(event);
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_MOVE:
				velocityTracker.computeCurrentVelocity(100);
				float xVelocity = velocityTracker.getXVelocity();
				float yVelocity = velocityTracker.getYVelocity();
				xVelocityText.setText("The Velocity of X : " + xVelocity);
				yVelocityText.setText("The Velocity of Y : " + yVelocity);
				break;
			case MotionEvent.ACTION_CANCEL:
				break;
			case MotionEvent.ACTION_UP:
				break;
			default:
				velocityTracker.clear();
				velocityTracker.recycle();
				break;
		}
		return true;
	}
}
