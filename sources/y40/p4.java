package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p4 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p4 f137374a = new p4();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.a5 value = (x40.a5) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof x40.z4) {
            List list = o4.f137341a;
            x40.z4 value2 = (x40.z4) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f133803a);
            writer.M0("connection");
            pc.c.b(pc.c.c(n4.f137309a)).d(writer, customScalarAdapters, value2.f133804b);
            return;
        }
        if (value instanceof x40.t4) {
            List list2 = i4.f137149a;
            x40.t4 value3 = (x40.t4) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f133328a);
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "UserUsersConnectionContainer")) {
            List list = i4.f137149a;
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(typename, "typename");
            while (reader.V1(i4.f137149a) == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
            Intrinsics.f(typename);
            return new x40.t4(typename);
        }
        List list2 = o4.f137341a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        x40.y4 y4Var = null;
        while (true) {
            int V1 = reader.V1(o4.f137341a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    return new x40.z4(typename, y4Var);
                }
                y4Var = (x40.y4) pc.c.b(pc.c.c(n4.f137309a)).f(reader, customScalarAdapters);
            }
        }
    }
}
