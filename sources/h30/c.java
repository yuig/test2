package h30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final List f66779a = e0.b("__typename");

    public static g30.c a(tc.f reader, v customScalarAdapters, String typename) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        while (reader.V1(f66779a) == 0) {
            typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
        }
        Intrinsics.f(typename);
        return new g30.c(typename);
    }

    public static void b(tc.g writer, v customScalarAdapters, g30.c value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f63417d);
    }
}
