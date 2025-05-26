package z30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class l implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l f140778a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final List f140779b = f0.j("edges", "pageInfo");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        y30.l value = (y30.l) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(j.f140774a)))).d(writer, customScalarAdapters, value.f136754a);
        writer.M0("pageInfo");
        pc.c.c(k.f140776a).d(writer, customScalarAdapters, value.f136755b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        y30.k kVar = null;
        while (true) {
            int V1 = reader.V1(f140779b);
            if (V1 == 0) {
                list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(j.f140774a)))).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(kVar);
                    return new y30.l(list, kVar);
                }
                kVar = (y30.k) pc.c.c(k.f140776a).f(reader, customScalarAdapters);
            }
        }
    }
}
