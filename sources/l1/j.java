package l1;

import b2.x0;
import i2.f2;
import k1.z;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final s2.t f81336a = new s2.t();

    public static void b(j jVar, i1.j jVar2, boolean z13, x0 x0Var) {
        u2.n nVar = u2.n.f120041b;
        jVar.getClass();
        i iVar = new i(0, jVar2, nVar, null, x0Var, z13);
        Object obj = q2.i.f102113a;
        jVar.f81336a.add(new q2.h(iVar, true, 262103052));
    }

    public final void a(c cVar, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1320309496);
        int i14 = (i13 & 6) == 0 ? (sVar.h(cVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= sVar.h(this) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            s2.t tVar = this.f81336a;
            int size = tVar.size();
            for (int i15 = 0; i15 < size; i15++) {
                ((kl2.l) tVar.get(i15)).invoke(cVar, sVar, Integer.valueOf(i14 & 14));
            }
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new z(this, cVar, i13, 1);
        }
    }
}
