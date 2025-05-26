package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f61166a = new p0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61167b = kotlin.collections.f0.j("length", "link", "objectId", "offset", "tagType");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.q0 value = (e50.q0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("length");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.f57405a);
        writer.M0("link");
        pc.k0 k0Var2 = pc.c.f99524e;
        k0Var2.d(writer, customScalarAdapters, value.f57406b);
        writer.M0("objectId");
        k0Var2.d(writer, customScalarAdapters, value.f57407c);
        writer.M0("offset");
        k0Var.d(writer, customScalarAdapters, value.f57408d);
        writer.M0("tagType");
        pc.c.f99528i.d(writer, customScalarAdapters, value.f57409e);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        String str = null;
        String str2 = null;
        Integer num2 = null;
        Object obj = null;
        while (true) {
            int V1 = reader.V1(f61167b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else {
                if (V1 != 4) {
                    return new e50.q0(num, str, str2, num2, obj);
                }
                obj = pc.c.f99528i.f(reader, customScalarAdapters);
            }
        }
    }
}
