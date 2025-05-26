package org.chromium.base;

import android.content.SharedPreferences;
import dp2.d;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class EarlyTraceEvent {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f97302a = new Object();

    public static boolean a() {
        return false;
    }

    @CalledByNative
    public static boolean getBackgroundStartupTracingFlag() {
        return false;
    }

    @CalledByNative
    public static void setBackgroundStartupTracingFlag(boolean z13) {
        SharedPreferences sharedPreferences;
        sharedPreferences = d.f56043a;
        sharedPreferences.edit().putBoolean("bg_startup_tracing", z13).apply();
    }
}
