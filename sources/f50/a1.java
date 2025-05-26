package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f61109a = new a1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61110b = kotlin.collections.f0.j("__typename", "advisory", "severity", "notices");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.b1 value = (e50.b1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f57266a);
        writer.M0("advisory");
        pc.k0 k0Var = pc.c.f99528i;
        k0Var.d(writer, customScalarAdapters, value.f57267b);
        writer.M0("severity");
        k0Var.d(writer, customScalarAdapters, value.f57268c);
        writer.M0("notices");
        pc.c.b(pc.c.a(pc.c.c(z0.f61203a))).d(writer, customScalarAdapters, value.f57269d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Object obj = null;
        Object obj2 = null;
        List list = null;
        while (true) {
            int V1 = reader.V1(f61110b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                obj = pc.c.f99528i.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                obj2 = pc.c.f99528i.f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    Intrinsics.f(str);
                    return new e50.b1(str, obj, obj2, list);
                }
                list = (List) pc.c.b(pc.c.a(pc.c.c(z0.f61203a))).f(reader, customScalarAdapters);
            }
        }
    }
}
