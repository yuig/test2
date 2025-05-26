package w1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final float f127235a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f127236b;

    static {
        float f13 = 25;
        f127235a = f13;
        f127236b = (f13 * 2.0f) / 2.4142137f;
    }

    public static final void a(b2.l lVar, u2.q qVar, long j13, i2.o oVar, int i13, int i14) {
        int i15;
        long j14;
        int i16;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1776202187);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? sVar.h(lVar) : sVar.j(lVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= sVar.h(qVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                j14 = j13;
                if (sVar.g(j13)) {
                    i16 = RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    i15 |= i16;
                }
            } else {
                j14 = j13;
            }
            i16 = RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            i15 |= i16;
        } else {
            j14 = j13;
        }
        if ((i15 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
            } else if ((i14 & 4) != 0) {
                i15 &= -897;
                j14 = y2.h.f136670b;
            }
            sVar.s();
            int i17 = i15 & 14;
            boolean z13 = i17 == 4 || ((i15 & 8) != 0 && sVar.j(lVar));
            Object J2 = sVar.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new q0.e(lVar, 17);
                sVar.g0(J2);
            }
            c0.d.b(lVar, u2.b.f120014b, q2.i.c(-1653527038, new a(j14, z3.l.a(qVar, false, (Function1) J2)), sVar), sVar, i17 | 432);
        }
        long j15 = j14;
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new b(lVar, qVar, j15, i13, i14, 0);
        }
    }

    public static final void b(u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(694251107);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            androidx.compose.foundation.layout.a.a(ao2.m0.p(androidx.compose.foundation.layout.e.k(qVar, f127236b, f127235a), t3.p.f116119m, e.f127227j), sVar);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new c(qVar, i13, i14, 0);
        }
    }
}
