package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f61203a = new z0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61204b = kotlin.collections.f0.j("style", "title", "description", "footer", "actions");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.a1 value = (e50.a1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("style");
        pc.c.f99528i.d(writer, customScalarAdapters, value.f57258a);
        writer.M0("title");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f57259b);
        writer.M0("description");
        pc.c.b(pc.c.c(x0.f61196a)).d(writer, customScalarAdapters, value.f57260c);
        writer.M0("footer");
        pc.c.b(pc.c.c(y0.f61199a)).d(writer, customScalarAdapters, value.f57261d);
        writer.M0("actions");
        pc.c.b(pc.c.a(pc.c.c(u0.f61184a))).d(writer, customScalarAdapters, value.f57262e);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Object obj = null;
        String str = null;
        e50.y0 y0Var = null;
        e50.z0 z0Var = null;
        List list = null;
        while (true) {
            int V1 = reader.V1(f61204b);
            if (V1 == 0) {
                obj = pc.c.f99528i.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                y0Var = (e50.y0) pc.c.b(pc.c.c(x0.f61196a)).f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                z0Var = (e50.z0) pc.c.b(pc.c.c(y0.f61199a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 4) {
                    return new e50.a1(obj, str, y0Var, z0Var, list);
                }
                list = (List) pc.c.b(pc.c.a(pc.c.c(u0.f61184a))).f(reader, customScalarAdapters);
            }
        }
    }
}
