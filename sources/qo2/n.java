package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final n f104595a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f104596b = new c1("kotlin.Char", oo2.e.f96876c);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104596b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        char charValue = ((Character) obj).charValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.z(charValue);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.u());
    }
}
