package com.facebook;

import af.c;
import af.d;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w0;
import com.facebook.login.q;
import df.n;
import df.y0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import le.v;
import p001if.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "com/bugsnag/android/a0", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class FacebookActivity extends FragmentActivity {

    /* renamed from: a, reason: collision with root package name */
    public Fragment f29898a;

    static {
        Intrinsics.checkNotNullExpressionValue(FacebookActivity.class.getName(), "FacebookActivity::class.java.name");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (Intrinsics.d(null, Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    @Override // androidx.activity.o, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.f29898a;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        FacebookException facebookException;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!v.f83119p.get()) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            v.k(applicationContext);
        }
        setContentView(d.com_facebook_activity_layout);
        if (!Intrinsics.d("PassThrough", intent.getAction())) {
            Intent intent2 = getIntent();
            w0 supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            Fragment F = supportFragmentManager.F("SingleFragment");
            Fragment fragment = F;
            if (F == null) {
                if (Intrinsics.d("FacebookDialogFragment", intent2.getAction())) {
                    n nVar = new n();
                    nVar.setRetainInstance(true);
                    nVar.S6(supportFragmentManager, "SingleFragment");
                    fragment = nVar;
                } else {
                    q qVar = new q();
                    qVar.setRetainInstance(true);
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.g(c.com_facebook_fragment_container, qVar, "SingleFragment", 1);
                    aVar.e(false);
                    fragment = qVar;
                }
            }
            this.f29898a = fragment;
            return;
        }
        Intent requestIntent = getIntent();
        y0 y0Var = y0.f54883a;
        Intrinsics.checkNotNullExpressionValue(requestIntent, "requestIntent");
        Bundle h10 = y0.h(requestIntent);
        if (!a.b(y0.class) && h10 != null) {
            try {
                String string = h10.getString("error_type");
                if (string == null) {
                    string = h10.getString("com.facebook.platform.status.ERROR_TYPE");
                }
                String string2 = h10.getString("error_description");
                if (string2 == null) {
                    string2 = h10.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                }
                facebookException = (string == null || !z.i(string, "UserCanceled", true)) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
            } catch (Throwable th3) {
                a.a(y0.class, th3);
            }
            y0 y0Var2 = y0.f54883a;
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "intent");
            setResult(0, y0.e(intent3, null, facebookException));
            finish();
        }
        facebookException = null;
        y0 y0Var22 = y0.f54883a;
        Intent intent32 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent32, "intent");
        setResult(0, y0.e(intent32, null, facebookException));
        finish();
    }
}
