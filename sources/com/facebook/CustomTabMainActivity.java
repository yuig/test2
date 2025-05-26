package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.i0;
import df.j1;
import df.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z6.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/bugsnag/android/a0", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final String f29889c = Intrinsics.n(".extra_action", "CustomTabMainActivity");

    /* renamed from: d, reason: collision with root package name */
    public static final String f29890d = Intrinsics.n(".extra_params", "CustomTabMainActivity");

    /* renamed from: e, reason: collision with root package name */
    public static final String f29891e = Intrinsics.n(".extra_chromePackage", "CustomTabMainActivity");

    /* renamed from: f, reason: collision with root package name */
    public static final String f29892f = Intrinsics.n(".extra_url", "CustomTabMainActivity");

    /* renamed from: g, reason: collision with root package name */
    public static final String f29893g = Intrinsics.n(".extra_targetApp", "CustomTabMainActivity");

    /* renamed from: h, reason: collision with root package name */
    public static final String f29894h = Intrinsics.n(".action_refresh", "CustomTabMainActivity");

    /* renamed from: i, reason: collision with root package name */
    public static final String f29895i = Intrinsics.n(".no_activity_exception", "CustomTabMainActivity");

    /* renamed from: a, reason: collision with root package name */
    public boolean f29896a = true;

    /* renamed from: b, reason: collision with root package name */
    public i0 f29897b;

    public final void a(Intent intent, int i13) {
        Bundle bundle;
        i0 i0Var = this.f29897b;
        if (i0Var != null) {
            c.a(this).d(i0Var);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f29892f);
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                bundle = j1.q1(parse.getQuery());
                bundle.putAll(j1.q1(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            y0 y0Var = y0.f54883a;
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            Intent e13 = y0.e(intent2, bundle, null);
            if (e13 != null) {
                intent = e13;
            }
            setResult(i13, intent);
        } else {
            y0 y0Var2 = y0.f54883a;
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "intent");
            setResult(i13, y0.e(intent3, null, null));
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.CustomTabMainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.d(f29894h, intent.getAction())) {
            c.a(this).c(new Intent(CustomTabActivity.f29887c));
            a(intent, -1);
        } else if (Intrinsics.d(CustomTabActivity.f29886b, intent.getAction())) {
            a(intent, -1);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f29896a) {
            a(null, 0);
        }
        this.f29896a = true;
    }
}
