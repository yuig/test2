package androidx.compose.foundation.layout;

import ao2.m0;
import i2.f;
import i2.o;
import i2.s;
import i2.z1;
import kotlin.jvm.internal.Intrinsics;
import p1.g0;
import p1.j1;
import p1.n0;
import s3.h;
import s3.i;
import s3.j;
import s3.k;
import u2.q;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(q qVar, o oVar) {
        j1 j1Var = j1.f98536a;
        s sVar = (s) oVar;
        int i13 = sVar.P;
        q X = m0.X(oVar, qVar);
        z1 o13 = sVar.o();
        k.Qo.getClass();
        i iVar = j.f110798b;
        if (!(sVar.f71265a instanceof f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(oVar, j1Var, j.f110801e);
        tb.f.f0(oVar, o13, j.f110800d);
        tb.f.f0(oVar, X, j.f110799c);
        h hVar = j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i13))) {
            ep.b.y(i13, sVar, i13, hVar);
        }
        sVar.r(true);
    }

    public static g0 b(float f13) {
        return new g0(f13, 0, 0, 0);
    }

    public static final q c(n0 n0Var) {
        return new IntrinsicHeightElement(n0Var);
    }

    public static final q d(q qVar, n0 n0Var) {
        return qVar.j(new IntrinsicWidthElement(n0Var));
    }
}
