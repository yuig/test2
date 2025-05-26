package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s1 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f104621a = new s1();

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f104622b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.q.f80441a, "<this>");
        f104622b = bp1.h.a("kotlin.UInt", f0.f104550a);
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104622b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        int i13 = ((xk2.b0) obj).f135201a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.l(f104622b).C(i13);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new xk2.b0(decoder.p(f104622b).g());
    }
}
