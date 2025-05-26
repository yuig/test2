package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j1 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f104576a = new j1();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f104577b = new c1("kotlin.String", oo2.e.f96882i);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104577b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.F(value);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.z();
    }
}
