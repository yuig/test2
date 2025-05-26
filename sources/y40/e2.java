package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e2 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e2 f137008a = new e2();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137009b = kotlin.collections.f0.j("products", "typeName", "displayName");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.o2 value = (x40.o2) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("products");
        pc.c.b(pc.c.a(pc.c.c(d2.f136977a))).d(writer, customScalarAdapters, value.f132919a);
        writer.M0("typeName");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f132920b);
        writer.M0("displayName");
        k0Var.d(writer, customScalarAdapters, value.f132921c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f137009b);
            if (V1 == 0) {
                list = (List) pc.c.b(pc.c.a(pc.c.c(d2.f136977a))).f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.o2(list, str, str2);
                }
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
