package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jg implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final jg f137200a = new jg();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137201b = kotlin.collections.f0.j("edges", "pageInfo");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ph value = (x40.ph) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(hg.f137136a)))).d(writer, customScalarAdapters, value.f133050a);
        writer.M0("pageInfo");
        pc.c.c(ig.f137169a).d(writer, customScalarAdapters, value.f133051b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        x40.oh ohVar = null;
        while (true) {
            int V1 = reader.V1(f137201b);
            if (V1 == 0) {
                list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(hg.f137136a)))).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(ohVar);
                    return new x40.ph(list, ohVar);
                }
                ohVar = (x40.oh) pc.c.c(ig.f137169a).f(reader, customScalarAdapters);
            }
        }
    }
}
