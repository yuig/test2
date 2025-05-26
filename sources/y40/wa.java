package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wa implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final wa f137599a = new wa();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137600b = kotlin.collections.f0.j("edges", "pageInfo");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.qb value = (x40.qb) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(ua.f137539a)))).d(writer, customScalarAdapters, value.f133115a);
        writer.M0("pageInfo");
        pc.c.c(va.f137569a).d(writer, customScalarAdapters, value.f133116b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        x40.pb pbVar = null;
        while (true) {
            int V1 = reader.V1(f137600b);
            if (V1 == 0) {
                list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(ua.f137539a)))).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(pbVar);
                    return new x40.qb(list, pbVar);
                }
                pbVar = (x40.pb) pc.c.c(va.f137569a).f(reader, customScalarAdapters);
            }
        }
    }
}
