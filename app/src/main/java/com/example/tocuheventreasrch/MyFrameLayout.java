package com.example.tocuheventreasrch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyFrameLayout extends FrameLayout {
	public MyFrameLayout(@NonNull Context context) {
		super(context);
	}

	public MyFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public MyFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				Log.d("TAG","MyFrameLayout dispatchs ACTION_DOWN");
				break;
			case MotionEvent.ACTION_MOVE:
				Log.d("TAG","MyFrameLayout dispatchs ACTION_MOVE");
				break;
			case MotionEvent.ACTION_CANCEL:
				Log.d("TAG","MyFrameLayout dispatchs ACTION_CANCEL");
				break;
			case MotionEvent.ACTION_UP:
				Log.d("TAG","MyFrameLayout dispatchs ACTION_UP");
				break;
			default:
				break;
		}
		return super.dispatchTouchEvent(event);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		Log.d("TAG","MyFrameLayout intercepts touchEvents");
		if(ev.getAction() == MotionEvent.ACTION_DOWN)
			return false;
		else return true;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				Log.d("TAG","MyFrameLayout onTouchEvent ACTION_DOWN");
				break;
			case MotionEvent.ACTION_MOVE:
				Log.d("TAG","MyFrameLayout onTouchEvent ACTION_MOVE");
				break;
			case MotionEvent.ACTION_CANCEL:
				Log.d("TAG","MyFrameLayout onTouchEvent ACTION_CANCEL");
				break;
			case MotionEvent.ACTION_UP:
				Log.d("TAG","MyFrameLayout onTouchEvent ACTION_UP");
				break;
			default:
				break;
		}
		return super.onTouchEvent(event);
	}




}
