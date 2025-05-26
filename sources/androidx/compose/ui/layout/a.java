package androidx.compose.ui.layout;

import kotlin.jvm.internal.Intrinsics;
import q3.o0;
import q3.y;
import q3.z;
import s3.a1;
import s3.k0;
import u2.q;

/* loaded from: classes2.dex */
public abstract class a {
    public static final Object a(o0 o0Var) {
        Object a13 = o0Var.a();
        z zVar = a13 instanceof z ? (z) a13 : null;
        if (zVar != null) {
            return ((y) zVar).f102275n;
        }
        return null;
    }

    public static final a1 b(a1 a1Var) {
        k0 k0Var = a1Var.f110732l.f110898l;
        while (true) {
            k0 v13 = k0Var.v();
            k0 k0Var2 = null;
            if ((v13 != null ? v13.f110815c : null) == null) {
                a1 V0 = k0Var.f110837y.f110806c.V0();
                Intrinsics.f(V0);
                return V0;
            }
            k0 v14 = k0Var.v();
            if (v14 != null) {
                k0Var2 = v14.f110815c;
            }
            Intrinsics.f(k0Var2);
            k0 v15 = k0Var.v();
            Intrinsics.f(v15);
            k0Var = v15.f110815c;
            Intrinsics.f(k0Var);
        }
    }

    public static final q c(Object obj) {
        return new LayoutIdElement(obj);
    }
}
