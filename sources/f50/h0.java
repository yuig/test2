package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f61141a = new h0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61142b = kotlin.collections.f0.j("isSelected", "display", "entityId", "action");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.i0 value = (e50.i0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("isSelected");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f57364a);
        writer.M0("display");
        pc.c.b(pc.c.c(g0.f61137a)).d(writer, customScalarAdapters, value.f57365b);
        writer.M0("entityId");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f57366c);
        writer.M0("action");
        pc.c.b(pc.c.c(f0.f61133a)).d(writer, customScalarAdapters, value.f57367d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Boolean bool = null;
        e50.h0 h0Var = null;
        String str = null;
        e50.g0 g0Var = null;
        while (true) {
            int V1 = reader.V1(f61142b);
            if (V1 == 0) {
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                h0Var = (e50.h0) pc.c.b(pc.c.c(g0.f61137a)).f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    return new e50.i0(bool, h0Var, str, g0Var);
                }
                g0Var = (e50.g0) pc.c.b(pc.c.c(f0.f61133a)).f(reader, customScalarAdapters);
            }
        }
    }
}
