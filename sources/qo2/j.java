package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f104572a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f104573b = new c1("kotlin.Byte", oo2.e.f96875b);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104573b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(byteValue);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.E());
    }
}
