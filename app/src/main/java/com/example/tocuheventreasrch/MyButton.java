package com.example.tocuheventreasrch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatButton;


public class MyButton extends AppCompatButton {


	public MyButton(Context context) {
		super(context);
	}

	public MyButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		float x = event.getX();
		float y = event.getY();
		switch (event.getAction()){
			case MotionEvent.ACTION_DOWN:
				break;
			case MotionEvent.ACTION_CANCEL:
			case MotionEvent.ACTION_UP:
				performClick();
				if (0 < x && x < getHeight() && 0 < y && y < getWidth())
					toast("You set the touch event by override onTouchEvent");
				break;
		}
		return super.onTouchEvent(event);
	}

	private void toast(String information) {
		Toast.makeText(getContext(), information, Toast.LENGTH_SHORT).show();
	}
}
