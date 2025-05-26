package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class z8 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f137687a = kotlin.collections.f0.j("__typename", "error");

    public static x40.t9 a(tc.f reader, pc.v customScalarAdapters, String typename) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        x40.s9 s9Var = null;
        while (true) {
            int V1 = reader.V1(f137687a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    Intrinsics.f(s9Var);
                    return new x40.t9(typename, s9Var);
                }
                s9Var = (x40.s9) pc.c.c(y8.f137657a).f(reader, customScalarAdapters);
            }
        }
    }

    public static void b(tc.g writer, pc.v customScalarAdapters, x40.t9 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f133337d);
        writer.M0("error");
        pc.c.c(y8.f137657a).d(writer, customScalarAdapters, value.f133338e);
    }
}
