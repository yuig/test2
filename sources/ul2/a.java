package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {
    static {
        Object m13;
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = Class.forName("java.lang.ClassValue");
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (!(m13 instanceof xk2.r)) {
            m13 = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (m13 instanceof xk2.r) {
            m13 = obj;
        }
    }

    public static final d a(b compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        return new d(compute);
    }
}
