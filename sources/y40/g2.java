package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g2 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g2 f137079a = new g2();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137080b = kotlin.collections.f0.j("pageCount", "metadata", "isDeleted");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.q2 value = (x40.q2) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133063a);
        writer.M0("metadata");
        pc.c.b(pc.c.c(f2.f137041a)).d(writer, customScalarAdapters, value.f133064b);
        writer.M0("isDeleted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f133065c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        x40.p2 p2Var = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f137080b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                p2Var = (x40.p2) pc.c.b(pc.c.c(f2.f137041a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.q2(num, p2Var, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
