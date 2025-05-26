package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f61184a = new u0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61185b = kotlin.collections.f0.j("button", "description", "title");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.v0 value = (e50.v0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("button");
        pc.c.b(pc.c.c(o0.f61163a)).d(writer, customScalarAdapters, value.f57435a);
        writer.M0("description");
        pc.c.b(pc.c.c(q0.f61169a)).d(writer, customScalarAdapters, value.f57436b);
        writer.M0("title");
        pc.c.b(pc.c.c(t0.f61181a)).d(writer, customScalarAdapters, value.f57437c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        e50.p0 p0Var = null;
        e50.r0 r0Var = null;
        e50.u0 u0Var = null;
        while (true) {
            int V1 = reader.V1(f61185b);
            if (V1 == 0) {
                p0Var = (e50.p0) pc.c.b(pc.c.c(o0.f61163a)).f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                r0Var = (e50.r0) pc.c.b(pc.c.c(q0.f61169a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new e50.v0(p0Var, r0Var, u0Var);
                }
                u0Var = (e50.u0) pc.c.b(pc.c.c(t0.f61181a)).f(reader, customScalarAdapters);
            }
        }
    }
}
