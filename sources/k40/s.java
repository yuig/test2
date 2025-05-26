package k40;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f78292a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78293b = f0.j("pageInfo", "edges");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.t value = (j40.t) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageInfo");
        pc.c.c(r.f78290a).d(writer, customScalarAdapters, value.f74625a);
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(q.f78288a)))).d(writer, customScalarAdapters, value.f74626b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        j40.s sVar = null;
        List list = null;
        while (true) {
            int V1 = reader.V1(f78293b);
            if (V1 == 0) {
                sVar = (j40.s) pc.c.c(r.f78290a).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(sVar);
                    return new j40.t(sVar, list);
                }
                list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(q.f78288a)))).f(reader, customScalarAdapters);
            }
        }
    }
}
