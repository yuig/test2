package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f104592a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f104593b = new c1("kotlin.Long", oo2.e.f96880g);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104593b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        long longValue = ((Number) obj).longValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.q(longValue);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.i());
    }
}
