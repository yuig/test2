package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import lb.u0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f33780c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static e0 f33781d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f33782a;

    /* renamed from: b, reason: collision with root package name */
    public final o.a f33783b = new o.a(7);

    public h(Context context) {
        this.f33782a = context;
    }

    public static Task a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (q.n().p(context)) {
            e0 b13 = b(context);
            synchronized (b0.f33762b) {
                try {
                    b0.a(context);
                    int i13 = 0;
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        b0.f33763c.a(b0.f33761a);
                    }
                    b13.c(intent).addOnCompleteListener(new a0(intent, i13));
                } finally {
                }
            }
        } else {
            b(context).c(intent);
        }
        return Tasks.forResult(-1);
    }

    public static e0 b(Context context) {
        e0 e0Var;
        synchronized (f33780c) {
            try {
                if (f33781d == null) {
                    f33781d = new e0(context);
                }
                e0Var = f33781d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return e0Var;
    }

    public final Task c(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f33782a;
        boolean z13 = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z14 = (intent.getFlags() & 268435456) != 0;
        if (z13 && !z14) {
            return a(context, intent);
        }
        u0 u0Var = new u0(3, context, intent);
        o.a aVar = this.f33783b;
        return Tasks.call(aVar, u0Var).continueWithTask(aVar, new androidx.fragment.app.c(10, context, intent));
    }
}
