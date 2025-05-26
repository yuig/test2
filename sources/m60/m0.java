package m60;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import ey.j3;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m0 extends m implements at1.h {
    public static final /* synthetic */ int O = 0;
    public final xk2.v F;
    public final xk2.v G;
    public final xk2.v H;
    public final xk2.v I;

    /* renamed from: J, reason: collision with root package name */
    public final xk2.v f85932J;
    public final xk2.v K;
    public final xk2.v L;
    public final xk2.v M;
    public final k0 N;

    public m0() {
        xk2.m.b(new j0(this, 3));
        xk2.m.b(new j0(this, 10));
        this.F = xk2.m.b(new j0(this, 2));
        this.G = xk2.m.b(new j0(this, 7));
        this.H = xk2.m.b(new j0(this, 9));
        this.I = xk2.m.b(new j0(this, 6));
        this.f85932J = xk2.m.b(new j0(this, 1));
        xk2.m.b(new j0(this, 0));
        this.K = xk2.m.b(new j0(this, 11));
        this.L = xk2.m.b(new j0(this, 8));
        xk2.m.b(new j0(this, 4));
        this.M = xk2.m.b(new j0(this, 5));
        this.N = new k0(this);
        j3 j3Var = j3.f60510a;
        j3.f60511b = SystemClock.uptimeMillis();
    }

    @Override // at1.d, kb0.a, android.content.ContextWrapper
    public final void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        ik.a.c(this, false);
    }

    @Override // at1.d
    public final void e() {
        nx.d0 d0Var = this.f85925t;
        if (d0Var == null) {
            d0Var = ((nx.m) ((nx.f0) this.f85927v.getValue())).a(new qr.k());
        }
        this.f85925t = d0Var;
        d0Var.I();
    }

    @Override // m60.m
    public final n60.s i() {
        return (n60.s) this.M.getValue();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        hf0.b.r(this);
        as1.d.b(getResources());
        as1.b.f20420j = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
    
        r0 = kotlin.text.StringsKt__StringsKt.split$default(r0, new java.lang.String[]{","}, false, 0, 6, null);
     */
    @Override // kb0.a, android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 2810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.m0.onCreate():void");
    }

    @Override // at1.h
    public final boolean onResourcesError(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return false;
    }

    @Override // at1.h
    public final void onResourcesReady(int i13) {
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        ReentrantLock reentrantLock = this.f20445j;
        reentrantLock.lock();
        try {
            Iterator it = this.f20444i.entrySet().iterator();
            while (it.hasNext()) {
                ((at1.k) ((Map.Entry) it.next()).getKey()).onTrimMemory(i13);
            }
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
            super.onTrimMemory(i13);
            if (i13 == 15) {
                d().h("Received TRIM_MEMORY_RUNNING_CRITICAL");
                return;
            }
            if (i13 == 20) {
                ((hs1.m) hs1.t.a()).j();
                d().h("Received TRIM_MEMORY_UI_HIDDEN");
            } else {
                if (i13 != 80) {
                    return;
                }
                ((hs1.m) hs1.t.a()).j();
                d().h("Received TRIM_MEMORY_COMPLETE");
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
