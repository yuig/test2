package ot1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f97582a;

    public i0(w bitReader) {
        Intrinsics.checkNotNullParameter(bitReader, "bitReader");
        this.f97582a = bitReader;
    }

    public final long a() {
        return (this.f97582a.a() << 63) >> 63;
    }

    public final long b(int i13) {
        if (i13 > 64) {
            throw new RuntimeException("Parse error: Cannot read more than 64 bits into a UInt");
        }
        long j13 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            long a13 = this.f97582a.a();
            xk2.d0 d0Var = xk2.e0.f135207b;
            j13 |= a13 << (63 - i14);
        }
        long j14 = j13 >>> (64 - i13);
        xk2.d0 d0Var2 = xk2.e0.f135207b;
        return j14;
    }
}
