package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l3 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l3 f137240a = new l3();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137241b = kotlin.collections.f0.j("pageCount", "metadata", "isDeleted");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.w3 value = (x40.w3) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133571a);
        writer.M0("metadata");
        pc.c.b(pc.c.c(k3.f137210a)).d(writer, customScalarAdapters, value.f133572b);
        writer.M0("isDeleted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f133573c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        x40.v3 v3Var = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f137241b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                v3Var = (x40.v3) pc.c.b(pc.c.c(k3.f137210a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.w3(num, v3Var, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
