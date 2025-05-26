package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f137368a = new p1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137369b = kotlin.collections.f0.j("pageCount", "metadata", "isDeleted");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.z1 value = (x40.z1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133760a);
        writer.M0("metadata");
        pc.c.b(pc.c.c(o1.f137335a)).d(writer, customScalarAdapters, value.f133761b);
        writer.M0("isDeleted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f133762c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        x40.y1 y1Var = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f137369b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                y1Var = (x40.y1) pc.c.b(pc.c.c(o1.f137335a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.z1(num, y1Var, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
