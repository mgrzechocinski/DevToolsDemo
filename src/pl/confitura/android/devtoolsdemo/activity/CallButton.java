package pl.confitura.android.devtoolsdemo.activity;

import pl.confitura.android.devtoolsdemo.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * @author m.grzechocinski@futuremind.com
 */
public class CallButton extends Button implements View.OnClickListener {

	private static final int GREEN = 0xFF04B404;
	private static final String HELPLINE_URI = "123456789";

	public CallButton(Context context, AttributeSet attrs) {
		super(context, attrs);

		Drawable callIco = getResources().getDrawable(R.drawable.ic_call);
		setCompoundDrawablesWithIntrinsicBounds(callIco, null, null, null);

		setTextColor(context.getResources().getColor(R.color.black));
		setTypeface(null, Typeface.BOLD);
		setText(R.string.btn_call);
		setOnClickListener(this);
	}

	private void call(String phoneNo) {
		Intent intent = new Intent(Intent.ACTION_CALL);
		intent.setData(Uri.parse(phoneNo));
		getContext().startActivity(intent);
	}

	public void onClick(View view) {
		call(HELPLINE_URI);
	}

}
