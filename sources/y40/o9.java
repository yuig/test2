package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o9 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o9 f137349a = new o9();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137350b = kotlin.collections.f0.j("pageCount", "metadata", "isDeleted");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ia value = (x40.ia) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f132549a);
        writer.M0("metadata");
        pc.c.b(pc.c.c(n9.f137318a)).d(writer, customScalarAdapters, value.f132550b);
        writer.M0("isDeleted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f132551c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        x40.ha haVar = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f137350b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                haVar = (x40.ha) pc.c.b(pc.c.c(n9.f137318a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.ia(num, haVar, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
