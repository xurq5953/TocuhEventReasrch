package com.example.tocuheventreasrch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tocuheventreasrch.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		Button button1 = binding.button1;
		Button button2 = binding.button2;
		Button button3 = binding.button3;
		Button button4 = binding.button4;
		MyButtonClickHandler handler = new MyButtonClickHandler(getApplicationContext());
		binding.setHandlers(handler);

		Toolbar toolbar = binding.toolbar;
		setSupportActionBar(toolbar);


		button1.setOnClickListener(v -> {
			toast("You set the touch event by setOnClickListener");
		});

		button2.setOnLongClickListener(v -> {
			toast("You set the touch event by setOnLongClickListener");
			return true;
		});

		button3.setOnTouchListener((View v, MotionEvent e) -> {
			float x = e.getX();
			float y = e.getY();
			switch (e.getAction()){
				case MotionEvent.ACTION_DOWN:
					break;
				case MotionEvent.ACTION_CANCEL:
				case MotionEvent.ACTION_UP:
					v.performClick();
					if (0 < x && x < v.getHeight() && 0 < y && y <v.getWidth())
						toast("You set the touch event by setOnTouchListener");
					break;
			}
			return true;
		});


		button4.setOnCreateContextMenuListener((ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) -> {
			menu.setHeaderTitle("ContextMenu");
			menu.setHeaderIcon(R.drawable.ic_launcher_foreground);
			menu.add(1, 1, MenuItem.SHOW_AS_ACTION_IF_ROOM, "title1");
			menu.add(1, 2, MenuItem.SHOW_AS_ACTION_IF_ROOM, "title2");
			menu.add(1, 3, MenuItem.SHOW_AS_ACTION_IF_ROOM, "title3");
			super.onCreateContextMenu(menu, v, menuInfo);
		});
	}


	@Override
	public boolean onContextItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case 1:
				toast("You select item1");
				break;
			case 2:
				toast("You select item2");
				break;
			case 3:
				toast("You select item3");
				break;

		}
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.button1 :
				toast("You set the touch event by override OnClickListener");
				break;
		}
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
				break;
			case R.id.dispatch:
				Intent intent = new Intent(MainActivity.this, ExperimentActivity.class);
				startActivity(intent);
				break;
		}
		return true;
	}

	private void toast(String information) {
		Toast.makeText(MainActivity.this, information,Toast.LENGTH_SHORT).show();
	}

}
