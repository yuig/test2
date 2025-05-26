package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.yi;
import x40.zi;

/* loaded from: classes5.dex */
public final class qh implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final qh f137426a = new qh();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137427b = kotlin.collections.f0.j("__typename", "edges", "pageInfo");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        zi value = (zi) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f133831a);
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(oh.f137363a)))).d(writer, customScalarAdapters, value.f133832b);
        writer.M0("pageInfo");
        pc.c.c(ph.f137395a).d(writer, customScalarAdapters, value.f133833c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        List list = null;
        yi yiVar = null;
        while (true) {
            int V1 = reader.V1(f137427b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(oh.f137363a)))).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(str);
                    Intrinsics.f(yiVar);
                    return new zi(str, list, yiVar);
                }
                yiVar = (yi) pc.c.c(ph.f137395a).f(reader, customScalarAdapters);
            }
        }
    }
}
