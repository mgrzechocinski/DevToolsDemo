package pl.confitura.android.devtoolsdemo.activity;

import pl.confitura.android.devtoolsdemo.R;
import roboguice.activity.RoboActivity;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DevToolsDemoActivity extends RoboActivity {

	@InjectView(R.id.editText1)
	private TextView editText;

	@InjectView(R.id.button1)
	private Button buttonOk;

	@InjectResource(R.string.hello)
	private String helloResource;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		buttonOk.setOnClickListener(new OnClickListener() {

			String msg = helloResource + "," + editText.getText() + "!";

			public void onClick(View v) {
				new AlertDialog.Builder(DevToolsDemoActivity.this)
						.setMessage(msg).setCancelable(true).show();
			}
		});
	}
}