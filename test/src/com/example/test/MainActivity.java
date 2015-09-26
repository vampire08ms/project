package com.example.test;

import android.support.v7.app.ActionBarActivity;
import android.R.integer;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	Button hermitIntentButton = null;
	Button secondButton = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		hermitIntentButton = (Button) findViewById(R.id.button1);
		secondButton = (Button) findViewById(R.id.Button01);

		hermitIntentButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/* 隐式Intent跳转 */
				// Intent intent= new Intent("com.example.test.ACTION_START");
				/* 增加类型 */
				// intent.addCategory("com.example.test.MY_CATEGORY");
				/* 跳转第三方应用 */
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.bing.com"));
				startActivity(intent);
			}
		});

		secondButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String data = "Hello SecondActivity";
				Intent intent = new Intent(MainActivity.this,
						SecondActivity.class);
				intent.putExtra("extra_data", data);
				startActivityForResult(intent, 1);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	protected void onActivityResult(int requestCode, int resultCode,
			Intent data) {
		switch (requestCode) {
		case 1:
			if (resultCode == RESULT_OK) {
				String returnedDataString = data.getStringExtra("data_return");
				Log.d("MainActivity", returnedDataString);
			}
			break;

		default:
			break;
		}
	}
}
