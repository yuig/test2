package com.facebook.login;

import android.app.Activity;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f30047a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static r f30048b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    public final synchronized r a(Activity activity) {
        r rVar;
        Activity activity2 = activity;
        synchronized (this) {
            if (activity == null) {
                try {
                    activity2 = le.v.a();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (f30048b == null) {
                f30048b = new r(activity2, le.v.b());
            }
            rVar = f30048b;
        }
        return rVar;
    }
}
