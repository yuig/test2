package ro2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import qo2.j1;

/* loaded from: classes4.dex */
public final class f0 implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f108986a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f108987b = e0.f108982b;

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f108987b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        c0 value = (c0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kg.p.m(encoder);
        f0.h.n0(o0.f80439a);
        f0.h.d(j1.f104576a, r.f109037a).c(encoder, value);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        kg.p.l(decoder);
        f0.h.n0(o0.f80439a);
        return new c0((Map) f0.h.d(j1.f104576a, r.f109037a).e(decoder));
    }
}
