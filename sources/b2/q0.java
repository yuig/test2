package b2;

import a.sc;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.Intrinsics;
import w1.l1;
import w1.r2;
import w1.y1;

/* loaded from: classes2.dex */
public final class q0 implements y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f21204b;

    public /* synthetic */ q0(t0 t0Var, int i13) {
        this.f21203a = i13;
        this.f21204b = t0Var;
    }

    @Override // w1.y1
    public final void a() {
    }

    @Override // w1.y1
    public final void b() {
        switch (this.f21203a) {
            case 0:
                t0 t0Var = this.f21204b;
                t0.b(t0Var, null);
                t0Var.f21232q.setValue(null);
                break;
            default:
                f();
                break;
        }
    }

    @Override // w1.y1
    public final void c(long j13) {
        r2 d2;
        r2 d13;
        r2 d14;
        int i13 = this.f21203a;
        t0 t0Var = this.f21204b;
        switch (i13) {
            case 0:
                long k13 = t0Var.k(true);
                float f13 = d0.f21130a;
                long d15 = com.bumptech.glide.c.d(a3.c.d(k13), a3.c.e(k13) - 1.0f);
                l1 l1Var = t0Var.f21219d;
                if (l1Var != null && (d2 = l1Var.d()) != null) {
                    long e13 = d2.e(d15);
                    t0Var.f21228m = e13;
                    t0Var.f21232q.setValue(new a3.c(e13));
                    t0Var.f21230o = 0L;
                    t0Var.f21231p.setValue(w1.v0.Cursor);
                    t0Var.u(false);
                    break;
                }
                break;
            default:
                if (t0Var.j()) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = t0Var.f21231p;
                    if (((w1.v0) parcelableSnapshotMutableState.getValue()) == null) {
                        parcelableSnapshotMutableState.setValue(w1.v0.SelectionEnd);
                        t0Var.f21233r = -1;
                        t0Var.m();
                        l1 l1Var2 = t0Var.f21219d;
                        if (l1Var2 == null || (d14 = l1Var2.d()) == null || !d14.c(j13)) {
                            l1 l1Var3 = t0Var.f21219d;
                            if (l1Var3 != null && (d13 = l1Var3.d()) != null) {
                                int a13 = t0Var.f21217b.a(d13.b(j13, true));
                                h4.f0 e14 = t0.e(t0Var.l().f67559a, b7.c.h(a13, a13));
                                t0Var.h(false);
                                j3.a aVar = t0Var.f21224i;
                                if (aVar != null) {
                                    ((j3.b) aVar).a(9);
                                }
                                t0Var.f21218c.invoke(e14);
                            }
                        } else if (t0Var.l().f67559a.f21571a.length() != 0) {
                            t0Var.h(false);
                            t0Var.f21229n = Integer.valueOf((int) (t0.c(t0Var, h4.f0.a(t0Var.l(), null, b4.p0.f21639b, 5), j13, true, false, q.f21200b, true) >> 32));
                        }
                        t0Var.r(w1.w0.None);
                        t0Var.f21228m = j13;
                        t0Var.f21232q.setValue(new a3.c(j13));
                        t0Var.f21230o = 0L;
                        break;
                    }
                }
                break;
        }
    }

    @Override // w1.y1
    public final void d() {
        switch (this.f21203a) {
            case 0:
                t0 t0Var = this.f21204b;
                t0.b(t0Var, null);
                t0Var.f21232q.setValue(null);
                break;
        }
    }

    @Override // w1.y1
    public final void e(long j13) {
        r2 d2;
        j3.a aVar;
        r2 d13;
        int i13 = this.f21203a;
        t0 t0Var = this.f21204b;
        switch (i13) {
            case 0:
                t0Var.f21230o = a3.c.h(t0Var.f21230o, j13);
                l1 l1Var = t0Var.f21219d;
                if (l1Var != null && (d2 = l1Var.d()) != null) {
                    t0Var.f21232q.setValue(new a3.c(a3.c.h(t0Var.f21228m, t0Var.f21230o)));
                    h4.y yVar = t0Var.f21217b;
                    a3.c i14 = t0Var.i();
                    Intrinsics.f(i14);
                    int a13 = yVar.a(d2.b(i14.f482a, true));
                    long h10 = b7.c.h(a13, a13);
                    if (!b4.p0.a(h10, t0Var.l().f67560b)) {
                        l1 l1Var2 = t0Var.f21219d;
                        if ((l1Var2 == null || ((Boolean) l1Var2.f127371q.getValue()).booleanValue()) && (aVar = t0Var.f21224i) != null) {
                            ((j3.b) aVar).a(9);
                        }
                        t0Var.f21218c.invoke(t0.e(t0Var.l().f67559a, h10));
                        break;
                    }
                }
                break;
            default:
                if (t0Var.j() && t0Var.l().f67559a.f21571a.length() != 0) {
                    t0Var.f21230o = a3.c.h(t0Var.f21230o, j13);
                    l1 l1Var3 = t0Var.f21219d;
                    if (l1Var3 != null && (d13 = l1Var3.d()) != null) {
                        t0Var.f21232q.setValue(new a3.c(a3.c.h(t0Var.f21228m, t0Var.f21230o)));
                        Integer num = t0Var.f21229n;
                        sc scVar = q.f21200b;
                        if (num == null) {
                            a3.c i15 = t0Var.i();
                            Intrinsics.f(i15);
                            if (!d13.c(i15.f482a)) {
                                int a14 = t0Var.f21217b.a(d13.b(t0Var.f21228m, true));
                                h4.y yVar2 = t0Var.f21217b;
                                a3.c i16 = t0Var.i();
                                Intrinsics.f(i16);
                                if (a14 == yVar2.a(d13.b(i16.f482a, true))) {
                                    scVar = q.f21199a;
                                }
                                h4.f0 l13 = t0Var.l();
                                a3.c i17 = t0Var.i();
                                Intrinsics.f(i17);
                                t0.c(t0Var, l13, i17.f482a, false, false, scVar, true);
                                int i18 = b4.p0.f21640c;
                            }
                        }
                        Integer num2 = t0Var.f21229n;
                        int intValue = num2 != null ? num2.intValue() : d13.b(t0Var.f21228m, false);
                        a3.c i19 = t0Var.i();
                        Intrinsics.f(i19);
                        int b13 = d13.b(i19.f482a, false);
                        if (t0Var.f21229n != null || intValue != b13) {
                            h4.f0 l14 = t0Var.l();
                            a3.c i23 = t0Var.i();
                            Intrinsics.f(i23);
                            t0.c(t0Var, l14, i23.f482a, false, false, scVar, true);
                            int i182 = b4.p0.f21640c;
                        }
                    }
                    t0Var.u(false);
                    break;
                }
                break;
        }
    }

    public final void f() {
        t0 t0Var = this.f21204b;
        t0.b(t0Var, null);
        t0Var.f21232q.setValue(null);
        t0Var.u(true);
        t0Var.f21229n = null;
        boolean b13 = b4.p0.b(t0Var.l().f67560b);
        t0Var.r(b13 ? w1.w0.Cursor : w1.w0.Selection);
        l1 l1Var = t0Var.f21219d;
        if (l1Var != null) {
            l1Var.f127367m.setValue(Boolean.valueOf(!b13 && jk.r.q(t0Var, true)));
        }
        l1 l1Var2 = t0Var.f21219d;
        if (l1Var2 != null) {
            l1Var2.f127368n.setValue(Boolean.valueOf(!b13 && jk.r.q(t0Var, false)));
        }
        l1 l1Var3 = t0Var.f21219d;
        if (l1Var3 == null) {
            return;
        }
        l1Var3.f127369o.setValue(Boolean.valueOf(b13 && jk.r.q(t0Var, true)));
    }

    @Override // w1.y1
    public final void onCancel() {
        switch (this.f21203a) {
            case 0:
                break;
            default:
                f();
                break;
        }
    }
}
