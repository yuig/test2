package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q3.l1;

/* loaded from: classes2.dex */
public final class a1 implements k0 {

    /* renamed from: a */
    public final int f17207a;

    /* renamed from: b */
    public final long f17208b;

    /* renamed from: c */
    public final c1 f17209c;

    /* renamed from: d */
    public l1 f17210d;

    /* renamed from: e */
    public boolean f17211e;

    /* renamed from: f */
    public boolean f17212f;

    /* renamed from: g */
    public boolean f17213g;

    /* renamed from: h */
    public y0 f17214h;

    /* renamed from: i */
    public boolean f17215i;

    /* renamed from: j */
    public final /* synthetic */ b1 f17216j;

    public a1(b1 b1Var, int i13, long j13, c1 c1Var) {
        this.f17216j = b1Var;
        this.f17207a = i13;
        this.f17208b = j13;
        this.f17209c = c1Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.k0
    public final void a() {
        this.f17215i = true;
    }

    public final boolean b(a8.t0 t0Var) {
        List list;
        if (!c()) {
            return false;
        }
        Object d2 = ((y) this.f17216j.f17221a.f17322b.invoke()).d(this.f17207a);
        boolean z13 = this.f17210d != null;
        c1 c1Var = this.f17209c;
        if (!z13) {
            long d13 = (d2 == null || c1Var.f17226a.c(d2) < 0) ? c1Var.f17228c : c1Var.f17226a.d(d2);
            long d14 = t0Var.d();
            if ((!this.f17215i || d14 <= 0) && d13 >= d14) {
                return true;
            }
            long nanoTime = System.nanoTime();
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                d();
                Unit unit = Unit.f80348a;
                Trace.endSection();
                long nanoTime2 = System.nanoTime() - nanoTime;
                if (d2 != null) {
                    g1.b0 b0Var = c1Var.f17226a;
                    int c13 = b0Var.c(d2);
                    c1Var.f17226a.g(c1.a(c1Var, nanoTime2, c13 >= 0 ? b0Var.f63233c[c13] : 0L), d2);
                }
                c1Var.f17228c = c1.a(c1Var, nanoTime2, c1Var.f17228c);
            } finally {
            }
        }
        if (!this.f17215i) {
            if (!this.f17213g) {
                if (t0Var.d() <= 0) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    this.f17214h = f();
                    this.f17213g = true;
                    Unit unit2 = Unit.f80348a;
                } finally {
                }
            }
            y0 y0Var = this.f17214h;
            if (y0Var != null) {
                List[] listArr = y0Var.f17328b;
                int i13 = y0Var.f17329c;
                List list2 = y0Var.f17327a;
                if (i13 < list2.size()) {
                    if (!(!y0Var.f17331e.f17212f)) {
                        throw new IllegalStateException("Should not execute nested prefetch on canceled request".toString());
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (y0Var.f17329c < list2.size()) {
                        try {
                            if (listArr[y0Var.f17329c] == null) {
                                if (t0Var.d() <= 0) {
                                    return true;
                                }
                                int i14 = y0Var.f17329c;
                                l0 l0Var = (l0) list2.get(i14);
                                Function1 function1 = l0Var.f17261b;
                                if (function1 == null) {
                                    list = kotlin.collections.q0.f80391a;
                                } else {
                                    j0 j0Var = new j0(l0Var);
                                    function1.invoke(j0Var);
                                    list = j0Var.f17254a;
                                }
                                listArr[i14] = list;
                            }
                            List list3 = listArr[y0Var.f17329c];
                            Intrinsics.f(list3);
                            while (y0Var.f17330d < list3.size()) {
                                if (((a1) list3.get(y0Var.f17330d)).b(t0Var)) {
                                    return true;
                                }
                                y0Var.f17330d++;
                            }
                            y0Var.f17330d = 0;
                            y0Var.f17329c++;
                        } finally {
                        }
                    }
                    Unit unit3 = Unit.f80348a;
                }
            }
        }
        if (!this.f17211e) {
            long j13 = this.f17208b;
            int i15 = (int) (3 & j13);
            int i16 = (((i15 & 2) >> 1) * 3) + ((i15 & 1) << 1);
            if ((((int) (j13 >> 33)) & ((1 << (i16 + 13)) - 1)) - 1 != 0) {
                if ((((1 << (18 - i16)) - 1) & ((int) (j13 >> (i16 + 46)))) - 1 != 0) {
                    long d15 = (d2 == null || c1Var.f17227b.c(d2) < 0) ? c1Var.f17229d : c1Var.f17227b.d(d2);
                    long d16 = t0Var.d();
                    if ((!this.f17215i || d16 <= 0) && d15 >= d16) {
                        return true;
                    }
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        e(j13);
                        Unit unit4 = Unit.f80348a;
                        Trace.endSection();
                        long nanoTime4 = System.nanoTime() - nanoTime3;
                        if (d2 != null) {
                            g1.b0 b0Var2 = c1Var.f17227b;
                            int c14 = b0Var2.c(d2);
                            c1Var.f17227b.g(c1.a(c1Var, nanoTime4, c14 >= 0 ? b0Var2.f63233c[c14] : 0L), d2);
                        }
                        c1Var.f17229d = c1.a(c1Var, nanoTime4, c1Var.f17229d);
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (!this.f17212f) {
            int a13 = ((y) this.f17216j.f17221a.f17322b.invoke()).a();
            int i13 = this.f17207a;
            if (i13 >= 0 && i13 < a13) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.k0
    public final void cancel() {
        if (this.f17212f) {
            return;
        }
        this.f17212f = true;
        l1 l1Var = this.f17210d;
        if (l1Var != null) {
            l1Var.dispose();
        }
        this.f17210d = null;
    }

    public final void d() {
        if (!c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()".toString());
        }
        if (this.f17210d != null) {
            throw new IllegalArgumentException("Request was already composed!".toString());
        }
        b1 b1Var = this.f17216j;
        y yVar = (y) b1Var.f17221a.f17322b.invoke();
        int i13 = this.f17207a;
        Object c13 = yVar.c(i13);
        this.f17210d = b1Var.f17222b.a().k(c13, b1Var.f17221a.a(i13, c13, yVar.d(i13)));
    }

    public final void e(long j13) {
        if (!(!this.f17212f)) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()".toString());
        }
        if (!(!this.f17211e)) {
            throw new IllegalArgumentException("Request was already measured!".toString());
        }
        this.f17211e = true;
        l1 l1Var = this.f17210d;
        if (l1Var == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()".toString());
        }
        int a13 = l1Var.a();
        for (int i13 = 0; i13 < a13; i13++) {
            l1Var.c(i13, j13);
        }
    }

    public final y0 f() {
        l1 l1Var = this.f17210d;
        if (l1Var == null) {
            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states".toString());
        }
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        l1Var.b(new z0(0, j0Var));
        List list = (List) j0Var.f80434a;
        if (list != null) {
            return new y0(this, list);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb3.append(this.f17207a);
        sb3.append(", constraints = ");
        sb3.append((Object) n4.a.k(this.f17208b));
        sb3.append(", isComposed = ");
        sb3.append(this.f17210d != null);
        sb3.append(", isMeasured = ");
        sb3.append(this.f17211e);
        sb3.append(", isCanceled = ");
        return a.a.r(sb3, this.f17212f, " }");
    }
}
