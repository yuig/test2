package oi;

import java.lang.Thread;

/* loaded from: classes3.dex */
public final class q4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f95060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o4 f95061b;

    public q4(o4 o4Var, String str) {
        this.f95061b = o4Var;
        this.f95060a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th3) {
        this.f95061b.zzj().f95268f.b(th3, this.f95060a);
    }
}
