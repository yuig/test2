package com.pinterest.framework.multisection.datasource.pagedlist;

import java.util.LinkedHashMap;
import jk2.j1;
import kotlin.jvm.internal.Intrinsics;
import x02.a2;

/* loaded from: classes5.dex */
public abstract class c extends h0 implements nr0.j, qr0.b, w {
    public final nr0.k E;
    public final sq0.f F;
    public final sq0.m G;
    public final uj2.q H;
    public ek2.j I;

    /* renamed from: J, reason: collision with root package name */
    public final LinkedHashMap f49088J;
    public final xk2.v K;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(java.lang.String r20, nr0.k r21, sq0.f r22, sq0.m r23, uj2.q r24, ke0.a[] r25, lk1.a r26, x12.a r27, xt1.d r28, long r29, w01.q0 r31, int r32) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.framework.multisection.datasource.pagedlist.c.<init>(java.lang.String, nr0.k, sq0.f, sq0.m, uj2.q, ke0.a[], lk1.a, x12.a, xt1.d, long, w01.q0, int):void");
    }

    public static final void e0(c cVar, sq0.f fVar, sq0.m mVar, int i13) {
        if (i13 <= 0) {
            return;
        }
        if (fVar == null && mVar == null) {
            return;
        }
        int size = cVar.f49127q.size() - i13;
        if (cVar.d2(size)) {
            if (fVar != null) {
                sq0.f.l(fVar, cVar.d(), size, sq0.y.DOWN);
            }
            if (mVar != null) {
                mVar.l(cVar, size, sq0.y.DOWN);
            }
        }
    }

    @Override // qr0.b
    public final void A1(int i13, dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        u1(i13, model);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, nr0.a
    public gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        gb2.l lVar = (gb2.l) this.f49088J.get(uid);
        if (lVar != null) {
            return new gb2.l[]{lVar};
        }
        return null;
    }

    @Override // wk1.e
    public void E2() {
        wk1.l lVar = new wk1.l(6, new b(this, 0));
        wk1.l lVar2 = new wk1.l(7, a.f49069l);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        this.I = (ek2.j) this.f49129s.F(lVar, lVar2, cVar, a2Var);
        xj2.c F = this.H.F(new wk1.l(10, new b(this, 2)), new wk1.l(11, a.f49071n), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        u(F);
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(20, a.f49067j);
        dVar.getClass();
        xj2.c F2 = pk2.f.j(new j1(dVar, aVar, 0), new qt.b(20, a.f49068k), 2, "filter(...)").F(new wk1.l(8, new b(this, 1)), new wk1.l(9, a.f49070m), cVar, a2Var);
        Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
        u(F2);
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        if (d2(i13)) {
            return q(getItemViewType(i13));
        }
        return false;
    }

    public boolean e(int i13) {
        return this.E.e(i13);
    }

    public boolean f(int i13) {
        return this.E.f(i13);
    }

    @Override // nr0.g
    public final boolean f3(int i13) {
        return this.E.c();
    }

    public int getItemViewType(int i13) {
        return this.E.getItemViewType(i13);
    }

    public boolean h(int i13) {
        return this.E.h(i13);
    }

    @Override // nr0.g
    public final Integer j(int i13) {
        return this.E.j(i13);
    }

    @Override // nr0.g
    public final boolean k2(int i13) {
        return this.E.m();
    }

    public boolean n0(int i13) {
        if (d2(i13)) {
            return f(getItemViewType(i13));
        }
        return false;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, wk1.e
    public void onUnbind() {
        super.onUnbind();
        ek2.j jVar = this.I;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.I = null;
    }

    public boolean q(int i13) {
        return this.E.q(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.w
    public String w2() {
        return "";
    }
}
