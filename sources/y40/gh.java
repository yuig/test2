package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.pi;

/* loaded from: classes.dex */
public final class gh implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final gh f137106a = new gh();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137107b = kotlin.collections.f0.j("url", "width", "dominantColor", "type", "height");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        pi value = (pi) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("url");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.d());
        writer.M0("width");
        pc.k0 k0Var2 = pc.c.f99526g;
        k0Var2.d(writer, customScalarAdapters, value.e());
        writer.M0("dominantColor");
        k0Var.d(writer, customScalarAdapters, value.a());
        writer.M0("type");
        k0Var.d(writer, customScalarAdapters, value.c());
        writer.M0("height");
        k0Var2.d(writer, customScalarAdapters, value.b());
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
        while (true) {
            int V1 = reader.V1(f137107b);
            if (V1 == 0) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                str3 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 4) {
                    return new pi(str, str2, str3, num, num2);
                }
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
