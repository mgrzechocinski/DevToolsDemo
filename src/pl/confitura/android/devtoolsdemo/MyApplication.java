package pl.confitura.android.devtoolsdemo;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;

import roboguice.application.RoboApplication;

@ReportsCrashes(formKey = "dE9oMkVQUm5HMFB1SlM3R2tVZmkxU3c6MQ",
        mode = ReportingInteractionMode.NOTIFICATION,
        resNotifTickerText = R.string.crash_notif_ticker_text,
        resNotifTitle = R.string.crash_notif_title,
        resNotifText = R.string.crash_notif_text,
        resNotifIcon = android.R.drawable.stat_notify_error, 
        resDialogText = R.string.crash_dialog_text,
        resDialogIcon = android.R.drawable.ic_dialog_info, 
        resDialogTitle = R.string.crash_dialog_title, 
        resDialogCommentPrompt = R.string.crash_dialog_comment_prompt, 
        resDialogOkToast = R.string.crash_dialog_ok_toast 
)
public class MyApplication extends RoboApplication {

	@Override
    public void onCreate() {
        ACRA.init(this);
	}
}
