package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30742b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f30743a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        if (i13 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f30743a = 0;
            setResult(i14, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.f l13 = com.google.android.gms.common.api.internal.f.l(this);
                if (i14 == -1) {
                    bi.f fVar = l13.f30819n;
                    fVar.sendMessage(fVar.obtainMessage(3));
                } else if (i14 == 0) {
                    l13.n(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i13 == 2) {
            this.f30743a = 0;
            setResult(i14, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f30743a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f30743a = bundle.getInt("resolution");
        }
        if (this.f30743a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                com.bumptech.glide.d.t(num);
                AlertDialog f13 = ih.c.f72257d.f(this, num.intValue(), 2, this);
                if (f13 != null) {
                    ih.c.j(this, f13, "GooglePlayServicesErrorDialog", this);
                }
                this.f30743a = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f30743a = 1;
            } catch (ActivityNotFoundException e13) {
                if (extras.getBoolean("notify_manager", true)) {
                    com.google.android.gms.common.api.internal.f.l(this).n(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String k13 = a.a.k("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        k13 = k13.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", k13, e13);
                }
                this.f30743a = 1;
                finish();
            } catch (IntentSender.SendIntentException e14) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e14);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f30743a);
        super.onSaveInstanceState(bundle);
    }
}
