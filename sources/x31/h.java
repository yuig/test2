package x31;

import ao2.m0;
import c2.d6;
import i2.f2;
import i2.z1;
import kh2.a1;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;
import p1.c1;
import p1.e1;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f131623a = new b(u41.d.f120480a, oz1.e.filter_bar_label_default);

    /* renamed from: b, reason: collision with root package name */
    public static final d f131624b = new d(u41.d.f120481b);

    public static final void a(b state, u2.q qVar, d dVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-633917885);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        d dVar2 = (i14 & 4) != 0 ? f131624b : dVar;
        e1 a13 = c1.a(p1.l.f98543a, u2.b.f120023k, sVar, 48);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
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
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        sVar.W(-639190016);
        int i17 = state.f131616b;
        if (i17 != 0) {
            d6.b(a1.D0(i17, sVar), null, g0.h(eo1.b.color_text_default, sVar), 0L, null, null, null, 0L, null, new m4.j(3), 0L, 0, false, 0, 0, null, fc0.c.f61685b, sVar, 0, 0, 65018);
            androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.m(nVar, com.bumptech.glide.d.A(eo1.c.space_200, sVar)), sVar);
        }
        sVar.r(false);
        u41.d.a(state.f131615a, null, dVar2.f131619a, sVar, 8, 2);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 1, qVar2, state, dVar2);
        }
    }

    public static final d b() {
        return f131624b;
    }
}
