package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i1 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final i1 f104570a = new i1();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f104571b = new c1("kotlin.Short", oo2.e.f96881h);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104571b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.t(shortValue);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.q());
    }
}
