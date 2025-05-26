package qo2;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class b implements no2.b {
    @Override // no2.h
    public final void c(po2.d encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        no2.h G = kh2.r.G(this, encoder, value);
        oo2.g a13 = a();
        po2.b b13 = encoder.b(a13);
        b13.m(0, G.a().i(), a());
        b13.u(a(), 1, G, value);
        b13.a(a13);
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        oo2.g a13 = a();
        po2.a b13 = decoder.b(a13);
        Object obj = null;
        String str = null;
        while (true) {
            int o13 = b13.o(a());
            if (o13 == -1) {
                if (obj == null) {
                    throw new IllegalArgumentException(a.a.j("Polymorphic value has not been read for class ", str).toString());
                }
                b13.a(a13);
                return obj;
            }
            if (o13 == 0) {
                str = b13.k(a(), o13);
            } else {
                if (o13 != 1) {
                    StringBuilder sb3 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb3.append(str);
                    sb3.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb3.append(o13);
                    throw new SerializationException(sb3.toString());
                }
                if (str == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                }
                obj = b13.C(a(), o13, kh2.r.F(this, b13, str), null);
            }
        }
    }

    public no2.a f(po2.a decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        to2.d c13 = decoder.c();
        rl2.d baseClass = h();
        c13.getClass();
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map map = (Map) c13.f118709d.get(baseClass);
        no2.b bVar = map != null ? (no2.b) map.get(str) : null;
        if (!(bVar instanceof no2.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = c13.f118710e.get(baseClass);
        Function1 function1 = dl2.b.K1(1, obj) ? (Function1) obj : null;
        return function1 != null ? (no2.a) function1.invoke(str) : null;
    }

    public no2.h g(po2.d encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        to2.d c13 = encoder.c();
        rl2.d baseClass = h();
        c13.getClass();
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.b(value)) {
            return null;
        }
        Map map = (Map) c13.f118707b.get(baseClass);
        no2.b bVar = map != null ? (no2.b) map.get(kotlin.jvm.internal.k0.f80436a.b(value.getClass())) : null;
        if (!(bVar instanceof no2.h)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = c13.f118708c.get(baseClass);
        Function1 function1 = dl2.b.K1(1, obj) ? (Function1) obj : null;
        if (function1 != null) {
            return (no2.h) function1.invoke(value);
        }
        return null;
    }

    public abstract rl2.d h();
}
