package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f124110a = new z0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124111b = kotlin.collections.f0.j("endCursor", "hasNextPage", "hasPreviousPage", "startCursor");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.d1 value = (u40.d1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("endCursor");
        a10.e eVar = pc.c.f99520a;
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f120316a);
        writer.M0("hasNextPage");
        pc.c.f99522c.d(writer, customScalarAdapters, Boolean.valueOf(value.f120317b));
        writer.M0("hasPreviousPage");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f120318c);
        writer.M0("startCursor");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f120319d);
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
            int V1 = reader.V1(f124111b);
            if (V1 == 0) {
                str = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                bool = (Boolean) pc.c.f99522c.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                bool2 = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    Intrinsics.f(bool);
                    return new u40.d1(bool2, str, str2, bool.booleanValue());
                }
                str2 = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            }
        }
    }
}
