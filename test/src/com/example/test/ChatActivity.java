package com.example.test;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class ChatActivity extends ActionBarActivity {

	private ListView msgListView;
	private EditText inputText;
	private Button send;
	private MsgAdapter adapter;
	private List<Msg> msgList = new ArrayList<Msg>();

	private void initMsgs() {
		// TODO Auto-generated method stub
		Msg msg1 = new Msg("Hello guy", Msg.TYPE_RECEIVED);
		Msg msg2 = new Msg("Hello. Who is that", Msg.TYPE_SENT);
		Msg msg3 = new Msg("Hello guy", Msg.TYPE_RECEIVED);

		msgList.add(msg1);
		msgList.add(msg2);
		msgList.add(msg3);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chat);
		initMsgs();
		adapter = new MsgAdapter(ChatActivity.this, R.layout.msg_item, msgList);
		inputText = (EditText) findViewById(R.id.input_text);
		send = (Button) findViewById(R.id.send);
		msgListView = (ListView) findViewById(R.id.listView1);
		msgListView.setAdapter(adapter);

		send.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String content = inputText.getText().toString();
				if (!"".equals(content)) {
					Msg msg = new Msg(content, Msg.TYPE_SENT);
					msgList.add(msg);
					adapter.notifyDataSetChanged();
					msgListView.setSelection(msgList.size());
					inputText.setText("");
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chat, menu);
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
}
