package ro2;

import kh2.n3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements no2.b {

    /* renamed from: a */
    public static final r f109037a = new r();

    /* renamed from: b */
    public static final oo2.h f109038b = n3.o("kotlinx.serialization.json.JsonElement", oo2.c.f96873b, new oo2.g[0], q.f109034j);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f109038b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        n value = (n) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kg.p.m(encoder);
        if (value instanceof h0) {
            encoder.k(i0.f109009a, value);
        } else if (value instanceof c0) {
            encoder.k(f0.f108986a, value);
        } else if (value instanceof e) {
            encoder.k(h.f108991a, value);
        }
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return kg.p.l(decoder).f();
    }
}
