package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.aj;
import x40.zi;

/* loaded from: classes5.dex */
public abstract class rh {

    /* renamed from: a, reason: collision with root package name */
    public static final List f137456a = kotlin.collections.f0.j("__typename", "connection");

    public static aj a(tc.f reader, pc.v customScalarAdapters, String typename) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        zi ziVar = null;
        while (true) {
            int V1 = reader.V1(f137456a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    return new aj(typename, ziVar);
                }
                ziVar = (zi) pc.c.b(pc.c.c(qh.f137426a)).f(reader, customScalarAdapters);
            }
        }
    }

    public static void b(tc.g writer, pc.v customScalarAdapters, aj value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f131994a);
        writer.M0("connection");
        pc.c.b(pc.c.c(qh.f137426a)).d(writer, customScalarAdapters, value.f131995b);
    }
}
