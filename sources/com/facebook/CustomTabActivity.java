package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.appcompat.app.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z6.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/bugsnag/android/a0", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class CustomTabActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public static final String f29886b = Intrinsics.n(".action_customTabRedirect", "CustomTabActivity");

    /* renamed from: c, reason: collision with root package name */
    public static final String f29887c = Intrinsics.n(".action_destroy", "CustomTabActivity");

    /* renamed from: a, reason: collision with root package name */
    public i0 f29888a;

    @Override // android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        if (i14 == 0) {
            Intent intent2 = new Intent(f29886b);
            intent2.putExtra(CustomTabMainActivity.f29892f, getIntent().getDataString());
            c.a(this).c(intent2);
            i0 i0Var = new i0(this, 5);
            c.a(this).b(i0Var, new IntentFilter(f29887c));
            this.f29888a = i0Var;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f29886b);
        intent.putExtra(CustomTabMainActivity.f29892f, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        i0 i0Var = this.f29888a;
        if (i0Var != null) {
            c.a(this).d(i0Var);
        }
        super.onDestroy();
    }
}
