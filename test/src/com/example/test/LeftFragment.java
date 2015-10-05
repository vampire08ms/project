package com.example.test;

import android.app.Activity;
import android.app.Fragment;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LeftFragment extends Fragment {

	public static final String Tag = "LeftFragment";
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.left_fragment, container,false);
		Log.d(Tag, "LeftFragment onCreateView");
		return view;
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onAttach(android.app.Activity)
	 */
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		Log.d(Tag, "LeftFragment onAttach");
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.d(Tag, "LeftFragment onCreate");
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onActivityCreated(android.os.Bundle)
	 */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		Log.d(Tag, "LeftFragment onActivityCreated");
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onStart()
	 */
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d(Tag, "LeftFragment onStart");
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onResume()
	 */
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d(Tag, "LeftFragment onResume");
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onPause()
	 */
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d(Tag, "LeftFragment onPause");
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onStop()
	 */
	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d(Tag, "LeftFragment onStop");
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onDestroyView()
	 */
	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		Log.d(Tag, "LeftFragment onDestroyView");
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onDestroy()
	 */
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d(Tag, "LeftFragment onDestroy");
	}

	/* (non-Javadoc)
	 * @see android.app.Fragment#onDetach()
	 */
	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		Log.d(Tag, "LeftFragment onDetach");
	}
	
}
