package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y1 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final y1 f104667a = new y1();

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f104668b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.n0.f80438a, "<this>");
        f104668b = bp1.h.a("kotlin.UShort", i1.f104570a);
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104668b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        short s13 = ((xk2.i0) obj).f135213a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.l(f104668b).t(s13);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new xk2.i0(decoder.p(f104668b).q());
    }
}
