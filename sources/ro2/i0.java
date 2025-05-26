package ro2;

import a.cb;
import kh2.j1;
import kh2.n3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

/* loaded from: classes4.dex */
public final class i0 implements no2.b {

    /* renamed from: a */
    public static final i0 f109009a = new i0();

    /* renamed from: b */
    public static final oo2.h f109010b = n3.o("kotlinx.serialization.json.JsonPrimitive", oo2.e.f96882i, new oo2.g[0], oo2.k.f96900i);

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f109010b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        h0 value = (h0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kg.p.m(encoder);
        if (value instanceof z) {
            encoder.k(a0.f108973a, z.INSTANCE);
        } else {
            encoder.k(w.f109043a, (v) value);
        }
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        n f13 = kg.p.l(decoder).f();
        if (f13 instanceof h0) {
            return (h0) f13;
        }
        StringBuilder sb3 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw j1.i(-1, cb.n(k0.f80436a, f13.getClass(), sb3), f13.toString());
    }
}
