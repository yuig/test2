package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f124049a = new f();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.f value = (u40.f) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof u40.m)) {
            if (value instanceof u40.d) {
                List list = d.f124041a;
                u40.d value2 = (u40.d) value;
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value2, "value");
                writer.M0("__typename");
                pc.c.f99520a.d(writer, customScalarAdapters, value2.f120315a);
                return;
            }
            return;
        }
        List list2 = m.f124070a;
        u40.m value3 = (u40.m) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value3, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value3.f120385a);
        writer.M0("commerceEnvConfig");
        pc.c.f99528i.d(writer, customScalarAdapters, value3.f120386b);
        writer.M0("data");
        pc.c.b(pc.c.c(g.f124051a)).d(writer, customScalarAdapters, value3.f120387c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "V3UsersMeViewer")) {
            List list = d.f124041a;
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(typename, "typename");
            while (reader.V1(d.f124041a) == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
            Intrinsics.f(typename);
            return new u40.d(typename);
        }
        List list2 = m.f124070a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        Object obj = null;
        u40.g gVar = null;
        while (true) {
            int V1 = reader.V1(m.f124070a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                obj = pc.c.f99528i.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(typename);
                    return new u40.m(typename, obj, gVar);
                }
                gVar = (u40.g) pc.c.b(pc.c.c(g.f124051a)).f(reader, customScalarAdapters);
            }
        }
    }
}
