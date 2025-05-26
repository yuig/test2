package com.modiface.mfecommon.utils;

import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes7.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    static final String f34361b = "q";

    /* renamed from: a, reason: collision with root package name */
    private long f34362a;

    public q() {
        c();
    }

    public void a(double d2) {
        this.f34362a = SystemClock.elapsedRealtime() + Math.round(d2 * 1000.0d);
    }

    public double b() {
        return d() / 1000.0d;
    }

    public void c() {
        this.f34362a = SystemClock.elapsedRealtime();
    }

    public long d() {
        return SystemClock.elapsedRealtime() - this.f34362a;
    }

    public void b(String str, String str2) {
        Log.d(str, str2 + ": " + b() + " s");
    }

    public void c(String str, String str2) {
        Log.d(str, str2 + ": " + d() + " ms");
    }

    public double a() {
        return 1.0d / b();
    }

    public void b(String str) {
        b(f34361b, str);
    }

    public void c(String str) {
        c("Timer", str);
    }

    public void a(String str, String str2) {
        Log.d(str, str2 + ": " + a() + " fps");
    }

    public void a(String str) {
        a(f34361b, str);
    }
}
