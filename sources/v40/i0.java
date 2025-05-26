package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f124058a = new i0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124059b = kotlin.collections.f0.j("dominantColor", "height", "type", "url", "width");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.l0 value = (u40.l0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("dominantColor");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f120380a);
        writer.M0("height");
        pc.k0 k0Var2 = pc.c.f99526g;
        k0Var2.d(writer, customScalarAdapters, value.f120381b);
        writer.M0("type");
        k0Var.d(writer, customScalarAdapters, value.f120382c);
        writer.M0("url");
        k0Var.d(writer, customScalarAdapters, value.f120383d);
        writer.M0("width");
        k0Var2.d(writer, customScalarAdapters, value.f120384e);
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
            int V1 = reader.V1(f124059b);
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
                    return new u40.l0(str, str2, str3, num, num2);
                }
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
