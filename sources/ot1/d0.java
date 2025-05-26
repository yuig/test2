package ot1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f97548a;

    public d0(i0 multiBitReader) {
        Intrinsics.checkNotNullParameter(multiBitReader, "multiBitReader");
        this.f97548a = multiBitReader;
    }

    public final long a() {
        long b13 = b();
        xk2.d0 d0Var = xk2.e0.f135207b;
        long divideUnsigned = Long.divideUnsigned(b13 + 1, 2L);
        return (b13 & 1) == 0 ? -divideUnsigned : divideUnsigned;
    }

    public final long b() {
        int i13 = 0;
        while (true) {
            i0 i0Var = this.f97548a;
            if (i0Var.a() != 0) {
                long b13 = i0Var.b(i13);
                long j13 = 1 << i13;
                xk2.d0 d0Var = xk2.e0.f135207b;
                return (j13 - 1) + b13;
            }
            i13++;
        }
    }
}
