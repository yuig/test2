package n90;

import b10.z;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import i2.o;
import i2.s;
import java.util.List;
import jk.v;
import k1.n1;
import kh2.g0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.r;
import rq.l2;
import u2.q;

/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final List f90020a;

    static {
        wa0.c cVar = new wa0.c("", 0, 0);
        f90020a = f0.j(cVar, cVar, cVar);
    }

    public static final void a(a state, b style, q qVar, Function1 function1, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(style, "style");
        s sVar = (s) oVar;
        sVar.Y(-1791965782);
        if ((i14 & 4) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 8) != 0) {
            function1 = f.f90000i;
        }
        v1.h a13 = v1.i.a(com.bumptech.glide.d.A(eo1.c.rounding_300, sVar));
        String obj = dl2.b.u2(state.f89988a, sVar).toString();
        q e13 = androidx.compose.foundation.a.e(androidx.compose.ui.draw.a.b(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.m(qVar, style.f89991a), style.f89992b), g0.h(eo1.b.color_themed_light_gray, sVar), a13), a13), false, null, new z(8, function1, state), 7);
        sVar.W(1206323494);
        boolean h10 = sVar.h(obj);
        Object J2 = sVar.J();
        if (h10 || J2 == i2.n.f71185a) {
            J2 = new l2(obj, 26);
            sVar.g0(J2);
        }
        sVar.r(false);
        androidx.compose.foundation.layout.b.a(z3.l.a(e13, false, (Function1) J2), null, false, q2.i.c(-1061003776, new n1(9, state, style), sVar), sVar, 3072, 6);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new r(state, style, qVar, function1, i13, i14, 11);
        }
    }

    public static final void b(c state, q qVar, d dVar, Function1 function1, o oVar, int i13, int i14) {
        d dVar2;
        int i15;
        Intrinsics.checkNotNullParameter(state, "state");
        s sVar = (s) oVar;
        sVar.Y(1740387120);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            float f13 = e.f89999a;
            sVar.W(-30755382);
            sVar.W(-577417984);
            boolean e13 = sVar.e(0.47f) | sVar.e(0.68f);
            Object J2 = sVar.J();
            if (e13 || J2 == i2.n.f71185a) {
                J2 = new d(0.47f, 0.68f);
                sVar.g0(J2);
            }
            sVar.r(false);
            sVar.r(false);
            dVar2 = (d) J2;
            i15 = i13 & (-897);
        } else {
            dVar2 = dVar;
            i15 = i13;
        }
        if ((i14 & 8) != 0) {
            function1 = g.f90001i;
        }
        androidx.compose.foundation.layout.b.a(qVar, null, false, q2.i.c(-345807226, new i1.l(dVar2, qVar, state, function1, 4), sVar), sVar, ((i15 >> 3) & 14) | 3072, 6);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new r((Object) state, qVar, (Object) dVar2, (Object) function1, i13, i14, 12);
        }
    }

    public static final void c(float f13, float f14, float f15, int i13, int i14, o oVar, q qVar, List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        s sVar = (s) oVar;
        sVar.Y(1426662025);
        q qVar2 = (i14 & 16) != 0 ? u2.n.f120041b : qVar;
        int i15 = i13 >> 9;
        v.c(f15, qVar2, null, q2.i.c(-992573192, new j(f13, f14, 0, images), sVar), sVar, (i15 & 14) | 3072 | (i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER), 4);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k(images, f13, f14, f15, qVar2, i13, i14);
        }
    }
}
