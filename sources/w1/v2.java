package w1;

import android.graphics.Matrix;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.y3;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t3.x3;

/* loaded from: classes2.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final b4.g f127549a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127550b = bs1.c.u1(null, y3.f71400a);

    /* renamed from: c, reason: collision with root package name */
    public b4.g f127551c;

    /* renamed from: d, reason: collision with root package name */
    public final s2.t f127552d;

    public v2(b4.g gVar) {
        b4.g0 g0Var;
        this.f127549a = gVar;
        b4.d dVar = new b4.d(gVar);
        List a13 = gVar.a(gVar.f21571a.length());
        int size = a13.size();
        for (int i13 = 0; i13 < size; i13++) {
            b4.e eVar = (b4.e) a13.get(i13);
            b4.n0 a14 = ((b4.n) eVar.f21542a).a();
            if (a14 != null && (g0Var = a14.f21621a) != null) {
                dVar.a(g0Var, eVar.f21543b, eVar.f21544c);
            }
        }
        this.f127551c = dVar.e();
        this.f127552d = new s2.t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, w1.v2] */
    /* JADX WARN: Type inference failed for: r4v12, types: [u2.q] */
    public final void a(i2.o oVar, int i13) {
        int i14;
        int i15;
        b3.k kVar;
        boolean z13;
        b4.g0 g0Var;
        ?? b13;
        b4.m0 m0Var;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1154651354);
        int i16 = 2;
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            x3 x3Var = (x3) sVar.m(t3.f2.f115993p);
            b4.g gVar = this.f127551c;
            List a13 = gVar.a(gVar.f21571a.length());
            int size = a13.size();
            int i17 = 0;
            while (i17 < size) {
                b4.e eVar = (b4.e) a13.get(i17);
                int i18 = eVar.f21543b;
                int i19 = eVar.f21544c;
                if (i18 != i19) {
                    sVar.W(1383573569);
                    boolean booleanValue = ((Boolean) new r(this, i16).invoke()).booleanValue();
                    int i23 = eVar.f21543b;
                    if (booleanValue && (m0Var = (b4.m0) this.f127550b.getValue()) != null) {
                        kVar = m0Var.k(i23, i19);
                        a3.d b14 = m0Var.b(i23);
                        long d2 = com.bumptech.glide.c.d(m0Var.f(i23) == m0Var.f(i19) ? Math.min(m0Var.b(i19 - 1).f484a, b14.f484a) : 0.0f, b14.f485b) ^ (-9223372034707292160L);
                        Matrix matrix = kVar.f21337d;
                        if (matrix == null) {
                            kVar.f21337d = new Matrix();
                        } else {
                            matrix.reset();
                        }
                        Matrix matrix2 = kVar.f21337d;
                        Intrinsics.f(matrix2);
                        matrix2.setTranslate(a3.c.d(d2), a3.c.e(d2));
                        Matrix matrix3 = kVar.f21337d;
                        Intrinsics.f(matrix3);
                        kVar.f21334a.transform(matrix3);
                    } else {
                        kVar = null;
                    }
                    t2 t2Var = kVar != null ? new t2(kVar) : null;
                    u2.n nVar = u2.n.f120041b;
                    if (t2Var != null && (b13 = androidx.compose.ui.draw.a.b(nVar, t2Var)) != 0) {
                        nVar = b13;
                    }
                    Object J2 = sVar.J();
                    am.d dVar = i2.n.f71185a;
                    if (J2 == dVar) {
                        J2 = d7.g.o(sVar);
                    }
                    o1.l lVar = (o1.l) J2;
                    u2.q g13 = androidx.compose.foundation.a.g(lVar, nVar.j(new y2(new l0.h(this, i23, i19))));
                    n3.n.f89091a.getClass();
                    u2.q P0 = e0.t.P0(g13, n3.o.f89095b);
                    boolean j13 = sVar.j(this) | sVar.h(eVar) | sVar.j(x3Var);
                    Object J3 = sVar.J();
                    if (j13 || J3 == dVar) {
                        J3 = new k1.q(this, eVar, x3Var, 4);
                        sVar.g0(J3);
                    }
                    p1.q.a(androidx.compose.foundation.a.f(P0, lVar, (Function0) J3), sVar, 0);
                    b4.n nVar2 = (b4.n) eVar.f21542a;
                    b4.n0 a14 = nVar2.a();
                    if (a14 == null || (a14.f21621a == null && a14.f21622b == null && a14.f21623c == null && a14.f21624d == null)) {
                        z13 = false;
                        i15 = 2;
                        sVar.W(1386186094);
                        sVar.r(false);
                    } else {
                        sVar.W(1384317910);
                        Object J4 = sVar.J();
                        if (J4 == dVar) {
                            J4 = new m1();
                            sVar.g0(J4);
                        }
                        m1 m1Var = (m1) J4;
                        Object J5 = sVar.J();
                        if (J5 == dVar) {
                            g0Var = null;
                            J5 = new s2(m1Var, lVar, null);
                            sVar.g0(J5);
                        } else {
                            g0Var = null;
                        }
                        i2.u.e(lVar, (Function2) J5, sVar);
                        Object[] objArr = new Object[7];
                        objArr[0] = Boolean.valueOf((m1Var.f127392a.h() & 2) != 0);
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = m1Var.f127392a;
                        objArr[1] = Boolean.valueOf((parcelableSnapshotMutableIntState.h() & 1) != 0);
                        i15 = 2;
                        objArr[2] = Boolean.valueOf((parcelableSnapshotMutableIntState.h() & 4) != 0);
                        b4.n0 a15 = nVar2.a();
                        objArr[3] = a15 != null ? a15.f21621a : g0Var;
                        b4.n0 a16 = nVar2.a();
                        objArr[4] = a16 != null ? a16.f21622b : g0Var;
                        b4.n0 a17 = nVar2.a();
                        objArr[5] = a17 != null ? a17.f21623c : g0Var;
                        b4.n0 a18 = nVar2.a();
                        if (a18 != null) {
                            g0Var = a18.f21624d;
                        }
                        objArr[6] = g0Var;
                        boolean j14 = sVar.j(this) | sVar.h(eVar);
                        Object J6 = sVar.J();
                        if (j14 || J6 == dVar) {
                            J6 = new e.f(this, eVar, m1Var, 8);
                            sVar.g0(J6);
                        }
                        b(objArr, (Function1) J6, sVar, (i14 << 6) & 896);
                        z13 = false;
                        sVar.r(false);
                    }
                    sVar.r(z13);
                } else {
                    i15 = i16;
                    sVar.W(1386199982);
                    sVar.r(false);
                }
                i17++;
                i16 = i15;
            }
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.t0(this, i13, 5);
        }
    }

    public final void b(Object[] objArr, Function1 function1, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2083052099);
        int i14 = (i13 & 48) == 0 ? (sVar.j(function1) ? 32 : 16) | i13 : i13;
        if ((i13 & 384) == 0) {
            i14 |= sVar.j(this) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        sVar.U(-416694679, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i14 |= sVar.j(obj) ? 4 : 0;
        }
        sVar.r(false);
        if ((i14 & 14) == 0) {
            i14 |= 2;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            b20.c cVar = new b20.c(2);
            cVar.b(function1);
            cVar.c(objArr);
            Object[] D = cVar.D(new Object[cVar.C()]);
            int i15 = 1;
            boolean j13 = sVar.j(this) | ((i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 32);
            Object J2 = sVar.J();
            if (j13 || J2 == i2.n.f71185a) {
                J2 = new q(this, function1, i15);
                sVar.g0(J2);
            }
            i2.u.c(D, (Function1) J2, sVar);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new androidx.compose.foundation.lazy.layout.u0(this, objArr, function1, i13, 2);
        }
    }
}
