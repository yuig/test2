package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ac implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ac f136902a = new ac();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136903b = kotlin.collections.f0.j("edges", "pageInfo");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.xc value = (x40.xc) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(yb.f137662a)))).d(writer, customScalarAdapters, value.f133685a);
        writer.M0("pageInfo");
        pc.c.c(zb.f137692a).d(writer, customScalarAdapters, value.f133686b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        x40.wc wcVar = null;
        while (true) {
            int V1 = reader.V1(f136903b);
            if (V1 == 0) {
                list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(yb.f137662a)))).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(wcVar);
                    return new x40.xc(list, wcVar);
                }
                wcVar = (x40.wc) pc.c.c(zb.f137692a).f(reader, customScalarAdapters);
            }
        }
    }
}
