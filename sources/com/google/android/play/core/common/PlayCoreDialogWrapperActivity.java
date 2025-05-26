package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f33386a;

    @Override // android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i13, i14, intent);
        if (i13 == 0 && (resultReceiver = this.f33386a) != null) {
            if (i14 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i14 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f33386a = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f33386a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            ResultReceiver resultReceiver = this.f33386a;
            if (resultReceiver != null) {
                resultReceiver.send(3, new Bundle());
            }
            finish();
            return;
        }
        try {
            startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            ResultReceiver resultReceiver2 = this.f33386a;
            if (resultReceiver2 != null) {
                resultReceiver2.send(3, new Bundle());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f33386a);
    }
}
