package com.bugsnag.android;

import android.app.ActivityManager;
import android.os.Process;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f29284b;

    public /* synthetic */ j0(k0 k0Var, int i13) {
        this.f29283a = i13;
        this.f29284b = k0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Long valueOf;
        Object m13;
        int i13 = this.f29283a;
        k0 k0Var = this.f29284b;
        switch (i13) {
            case 0:
                ActivityManager D = kh2.s0.D(k0Var.f29301b);
                if (D == null) {
                    valueOf = null;
                } else {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    D.getMemoryInfo(memoryInfo);
                    valueOf = Long.valueOf(memoryInfo.totalMem);
                }
                if (valueOf != null) {
                    return valueOf;
                }
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    m13 = (Long) Process.class.getDeclaredMethod("getTotalMemory", new Class[0]).invoke(null, new Object[0]);
                } catch (Throwable th3) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    m13 = ue.c.m(th3);
                }
                return (Long) (m13 instanceof xk2.r ? null : m13);
            default:
                return Long.valueOf(k0Var.f29304e.getUsableSpace());
        }
    }
}
