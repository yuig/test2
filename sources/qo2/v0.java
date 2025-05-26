package qo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v0 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public final no2.b f104638a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f104639b;

    public v0(no2.b serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f104638a = serializer;
        this.f104639b = new f1(serializer.a());
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return this.f104639b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (obj == null) {
            encoder.s();
        } else {
            encoder.getClass();
            encoder.k(this.f104638a, obj);
        }
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder.A()) {
            return decoder.m(this.f104638a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v0.class == obj.getClass() && Intrinsics.d(this.f104638a, ((v0) obj).f104638a);
    }

    public final int hashCode() {
        return this.f104638a.hashCode();
    }
}
