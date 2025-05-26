package pj0;

import com.pinterest.api.model.f30;
import jk2.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.t;
import lh0.z3;
import m60.g0;
import qa2.h0;
import qz.f0;
import x02.x0;
import x02.z0;
import yk1.v;

/* loaded from: classes5.dex */
public final class m extends d {
    public final nj0.a U;
    public final hk0.m V;
    public final fl0.a W;
    public final x0 X;
    public final z0 Y;
    public final i92.k Z;

    /* renamed from: a0, reason: collision with root package name */
    public final v f100247a0;

    /* renamed from: b0, reason: collision with root package name */
    public final g0 f100248b0;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f100249c0;

    /* renamed from: d0, reason: collision with root package name */
    public final com.pinterest.feature.pin.r f100250d0;

    /* renamed from: e0, reason: collision with root package name */
    public final t f100251e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Function0 f100252f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Function1 f100253g0;

    /* renamed from: h0, reason: collision with root package name */
    public final g70.h f100254h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f100255i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f100256j0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(nj0.a r18, hk0.m r19, java.lang.String r20, boolean r21, pj0.s r22, x02.i2 r23, x02.x0 r24, x02.z0 r25, uk1.d r26, com.pinterest.feature.pin.j r27, nx.d1 r28, qa2.n r29, i92.k r30, yk1.v r31, nr0.l r32, m60.g0 r33, boolean r34, com.pinterest.feature.pin.r r35, m60.w r36, nx.b0 r37, lh0.t r38, jh0.d r39, pj0.r r40, g70.h r41) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pj0.m.<init>(nj0.a, hk0.m, java.lang.String, boolean, pj0.s, x02.i2, x02.x0, x02.z0, uk1.d, com.pinterest.feature.pin.j, nx.d1, qa2.n, i92.k, yk1.v, nr0.l, m60.g0, boolean, com.pinterest.feature.pin.r, m60.w, nx.b0, lh0.t, jh0.d, pj0.r, g70.h):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final String F() {
        return "MORE_IDEAS_PAGED_LIST_CACHE_KEY";
    }

    @Override // pj0.d
    public final f0 f0() {
        String str;
        f0 f0Var = new f0();
        int i13 = k.f100244a[this.V.ordinal()];
        if (i13 == 1) {
            str = this.L;
        } else if (i13 != 2) {
            str = "";
        } else {
            str = this.M;
            Intrinsics.f(str);
        }
        f0Var.e("KEY_MORE_IDEAS_HOST_MODEL_ID", str);
        f0Var.c(((s) this.W).f100266b.getValue(), "referrer");
        t tVar = this.f100251e0;
        tVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) tVar.f83479a;
        if (!g1Var.o("hfp_android_bmi_fieldset_migration", "enabled", z3Var) && !g1Var.l("hfp_android_bmi_fieldset_migration")) {
            f0Var.e("fields", n00.b.a(n00.c.BOARD_NEW_IDEAS));
        }
        f0Var.e("page_size", this.f100248b0.d());
        String str2 = this.f100255i0;
        if (str2 != null) {
            f0Var.e("from_news_id", str2);
        }
        this.f100255i0 = null;
        String str3 = this.U.f90973d;
        if (str3 != null) {
            f0Var.e("request_params", str3);
        }
        return f0Var;
    }

    @Override // pj0.d, mj0.g
    public final void l2(f30 pin, h0 h0Var) {
        String str;
        Intrinsics.checkNotNullParameter(pin, "pin");
        boolean a63 = a6(pin);
        v vVar = this.f100247a0;
        if (a63) {
            this.Z.o(((yk1.a) vVar).f139224a.getString(f70.c.pin_deleted));
        } else {
            boolean z13 = this.f100256j0;
            hk0.m mVar = this.V;
            if (!z13 && this.f100249c0) {
                this.f100250d0.getClass();
                if (!com.pinterest.feature.pin.r.b()) {
                    int i13 = k.f100244a[mVar.ordinal()];
                    ck2.c cVar = ck2.i.f27923c;
                    int i14 = 1;
                    if (i13 == 1) {
                        jk2.m S = this.X.S(this.L);
                        hk2.b bVar = new hk2.b(new f(2, new gd0.c(21, this, pin)), new f(3, new l(this, 0)), cVar);
                        try {
                            S.d(new d0(bVar, 0L));
                            Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
                            u(bVar);
                        } catch (NullPointerException e13) {
                            throw e13;
                        } catch (Throwable th3) {
                            throw n60.o.g(th3, "subscribeActual failed", th3);
                        }
                    } else if (i13 == 2 && (str = this.M) != null) {
                        xj2.c F = this.Y.P(str).F(new f(4, new l(this, i14)), new f(5, a.f100225u), cVar, ck2.i.f27924d);
                        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                        u(F);
                    }
                }
            }
            if (mVar == hk0.m.BOARD) {
                this.f100253g0.invoke(((yk1.a) vVar).f139224a.getString(f70.c.pin_saved));
            }
        }
        super.l2(pin, h0Var);
    }
}
