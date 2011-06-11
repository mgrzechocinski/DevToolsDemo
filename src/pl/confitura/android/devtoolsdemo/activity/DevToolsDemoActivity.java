package pl.confitura.android.devtoolsdemo.activity;

import pl.confitura.android.devtoolsdemo.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DevToolsDemoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final TextView editText = (TextView) findViewById(R.id.editText1);

		Button buttonOk = (Button) findViewById(R.id.button1);
		buttonOk.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				new AlertDialog.Builder(DevToolsDemoActivity.this)
						.setMessage(editText.getText()).setCancelable(true)
						.show();
			}
		});
	}
}