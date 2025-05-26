package q1;

import ao2.m0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import m1.f1;
import r1.p0;

/* loaded from: classes2.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f101937a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final v f101938b = new v(null, 0, false, 0.0f, new i0(0), 0.0f, false, dl2.b.b(kotlin.coroutines.j.f80412a), m0.a(), bs1.c.b(0, 0, 15), q0.f80391a, 0, 0, 0, f1.Vertical, 0, 0);

    public static final h0 a(i2.o oVar) {
        r2.s sVar;
        int i13 = 0;
        Object[] objArr = new Object[0];
        switch (h0.f101906w.f53536a) {
            case 19:
                sVar = h0.f101907x;
                break;
            case 20:
            default:
                sVar = s1.e.I;
                break;
            case 21:
                sVar = p0.f105953u;
                break;
        }
        boolean f13 = ((i2.s) oVar).f(0) | ((i2.s) oVar).f(0);
        i2.s sVar2 = (i2.s) oVar;
        Object J2 = sVar2.J();
        if (f13 || J2 == i2.n.f71185a) {
            J2 = new j0(i13, i13, i13);
            sVar2.g0(J2);
        }
        return (h0) so.a.i(objArr, sVar, (Function0) J2, sVar2, 0, 4);
    }
}
