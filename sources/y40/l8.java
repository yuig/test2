package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l8 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l8 f137249a = new l8();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.e9 value = (x40.e9) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.d9) {
            List list = k8.f137218a;
            x40.d9 value2 = (x40.d9) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f132234a);
            writer.M0("connection");
            pc.c.b(pc.c.c(j8.f137186a)).d(writer, customScalarAdapters, value2.f132235b);
            return;
        }
        if (value instanceof x40.x8) {
            List list2 = e8.f137019a;
            x40.x8 value3 = (x40.x8) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133677a);
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "UserUsersConnectionContainer")) {
            List list = e8.f137019a;
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(typename, "typename");
            while (reader.V1(e8.f137019a) == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
            Intrinsics.f(typename);
            return new x40.x8(typename);
        }
        List list2 = k8.f137218a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        x40.c9 c9Var = null;
        while (true) {
            int V1 = reader.V1(k8.f137218a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    return new x40.d9(typename, c9Var);
                }
                c9Var = (x40.c9) pc.c.b(pc.c.c(j8.f137186a)).f(reader, customScalarAdapters);
            }
        }
    }
}
