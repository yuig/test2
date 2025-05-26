package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final g f104555a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f104556b = new c1("kotlin.Boolean", oo2.e.f96874a);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104556b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.w(booleanValue);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.t());
    }
}
