package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h7 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final h7 f137121a = new h7();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137122b = kotlin.collections.f0.j("pageCount", "metadata", "isDeleted");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.a8 value = (x40.a8) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f131918a);
        writer.M0("metadata");
        pc.c.b(pc.c.c(g7.f137088a)).d(writer, customScalarAdapters, value.f131919b);
        writer.M0("isDeleted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f131920c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        x40.z7 z7Var = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f137122b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                z7Var = (x40.z7) pc.c.b(pc.c.c(g7.f137088a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.a8(num, z7Var, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
