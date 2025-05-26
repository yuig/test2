package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f61153a = new l0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61154b = kotlin.collections.f0.j("hasNextPage", "hasPreviousPage", "startCursor", "endCursor");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.m0 value = (e50.m0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("hasNextPage");
        pc.c.f99522c.d(writer, customScalarAdapters, Boolean.valueOf(value.f57391a));
        writer.M0("hasPreviousPage");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f57392b);
        writer.M0("startCursor");
        a10.e eVar = pc.c.f99520a;
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f57393c);
        writer.M0("endCursor");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f57394d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f61154b);
            if (V1 == 0) {
                bool = (Boolean) pc.c.f99522c.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                bool2 = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    Intrinsics.f(bool);
                    return new e50.m0(bool2, str, str2, bool.booleanValue());
                }
                str2 = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            }
        }
    }
}
