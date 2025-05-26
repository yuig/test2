package q2;

import i2.e2;
import i2.f2;
import i2.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f102113a = new Object();

    public static final int a(int i13, int i14) {
        return i13 << (((i14 % 10) * 3) + 1);
    }

    public static final h b(o oVar, int i13, s sVar) {
        h hVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.U(Integer.rotateLeft(i13, 1), f102113a);
        Object J2 = sVar2.J();
        if (J2 == i2.n.f71185a) {
            hVar = new h(sVar, true, i13);
            sVar2.g0(hVar);
        } else {
            Intrinsics.g(J2, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            hVar = (h) J2;
            hVar.u(sVar);
        }
        sVar2.r(false);
        return hVar;
    }

    public static final h c(int i13, s sVar, o oVar) {
        i2.s sVar2 = (i2.s) oVar;
        Object J2 = sVar2.J();
        if (J2 == i2.n.f71185a) {
            J2 = new h(sVar, true, i13);
            sVar2.g0(J2);
        }
        h hVar = (h) J2;
        hVar.u(sVar);
        return hVar;
    }

    public static final boolean d(e2 e2Var, f2 f2Var) {
        if (e2Var != null) {
            if (e2Var instanceof f2) {
                f2 f2Var2 = (f2) e2Var;
                if (!f2Var2.b() || Intrinsics.d(e2Var, f2Var) || Intrinsics.d(f2Var2.f71112c, f2Var.f71112c)) {
                }
            }
            return false;
        }
        return true;
    }
}
