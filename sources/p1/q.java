package p1;

import i2.f2;
import i2.z1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f98570a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f98571b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final p f98572c = p.f98565a;

    public static final void a(u2.q qVar, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-211209833);
        if ((i13 & 6) == 0) {
            i14 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = 1;
        if ((i14 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            int i16 = sVar.P;
            u2.q X = ao2.m0.X(sVar, qVar);
            z1 o13 = sVar.o();
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
            tb.f.f0(sVar, f98572c, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            tb.f.f0(sVar, X, s3.j.f110799c);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
                ep.b.y(i16, sVar, i16, hVar);
            }
            sVar.r(true);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.t0(qVar, i13, i15);
        }
    }

    public static final void b(q3.b1 b1Var, q3.c1 c1Var, q3.o0 o0Var, n4.k kVar, int i13, int i14, u2.e eVar) {
        u2.e eVar2;
        Object a13 = o0Var.a();
        n nVar = a13 instanceof n ? (n) a13 : null;
        q3.b1.e(b1Var, c1Var, ((nVar == null || (eVar2 = nVar.f98557n) == null) ? eVar : eVar2).a(lb.l0.d(c1Var.f102178a, c1Var.f102179b), lb.l0.d(i13, i14), kVar));
    }

    public static final HashMap c(boolean z13) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z13, u2.b.f120013a);
        d(hashMap, z13, u2.b.f120014b);
        d(hashMap, z13, u2.b.f120015c);
        d(hashMap, z13, u2.b.f120016d);
        d(hashMap, z13, u2.b.f120017e);
        d(hashMap, z13, u2.b.f120018f);
        d(hashMap, z13, u2.b.f120019g);
        d(hashMap, z13, u2.b.f120020h);
        d(hashMap, z13, u2.b.f120021i);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z13, u2.i iVar) {
        hashMap.put(iVar, new t(iVar, z13));
    }

    public static final q3.p0 e(u2.e eVar, boolean z13) {
        q3.p0 p0Var = (q3.p0) (z13 ? f98570a : f98571b).get(eVar);
        return p0Var == null ? new t(eVar, z13) : p0Var;
    }
}
