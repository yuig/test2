package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t2 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t2 f137494a = new t2();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.d3 value = (x40.d3) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.c3) {
            List list = s2.f137461a;
            x40.c3 value2 = (x40.c3) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132093a);
            writer.M0("connection");
            pc.c.b(pc.c.c(r2.f137433a)).d(writer, customScalarAdapters, value2.f132094b);
            return;
        }
        if (value instanceof x40.w2) {
            List list2 = m2.f137271a;
            x40.w2 value3 = (x40.w2) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133570a);
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "UserUsersConnectionContainer")) {
            List list = m2.f137271a;
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(typename, "typename");
            while (reader.V1(m2.f137271a) == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
            Intrinsics.f(typename);
            return new x40.w2(typename);
        }
        List list2 = s2.f137461a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        x40.b3 b3Var = null;
        while (true) {
            int V1 = reader.V1(s2.f137461a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    return new x40.c3(typename, b3Var);
                }
                b3Var = (x40.b3) pc.c.b(pc.c.c(r2.f137433a)).f(reader, customScalarAdapters);
            }
        }
    }
}
