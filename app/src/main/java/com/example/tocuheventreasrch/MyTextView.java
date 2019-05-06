package com.example.tocuheventreasrch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatTextView;

public class MyTextView extends AppCompatTextView {
	public MyTextView(Context context) {
		super(context);
	}

	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}



	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				getParent().requestDisallowInterceptTouchEvent(true);
				Log.d("TAG","MyTextView dispatch ACTION_DOWN");
				break;
			case MotionEvent.ACTION_MOVE:
				getParent().requestDisallowInterceptTouchEvent(true);
				Log.d("TAG","MyTextView dispatch ACTION_MOVE");
				break;
			case MotionEvent.ACTION_CANCEL:
				Log.d("TAG","MyTextView dispatch ACTION_CANCEL");
				break;
			case MotionEvent.ACTION_UP:
				getParent().requestDisallowInterceptTouchEvent(true);
				Log.d("TAG","MyTextView dispatch ACTION_UP");
				break;
			default:
				break;
		}
	    return true;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				Log.d("TAG","MyTextView onTouchEvent ACTION_DOWN");
				break;
			case MotionEvent.ACTION_MOVE:
				Log.d("TAG","MyTextView onTouchEvent ACTION_MOVE");
				break;
			case MotionEvent.ACTION_CANCEL:
				Log.d("TAG","MyTextView onTouchEvent ACTION_CANCEL");
				break;
			case MotionEvent.ACTION_UP:
				Log.d("TAG","MyTextView onTouchEvent ACTION_UP");
				break;
			default:
				break;
		}
	//	return super.onTouchEvent(event);
	//	return false;
		return true;
	}

}
