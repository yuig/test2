package z30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final List f140786a = f0.j("__typename", "error");

    public static y30.r a(tc.f reader, v customScalarAdapters, String typename) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        y30.q qVar = null;
        while (true) {
            int V1 = reader.V1(f140786a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    Intrinsics.f(qVar);
                    return new y30.r(typename, qVar);
                }
                qVar = (y30.q) pc.c.c(p.f140784a).f(reader, customScalarAdapters);
            }
        }
    }

    public static void b(tc.g writer, v customScalarAdapters, y30.r value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f136764d);
        writer.M0("error");
        pc.c.c(p.f140784a).d(writer, customScalarAdapters, value.f136765e);
    }
}
