package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jf implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final jf f137198a = new jf();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137199b = kotlin.collections.f0.j("__typename", "type", "dominantColor", "width", "height", "url");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.pg value = (x40.pg) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f133044a);
        writer.M0("type");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f133045b);
        writer.M0("dominantColor");
        k0Var.d(writer, customScalarAdapters, value.f133046c);
        writer.M0("width");
        pc.k0 k0Var2 = pc.c.f99526g;
        k0Var2.d(writer, customScalarAdapters, value.f133047d);
        writer.M0("height");
        k0Var2.d(writer, customScalarAdapters, value.f133048e);
        writer.M0("url");
        k0Var.d(writer, customScalarAdapters, value.f133049f);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        String str4 = null;
        while (true) {
            int V1 = reader.V1(f137199b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str3 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 4) {
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else {
                if (V1 != 5) {
                    Intrinsics.f(str);
                    return new x40.pg(str, str2, str3, num, num2, str4);
                }
                str4 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
