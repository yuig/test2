package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f61150a = new k0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61151b = kotlin.collections.f0.j("__typename", "action", "animation", "display", "id", "moduleType");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.l0 value = (e50.l0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f57385a);
        writer.M0("action");
        pc.c.b(pc.c.c(i0.f61144a)).d(writer, customScalarAdapters, value.f57386b);
        writer.M0("animation");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.f57387c);
        writer.M0("display");
        pc.c.b(pc.c.c(j0.f61147a)).d(writer, customScalarAdapters, value.f57388d);
        writer.M0("id");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f57389e);
        writer.M0("moduleType");
        k0Var.d(writer, customScalarAdapters, value.f57390f);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        e50.j0 j0Var = null;
        Integer num = null;
        e50.k0 k0Var = null;
        String str2 = null;
        Integer num2 = null;
        while (true) {
            int V1 = reader.V1(f61151b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                j0Var = (e50.j0) pc.c.b(pc.c.c(i0.f61144a)).f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                k0Var = (e50.k0) pc.c.b(pc.c.c(j0.f61147a)).f(reader, customScalarAdapters);
            } else if (V1 == 4) {
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 5) {
                    Intrinsics.f(str);
                    return new e50.l0(str, j0Var, num, k0Var, str2, num2);
                }
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
