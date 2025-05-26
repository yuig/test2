package i1;

import i2.v3;
import j1.o2;
import j1.p2;

/* loaded from: classes2.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1.o1 f70910a = j1.e.q(0.0f, 0.0f, null, 7);

    public static final v3 a(long j13, o2 o2Var, String str, i2.o oVar, int i13, int i14) {
        j1.h0 h0Var = o2Var;
        if ((i14 & 2) != 0) {
            h0Var = f70910a;
        }
        j1.h0 h0Var2 = h0Var;
        if ((i14 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        i2.s sVar = (i2.s) oVar;
        boolean h10 = sVar.h(b3.w.f(j13));
        Object J2 = sVar.J();
        if (h10 || J2 == i2.n.f71185a) {
            J2 = (p2) q0.f70874k.invoke(b3.w.f(j13));
            sVar.g0(J2);
        }
        return j1.i.c(new b3.w(j13), (p2) J2, h0Var2, null, str2, null, sVar, ((i13 << 3) & 896) | ((i13 << 6) & 57344), 8);
    }
}
