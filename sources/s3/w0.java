package s3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w0 extends a {
    @Override // s3.a
    public final long b(q1 q1Var, long j13) {
        a1 V0 = q1Var.V0();
        Intrinsics.f(V0);
        long j14 = V0.f110733m;
        return a3.c.h(com.bumptech.glide.c.d((int) (j14 >> 32), (int) (j14 & 4294967295L)), j13);
    }

    @Override // s3.a
    public final Map c(q1 q1Var) {
        a1 V0 = q1Var.V0();
        Intrinsics.f(V0);
        return V0.E0().c();
    }

    @Override // s3.a
    public final int d(q1 q1Var, q3.a aVar) {
        a1 V0 = q1Var.V0();
        Intrinsics.f(V0);
        return V0.i(aVar);
    }
}
