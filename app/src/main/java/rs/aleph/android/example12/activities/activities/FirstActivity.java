package rs.aleph.android.example12.activities.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.provider.JeloProvider;

// Each activity extends Activity class
public class FirstActivity extends Activity {

	// onCreate method is a lifecycle method called when he activity is starting
	@Override
	protected void onCreate(Bundle savedInstanceState) 	{

		// Each lifecycle method should call the method it overrides
		super.onCreate(savedInstanceState);
		// setContentView method draws UI
		setContentView(R.layout.activity_first);
		final List<String> jelaNazivi = JeloProvider.getJelaNazivi();
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.list_item, jelaNazivi);
		ListView listView = (ListView) findViewById(R.id.listJela);

		listView.setAdapter(dataAdapter);

		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
			intent.putExtra("position", position);
			startActivity(intent);
			}
		});
	}

	// Called when btnStart button is clicked
	public void btnStartActivityClicked(View view) {
		// This is an explicit intent (class property is specified)
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
		// startActivity method starts an activity
        startActivity(intent);
	}

	// Called when btnOpen is clicked
    public void btnOpenBrowserClicked(View view) {
		// This is an implicit intent
        //Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
				Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.www_google_com)));
		// startActivity method starts an activity
		startActivity(i);
    }
}
