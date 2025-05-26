package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import s7.z;

/* loaded from: classes3.dex */
public class LineAuthenticationActivity extends Activity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34082d = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f34083a = false;

    /* renamed from: b, reason: collision with root package name */
    public LineAuthenticationStatus f34084b;

    /* renamed from: c, reason: collision with root package name */
    public f f34085c;

    public final void a(LineLoginResult lineLoginResult) {
        LineAuthenticationStatus lineAuthenticationStatus = this.f34084b;
        if (lineAuthenticationStatus == null) {
            finish();
            return;
        }
        h hVar = lineAuthenticationStatus.f34090e;
        if ((hVar != h.STARTED || this.f34083a) && hVar != h.INTENT_HANDLED) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("authentication_result", lineLoginResult);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        if (this.f34084b.f34090e == h.STARTED) {
            f fVar = this.f34085c;
            if (i13 != 3) {
                fVar.getClass();
            } else {
                if (fVar.f34110h.f34090e == h.INTENT_RECEIVED) {
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new e(fVar), 1000L);
            }
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        LineAuthenticationStatus lineAuthenticationStatus;
        super.onCreate(bundle);
        setContentView(rn.h.linesdk_activity_lineauthentication);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null && data.getScheme().equals("lineauth")) {
            f.f34102i = intent;
            finish();
            return;
        }
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) intent.getParcelableExtra("authentication_config");
        LineAuthenticationParams lineAuthenticationParams = (LineAuthenticationParams) intent.getParcelableExtra("authentication_params");
        if (lineAuthenticationConfig == null || lineAuthenticationParams == null) {
            a(LineLoginResult.b("The requested parameter is illegal."));
            return;
        }
        if (bundle == null) {
            lineAuthenticationStatus = new LineAuthenticationStatus();
        } else {
            lineAuthenticationStatus = (LineAuthenticationStatus) bundle.getParcelable("authentication_status");
            if (lineAuthenticationStatus == null) {
                lineAuthenticationStatus = new LineAuthenticationStatus();
            }
        }
        this.f34084b = lineAuthenticationStatus;
        this.f34085c = new f(this, lineAuthenticationConfig, lineAuthenticationStatus, lineAuthenticationParams);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f34084b.f34090e == h.STARTED) {
            this.f34085c.a(intent);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        h hVar = this.f34084b.f34090e;
        if (hVar == h.INIT) {
            f fVar = this.f34085c;
            LineAuthenticationActivity lineAuthenticationActivity = fVar.f34103a;
            LineAuthenticationStatus lineAuthenticationStatus = fVar.f34110h;
            lineAuthenticationStatus.getClass();
            lineAuthenticationStatus.f34090e = h.STARTED;
            PKCECode pKCECode = new PKCECode(bo.a.a(64));
            lineAuthenticationStatus.f34086a = pKCECode;
            try {
                z a13 = fVar.f34107e.a(lineAuthenticationActivity, fVar.f34104b, pKCECode, fVar.f34109g);
                if (a13.f111345a) {
                    lineAuthenticationActivity.startActivity((Intent) a13.f111346b, (Bundle) a13.f111348d);
                } else {
                    lineAuthenticationActivity.startActivityForResult((Intent) a13.f111346b, 3, (Bundle) a13.f111348d);
                }
                lineAuthenticationStatus.f34087b = (String) a13.f111347c;
            } catch (ActivityNotFoundException e13) {
                lineAuthenticationStatus.f34090e = h.INTENT_HANDLED;
                lineAuthenticationActivity.a(LineLoginResult.a(rn.c.INTERNAL_ERROR, new LineApiError(e13, rn.a.LOGIN_ACTIVITY_NOT_FOUND)));
            }
        } else if (hVar != h.INTENT_RECEIVED) {
            f fVar2 = this.f34085c;
            fVar2.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new e(fVar2), 1000L);
        }
        this.f34083a = false;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authentication_status", this.f34084b);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f34083a = true;
    }
}
