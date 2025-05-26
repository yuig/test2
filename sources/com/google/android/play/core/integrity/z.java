package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f33521a;

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            try {
                if (f33521a == null) {
                    q qVar = new q(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    qVar.a(context);
                    f33521a = qVar.b();
                }
                sVar = f33521a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return sVar;
    }
}
