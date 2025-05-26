package h30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f66778a = f0.j("__typename", "error");

    public static g30.b a(tc.f reader, v customScalarAdapters, String typename) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        g30.a aVar = null;
        while (true) {
            int V1 = reader.V1(f66778a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    Intrinsics.f(aVar);
                    return new g30.b(typename, aVar);
                }
                aVar = (g30.a) pc.c.c(a.f66776a).f(reader, customScalarAdapters);
            }
        }
    }

    public static void b(tc.g writer, v customScalarAdapters, g30.b value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f63415d);
        writer.M0("error");
        pc.c.c(a.f66776a).d(writer, customScalarAdapters, value.f63416e);
    }
}
