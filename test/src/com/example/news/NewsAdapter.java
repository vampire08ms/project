package com.example.news;

import java.util.List;

import com.example.test.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class NewsAdapter extends ArrayAdapter<News> {
	private int resourceId;

	public NewsAdapter(Context context, int textViewResourceId,
			List<News> objects) {
		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
		resourceId = textViewResourceId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.ArrayAdapter#getView(int, android.view.View,
	 * android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		News news = getItem(position);
		View view;
		if (null == convertView) {
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		} else {
			view = convertView;
		}
		TextView newTitleText = (TextView) view.findViewById(R.id.news_title);
		newTitleText.setText(news.getTitle());
		return view;
	}

}
