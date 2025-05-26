package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes3.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f33437a;

    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            try {
                if (f33437a == null) {
                    u uVar = new u(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    uVar.a(context);
                    f33437a = uVar.b();
                }
                awVar = f33437a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return awVar;
    }
}
