package qo2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public final class u0 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f104633a = new u0();

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f104634b = t0.f104625a;

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f104634b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        Void value = (Void) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }
}
