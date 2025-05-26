package z30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class k implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f140776a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final List f140777b = f0.j("endCursor", "hasNextPage", "hasPreviousPage", "startCursor");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        y30.k value = (y30.k) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("endCursor");
        a10.e eVar = pc.c.f99520a;
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f136750a);
        writer.M0("hasNextPage");
        pc.c.f99522c.d(writer, customScalarAdapters, Boolean.valueOf(value.f136751b));
        writer.M0("hasPreviousPage");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f136752c);
        writer.M0("startCursor");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f136753d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f140777b);
            if (V1 == 0) {
                str = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                bool = (Boolean) pc.c.f99522c.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                bool2 = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    Intrinsics.f(bool);
                    return new y30.k(bool2, str, str2, bool.booleanValue());
                }
                str2 = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            }
        }
    }
}
