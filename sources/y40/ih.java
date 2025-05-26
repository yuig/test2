package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.ri;

/* loaded from: classes5.dex */
public abstract class ih {

    /* renamed from: a, reason: collision with root package name */
    public static final List f137171a = kotlin.collections.e0.b("__typename");

    public static ri a(tc.f reader, pc.v customScalarAdapters, String typename) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        while (reader.V1(f137171a) == 0) {
            typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
        }
        Intrinsics.f(typename);
        return new ri(typename);
    }

    public static void b(tc.g writer, pc.v customScalarAdapters, ri value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f133218a);
    }
}
