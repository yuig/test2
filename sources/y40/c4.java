package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c4 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c4 f136950a = new c4();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136951b = kotlin.collections.f0.j("pageCount", "metadata", "isDeleted");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.n4 value = (x40.n4) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f132873a);
        writer.M0("metadata");
        pc.c.b(pc.c.c(b4.f136920a)).d(writer, customScalarAdapters, value.f132874b);
        writer.M0("isDeleted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f132875c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        x40.m4 m4Var = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f136951b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                m4Var = (x40.m4) pc.c.b(pc.c.c(b4.f136920a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.n4(num, m4Var, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
