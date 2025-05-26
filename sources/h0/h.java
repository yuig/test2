package h0;

import c0.g0;
import c0.h0;
import kh2.m0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v.y0;

/* loaded from: classes2.dex */
public final class h implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f66402a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f66403b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f66404c;

    /* renamed from: d, reason: collision with root package name */
    public h0 f66405d;

    public h(g0 g0Var) {
        this.f66402a = g0Var;
    }

    public final void a(long j13, h0 screenFlashListener) {
        Unit unit;
        Intrinsics.checkNotNullParameter(screenFlashListener, "screenFlashListener");
        synchronized (this.f66403b) {
            this.f66404c = true;
            this.f66405d = screenFlashListener;
            Unit unit2 = Unit.f80348a;
        }
        g0 g0Var = this.f66402a;
        if (g0Var != null) {
            ((h) g0Var).a(j13, new y0(this, 1));
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            m0.s("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        Unit unit;
        synchronized (this.f66403b) {
            try {
                if (this.f66404c) {
                    g0 g0Var = this.f66402a;
                    if (g0Var != null) {
                        ((h) g0Var).b();
                        unit = Unit.f80348a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        m0.s("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    m0.X0("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f66404c = false;
                Unit unit2 = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        synchronized (this.f66403b) {
            h0 h0Var = this.f66405d;
            if (h0Var != null) {
                ((y0) h0Var).a();
            }
            this.f66405d = null;
            Unit unit = Unit.f80348a;
        }
    }
}
