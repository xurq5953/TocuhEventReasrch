package com.example.tocuheventreasrch;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MyButtonClickHandler {
	private Context context;

	public MyButtonClickHandler(Context context) {
		this.context = context;
	}

	public void onClickButton(View view) {
		toast("You set the touch event by DataBinding Method reference");
	}

	public boolean onLongClickButton() {
		toast("You set the touch event by DataBinding Listener bindings");
		return true;
	}

	private void toast(String information) {
		Toast.makeText(context, information, Toast.LENGTH_SHORT).show();
	}
}
