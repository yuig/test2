package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final List f25731a = kotlin.collections.e0.b("__typename");

    public static b40.m a(tc.f reader, pc.v customScalarAdapters, String typename) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        while (reader.V1(f25731a) == 0) {
            typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
        }
        Intrinsics.f(typename);
        return new b40.m(typename);
    }

    public static void b(tc.g writer, pc.v customScalarAdapters, b40.m value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f21725b);
    }
}
