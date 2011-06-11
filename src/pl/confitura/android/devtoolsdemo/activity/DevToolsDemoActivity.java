package pl.confitura.android.devtoolsdemo.activity;

import pl.confitura.android.devtoolsdemo.MyClass;
import pl.confitura.android.devtoolsdemo.R;
import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.inject.Inject;

public class DevToolsDemoActivity extends RoboActivity {

	@InjectView(R.id.button1)
	private Button buttonOk;

	@Inject
	private MyClass myClass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		buttonOk.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				throw new RuntimeException("ACRA should catch it!");
			}
		});
	}
}