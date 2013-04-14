package com.notification;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class Notification extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification);
		
		ListView noteListView = (ListView) findViewById(R.id.noteListView);
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		
		noteListView.setAdapter(arrayAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.notification, menu);
		return true;
	}
	public void addNoteToNoteListView(View view) {
		EditText noteTitle = (EditText) findViewById(R.id.noteTitle);
		EditText noteText = (EditText) findViewById(R.id.noteText);
		
		ListView noteListView = (ListView) findViewById(R.id.noteListView);
		ArrayAdapter<String> arrayAdapter =  (ArrayAdapter<String>) noteListView.getAdapter();

		arrayAdapter.add(noteTitle.getText().toString() + " - " + noteText.getText().toString());
		
		noteListView.setAdapter(arrayAdapter);
		
	}
}
