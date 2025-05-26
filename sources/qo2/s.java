package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final s f104618a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f104619b = new c1("kotlin.Double", oo2.e.f96877d);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104619b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.f(doubleValue);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.s());
    }
}
