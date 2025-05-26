package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p1 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f104608a = new p1();

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f104609b;

    static {
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.c.f80421a, "<this>");
        f104609b = bp1.h.a("kotlin.UByte", j.f104572a);
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104609b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        byte b13 = ((xk2.y) obj).f135238a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.l(f104609b).g(b13);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new xk2.y(decoder.p(f104609b).E());
    }
}
