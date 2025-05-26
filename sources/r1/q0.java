package r1;

import kotlin.jvm.functions.Function0;
import m1.f1;

/* loaded from: classes2.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f105973a;

    static {
        q1.i0 i0Var = new q1.i0(1);
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        f1 f1Var = f1.Vertical;
        dl2.b.b(kotlin.coroutines.j.f80412a);
        f105973a = new a0(null, 0, false, 0.0f, i0Var, false, 0, y.f106016m, q0Var, 0, 0, 0, f1Var, 0, 0);
    }

    public static final p0 a(i2.o oVar) {
        r2.s sVar;
        int i13 = 0;
        Object[] objArr = new Object[0];
        switch (p0.f105952t.f53536a) {
            case 19:
                sVar = q1.h0.f101907x;
                break;
            case 20:
            default:
                sVar = s1.e.I;
                break;
            case 21:
                sVar = p0.f105953u;
                break;
        }
        int i14 = 1;
        boolean f13 = ((i2.s) oVar).f(0) | ((i2.s) oVar).f(0);
        i2.s sVar2 = (i2.s) oVar;
        Object J2 = sVar2.J();
        if (f13 || J2 == i2.n.f71185a) {
            J2 = new q1.j0(i13, i13, i14);
            sVar2.g0(J2);
        }
        return (p0) so.a.i(objArr, sVar, (Function0) J2, sVar2, 0, 4);
    }
}
