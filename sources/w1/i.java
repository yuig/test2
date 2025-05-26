package w1;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pair f127288a;

    static {
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        f127288a = new Pair(q0Var, q0Var);
    }

    public static final void a(b4.g gVar, List list, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1794596951);
        int i14 = (i13 & 6) == 0 ? (sVar.h(gVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(list) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                b4.e eVar = (b4.e) list.get(i15);
                kl2.l lVar = (kl2.l) eVar.f21542a;
                h hVar = h.f127272a;
                u2.n nVar = u2.n.f120041b;
                int i16 = sVar.P;
                i2.z1 o13 = sVar.o();
                u2.q X = ao2.m0.X(sVar, nVar);
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
                tb.f.f0(sVar, hVar, s3.j.f110801e);
                tb.f.f0(sVar, o13, s3.j.f110800d);
                s3.h hVar2 = s3.j.f110802f;
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
                    ep.b.y(i16, sVar, i16, hVar2);
                }
                tb.f.f0(sVar, X, s3.j.f110799c);
                lVar.invoke(gVar.subSequence(eVar.f21543b, eVar.f21544c).f21571a, sVar, 0);
                sVar.r(true);
            }
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k1.z(gVar, list, i13, 3);
        }
    }
}
