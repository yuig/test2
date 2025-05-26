package so2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends g {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f114797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r writer, boolean z13) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f114797c = z13;
    }

    @Override // so2.g
    public final void d(byte b13) {
        boolean z13 = this.f114797c;
        String a13 = xk2.y.a(b13);
        if (z13) {
            j(a13);
        } else {
            h(a13);
        }
    }

    @Override // so2.g
    public final void f(int i13) {
        if (this.f114797c) {
            xk2.a0 a0Var = xk2.b0.f135200b;
            j(Integer.toUnsignedString(i13));
        } else {
            xk2.a0 a0Var2 = xk2.b0.f135200b;
            h(Integer.toUnsignedString(i13));
        }
    }

    @Override // so2.g
    public final void g(long j13) {
        if (this.f114797c) {
            xk2.d0 d0Var = xk2.e0.f135207b;
            j(Long.toUnsignedString(j13));
        } else {
            xk2.d0 d0Var2 = xk2.e0.f135207b;
            h(Long.toUnsignedString(j13));
        }
    }

    @Override // so2.g
    public final void i(short s13) {
        if (this.f114797c) {
            xk2.h0 h0Var = xk2.i0.f135212b;
            j(String.valueOf(s13 & 65535));
        } else {
            xk2.h0 h0Var2 = xk2.i0.f135212b;
            h(String.valueOf(s13 & 65535));
        }
    }
}
