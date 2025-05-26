package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f33761a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f33762b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static ti.a f33763c;

    public static void a(Context context) {
        if (f33763c == null) {
            ti.a aVar = new ti.a(context);
            f33763c = aVar;
            synchronized (aVar.f117681a) {
                aVar.f117687g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f33762b) {
            try {
                if (f33763c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f33763c.c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f33762b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f33763c.a(f33761a);
                }
                return startService;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
