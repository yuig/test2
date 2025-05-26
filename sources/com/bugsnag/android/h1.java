package com.bugsnag.android;

import android.os.StrictMode;
import java.lang.Thread;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class h1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    public final o f29259c;

    /* renamed from: d, reason: collision with root package name */
    public final u1 f29260d;

    /* renamed from: b, reason: collision with root package name */
    public final m3 f29258b = new m3();

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f29257a = Thread.getDefaultUncaughtExceptionHandler();

    public h1(g2 g2Var, u1 u1Var) {
        this.f29259c = g2Var;
        this.f29260d = u1Var;
    }

    public final void a(Thread thread, Throwable th3) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f29257a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th3);
        } else {
            System.err.printf("Exception in thread \"%s\" ", thread.getName());
            this.f29260d.a("Exception", th3);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th3) {
        String str;
        m3 m3Var = this.f29258b;
        o oVar = this.f29259c;
        if (oVar.f29367a.d(th3)) {
            a(thread, th3);
            return;
        }
        m3Var.getClass();
        boolean startsWith = ((Throwable) kh2.c3.n0(th3).get(r0.size() - 1)).getClass().getName().toLowerCase(Locale.US).startsWith("android.os.strictmode");
        x1 x1Var = new x1(0);
        if (startsWith) {
            String a13 = m3.a(th3.getMessage());
            x1 x1Var2 = new x1(0);
            x1Var2.a("StrictMode", "Violation", a13);
            str = a13;
            x1Var = x1Var2;
        } else {
            str = null;
        }
        String str2 = startsWith ? "strictMode" : "unhandledException";
        if (startsWith) {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            oVar.e(th3, x1Var, str2, str);
            StrictMode.setThreadPolicy(threadPolicy);
        } else {
            oVar.e(th3, x1Var, str2, null);
        }
        a(thread, th3);
    }
}
