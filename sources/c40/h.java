package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final List f25722a = kotlin.collections.f0.j("__typename", "error");

    public static b40.i a(tc.f reader, pc.v customScalarAdapters, String typename) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        b40.h hVar = null;
        while (true) {
            int V1 = reader.V1(f25722a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    Intrinsics.f(hVar);
                    return new b40.i(typename, hVar);
                }
                hVar = (b40.h) pc.c.c(g.f25718a).f(reader, customScalarAdapters);
            }
        }
    }

    public static void b(tc.g writer, pc.v customScalarAdapters, b40.i value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f21714d);
        writer.M0("error");
        pc.c.c(g.f25718a).d(writer, customScalarAdapters, value.f21715e);
    }
}
