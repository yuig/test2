package s1;

import kotlin.jvm.functions.Function0;
import m1.f1;

/* loaded from: classes2.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f110535a = 56;

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f110536b;

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f110537c;

    static {
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        f1 f1Var = f1.Horizontal;
        n1.m mVar = n1.m.f88915a;
        q1.i0 i0Var = new q1.i0(2);
        dl2.b.b(kotlin.coroutines.j.f80412a);
        f110536b = new f0(q0Var, 0, 0, 0, f1Var, 0, 0, 0, mVar, i0Var);
        f110537c = new p0();
    }

    public static final long a(z zVar, int i13) {
        int i14 = ((f0) zVar).f110420c;
        f0 f0Var = (f0) zVar;
        long j13 = (i13 * (i14 + f0Var.f110419b)) + (-f0Var.f110423f) + f0Var.f110421d;
        f1 f1Var = f1.Horizontal;
        f1 f1Var2 = f0Var.f110422e;
        long a13 = f0Var.a();
        int i15 = (int) (f1Var2 == f1Var ? a13 >> 32 : a13 & 4294967295L);
        f0Var.f110432o.getClass();
        return ql2.s.b(j13 - (i15 - ql2.s.g(0, 0, i15)), 0L);
    }

    public static final e b(int i13, Function0 function0, i2.o oVar, int i14) {
        r2.s sVar;
        if ((i14 & 1) != 0) {
            i13 = 0;
        }
        Object[] objArr = new Object[0];
        switch (e.H.f53536a) {
            case 19:
                sVar = q1.h0.f101907x;
                break;
            case 20:
            default:
                sVar = e.I;
                break;
            case 21:
                sVar = r1.p0.f105953u;
                break;
        }
        r2.s sVar2 = sVar;
        boolean f13 = ((i2.s) oVar).f(i13) | ((i2.s) oVar).e(0.0f) | ((i2.s) oVar).h(function0);
        i2.s sVar3 = (i2.s) oVar;
        Object J2 = sVar3.J();
        if (f13 || J2 == i2.n.f71185a) {
            J2 = new r0(i13, 0.0f, function0);
            sVar3.g0(J2);
        }
        e eVar = (e) so.a.i(objArr, sVar2, (Function0) J2, sVar3, 0, 4);
        eVar.G.setValue(function0);
        return eVar;
    }
}
