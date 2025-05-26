package q3;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import i2.z1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e3.b f102228a = new e3.b(4);

    public static final void a(n1 n1Var, u2.q qVar, Function2 function2, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-511989831);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (sVar.j(n1Var) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= sVar.h(qVar) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= sVar.j(function2) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i15 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            int i17 = sVar.P;
            i2.q P0 = com.bumptech.glide.c.P0(sVar);
            u2.q X = ao2.m0.X(sVar, qVar);
            z1 o13 = sVar.o();
            s3.i iVar = s3.i.f110789k;
            if (!(sVar.f71265a instanceof i2.f)) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar.a0();
            if (sVar.O) {
                sVar.n(iVar);
            } else {
                sVar.j0();
            }
            tb.f.f0(sVar, n1Var, n1Var.f102257c);
            tb.f.f0(sVar, P0, n1Var.f102258d);
            tb.f.f0(sVar, function2, n1Var.f102259e);
            s3.k.Qo.getClass();
            tb.f.f0(sVar, o13, s3.j.f110800d);
            tb.f.f0(sVar, X, s3.j.f110799c);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
                ep.b.y(i17, sVar, i17, hVar);
            }
            sVar.r(true);
            if (sVar.z()) {
                sVar.W(-26502501);
                sVar.r(false);
            } else {
                sVar.W(-26580342);
                boolean j13 = sVar.j(n1Var);
                Object J2 = sVar.J();
                if (j13 || J2 == i2.n.f71185a) {
                    J2 = new androidx.activity.a0(n1Var, 10);
                    sVar.g0(J2);
                }
                i2.u.f((Function0) J2, sVar);
                sVar.r(false);
            }
        }
        u2.q qVar2 = qVar;
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 5, n1Var, qVar2, function2);
        }
    }

    public static final void b(u2.q qVar, Function2 function2, i2.o oVar, int i13, int i14) {
        int i15;
        u2.q qVar2;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1298353104);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= sVar.j(function2) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && sVar.z()) {
            sVar.Q();
            qVar2 = qVar;
        } else {
            u2.q qVar3 = i16 != 0 ? u2.n.f120041b : qVar;
            Object J2 = sVar.J();
            if (J2 == i2.n.f71185a) {
                J2 = new n1(m.f102249d);
                sVar.g0(J2);
            }
            int i17 = i15 << 3;
            a((n1) J2, qVar3, function2, sVar, (i17 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | (i17 & 896), 0);
            qVar2 = qVar3;
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new b2.n0(qVar2, function2, i13, i14, 1);
        }
    }
}
