package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class u8 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f137536a = kotlin.collections.f0.j("__typename", "error");

    public static x40.o9 a(tc.f reader, pc.v customScalarAdapters, String typename) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        x40.n9 n9Var = null;
        while (true) {
            int V1 = reader.V1(f137536a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    Intrinsics.f(n9Var);
                    return new x40.o9(typename, n9Var);
                }
                n9Var = (x40.n9) pc.c.c(t8.f137504a).f(reader, customScalarAdapters);
            }
        }
    }

    public static void b(tc.g writer, pc.v customScalarAdapters, x40.o9 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f132954d);
        writer.M0("error");
        pc.c.c(t8.f137504a).d(writer, customScalarAdapters, value.f132955e);
    }
}
