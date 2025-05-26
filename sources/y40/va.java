package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class va implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final va f137569a = new va();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137570b = kotlin.collections.f0.j("endCursor", "hasPreviousPage", "hasNextPage", "startCursor");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.pb value = (x40.pb) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("endCursor");
        a10.e eVar = pc.c.f99520a;
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133036a);
        writer.M0("hasPreviousPage");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f133037b);
        writer.M0("hasNextPage");
        pc.c.f99522c.d(writer, customScalarAdapters, Boolean.valueOf(value.f133038c));
        writer.M0("startCursor");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f133039d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f137570b);
            if (V1 == 0) {
                str = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                bool2 = (Boolean) pc.c.f99522c.f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    Intrinsics.f(bool2);
                    return new x40.pb(bool, str, str2, bool2.booleanValue());
                }
                str2 = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            }
        }
    }
}
