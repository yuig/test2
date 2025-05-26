package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f104550a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f104551b = new c1("kotlin.Int", oo2.e.f96879f);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104551b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        int intValue = ((Number) obj).intValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.C(intValue);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.g());
    }
}
