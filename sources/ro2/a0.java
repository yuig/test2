package ro2;

import kh2.n3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* loaded from: classes4.dex */
public final class a0 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f108973a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final oo2.h f108974b = n3.o("kotlinx.serialization.json.JsonNull", oo2.m.f96902a, new oo2.g[0], oo2.k.f96900i);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f108974b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        z value = (z) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kg.p.m(encoder);
        encoder.s();
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        kg.p.l(decoder);
        if (!decoder.A()) {
            return z.INSTANCE;
        }
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        throw new JsonDecodingException("Expected 'null' literal");
    }
}
