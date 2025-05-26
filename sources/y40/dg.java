package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dg implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final dg f137000a = new dg();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137001b = kotlin.collections.f0.j("pageCount", "metadata", "isDeleted", "__typename", "totalVideoDuration", "staticPageCount");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.jh value = (x40.jh) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageCount");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.f132619a);
        writer.M0("metadata");
        pc.c.b(pc.c.c(cg.f136969a)).d(writer, customScalarAdapters, value.f132620b);
        writer.M0("isDeleted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f132621c);
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f132622d);
        writer.M0("totalVideoDuration");
        pc.c.f99525f.d(writer, customScalarAdapters, value.f132623e);
        writer.M0("staticPageCount");
        k0Var.d(writer, customScalarAdapters, value.f132624f);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        x40.ih ihVar = null;
        Boolean bool = null;
        String str = null;
        Double d2 = null;
        Integer num2 = null;
        while (true) {
            int V1 = reader.V1(f137001b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                ihVar = (x40.ih) pc.c.b(pc.c.c(cg.f136969a)).f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 4) {
                d2 = (Double) pc.c.f99525f.f(reader, customScalarAdapters);
            } else {
                if (V1 != 5) {
                    Intrinsics.f(str);
                    return new x40.jh(num, ihVar, bool, str, d2, num2);
                }
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
