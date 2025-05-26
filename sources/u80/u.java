package u80;

import b10.z;
import b3.w;
import c2.c0;
import i2.f2;
import java.util.List;
import kh2.g0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final List f120983a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f120984b;

    static {
        List j13 = f0.j(new h(), new h(), new h());
        f120983a = j13;
        f120984b = f0.j(t80.t.b(t80.t.f116737a, j13), t80.t.b(t80.t.f116738b, j13), t80.t.b(t80.t.f116739c, j13));
    }

    public static final void a(t80.d state, u2.q qVar, Function1 function1, k kVar, i2.o oVar, int i13, int i14) {
        int i15;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1635518272);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function1 = q.f120974i;
        }
        if ((i14 & 8) != 0) {
            kVar = l.a(sVar);
            i15 = i13 & (-7169);
        } else {
            i15 = i13;
        }
        androidx.compose.foundation.layout.b.a(qVar, null, false, q2.i.c(-284630506, new c0(kVar, state, function1, 4), sVar), sVar, ((i15 >> 3) & 14) | 3072, 6);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((u50.o) state, qVar, (Object) function1, (Object) kVar, i13, i14, 7);
        }
    }

    public static final void b(j jVar, u2.q qVar, Function1 function1, k kVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1661672722);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        Function1 function12 = (i14 & 4) != 0 ? p.f120973i : function1;
        k a13 = (i14 & 8) != 0 ? l.a(sVar) : kVar;
        float A = com.bumptech.glide.d.A(eo1.c.rounding_500, sVar);
        u2.q d2 = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.e.m(qVar2, a13.f120958a), a13.f120959b);
        Integer num = jVar.f120951e;
        sVar.W(649074379);
        w wVar = num == null ? null : new w(g0.h(num.intValue(), sVar));
        sVar.r(false);
        u2.q b13 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.a.b(d2, wVar != null ? wVar.f21392a : jVar.f120952f, v1.i.a(A)), v1.i.a(A));
        sVar.W(649083029);
        Object J2 = sVar.J();
        if (J2 == i2.n.f71185a) {
            J2 = d7.g.o(sVar);
        }
        sVar.r(false);
        androidx.compose.foundation.layout.b.a(androidx.compose.foundation.a.d(b13, (o1.l) J2, null, false, null, new z(6, function12, jVar), 28), null, false, q2.i.c(1361314008, new c0(jVar, function12, a13, 3), sVar), sVar, 3072, 6);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((u50.o) jVar, qVar2, (Object) function12, (Object) a13, i13, i14, 6);
        }
    }
}
