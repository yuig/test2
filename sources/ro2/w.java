package ro2;

import a.cb;
import java.util.Iterator;
import java.util.Map;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.text.StringsKt;
import qo2.c1;
import qo2.d1;
import qo2.v1;

/* loaded from: classes4.dex */
public final class w implements no2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final w f109043a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f109044b;

    static {
        oo2.e kind = oo2.e.f96882i;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (!(!kotlin.text.z.j("kotlinx.serialization.json.JsonLiteral"))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        Map map = d1.f104543a;
        Intrinsics.checkNotNullParameter("kotlinx.serialization.json.JsonLiteral", "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Iterator it = d1.f104543a.keySet().iterator();
        while (it.hasNext()) {
            String f13 = ((rl2.d) it.next()).f();
            Intrinsics.f(f13);
            String a13 = d1.a(f13);
            if (kotlin.text.z.i("kotlinx.serialization.json.JsonLiteral", "kotlin." + a13, true) || kotlin.text.z.i("kotlinx.serialization.json.JsonLiteral", a13, true)) {
                throw new IllegalArgumentException(kotlin.text.t.b("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + d1.a(a13) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f109044b = new c1("kotlinx.serialization.json.JsonLiteral", kind);
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f109044b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        v value = (v) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        kg.p.m(encoder);
        boolean z13 = value.f109040a;
        String str = value.f109042c;
        if (z13) {
            encoder.F(str);
            return;
        }
        oo2.g gVar = value.f109041b;
        if (gVar != null) {
            encoder.l(gVar).F(str);
            return;
        }
        Long h03 = StringsKt.h0(str);
        if (h03 != null) {
            encoder.q(h03.longValue());
            return;
        }
        xk2.e0 f13 = kotlin.text.f0.f(str);
        if (f13 != null) {
            Intrinsics.checkNotNullParameter(xk2.e0.f135207b, "<this>");
            encoder.l(v1.f104641b).q(f13.f135208a);
            return;
        }
        Double d2 = kotlin.text.y.d(str);
        if (d2 != null) {
            encoder.f(d2.doubleValue());
            return;
        }
        Boolean g03 = StringsKt.g0(str);
        if (g03 != null) {
            encoder.w(g03.booleanValue());
        } else {
            encoder.F(str);
        }
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        n f13 = kg.p.l(decoder).f();
        if (f13 instanceof v) {
            return (v) f13;
        }
        StringBuilder sb3 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw j1.i(-1, cb.n(k0.f80436a, f13.getClass(), sb3), f13.toString());
    }
}
