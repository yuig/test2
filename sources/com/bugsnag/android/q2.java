package com.bugsnag.android;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f29425a;

    public q2(Context context) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.getSharedPreferences("com.bugsnag.android", 0);
        } catch (RuntimeException unused) {
            sharedPreferences = null;
        }
        this.f29425a = sharedPreferences;
    }

    public final String a(boolean z13) {
        SharedPreferences sharedPreferences = this.f29425a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("install.iud", null);
    }
}
