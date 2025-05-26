package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v1 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f104640a = new v1();

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f104641b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.t.f80448a, "<this>");
        f104641b = bp1.h.a("kotlin.ULong", m0.f104592a);
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104641b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        long j13 = ((xk2.e0) obj).f135208a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.l(f104641b).q(j13);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new xk2.e0(decoder.p(f104641b).i());
    }
}
