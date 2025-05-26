package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f137303a = new n1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137304b = kotlin.collections.f0.j("products", "typeName", "displayName");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.x1 value = (x40.x1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("products");
        pc.c.b(pc.c.a(pc.c.c(m1.f137269a))).d(writer, customScalarAdapters, value.f133649a);
        writer.M0("typeName");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f133650b);
        writer.M0("displayName");
        k0Var.d(writer, customScalarAdapters, value.f133651c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f137304b);
            if (V1 == 0) {
                list = (List) pc.c.b(pc.c.a(pc.c.c(m1.f137269a))).f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.x1(list, str, str2);
                }
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
