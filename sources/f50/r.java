package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f61171a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61172b = kotlin.collections.f0.j("textAlignment", "topCornerRadius", "headerSize", "subtitleAlignment", "subtitleStyle");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.s value = (e50.s) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("textAlignment");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.f57413a);
        writer.M0("topCornerRadius");
        k0Var.d(writer, customScalarAdapters, value.f57414b);
        writer.M0("headerSize");
        k0Var.d(writer, customScalarAdapters, value.f57415c);
        writer.M0("subtitleAlignment");
        k0Var.d(writer, customScalarAdapters, value.f57416d);
        writer.M0("subtitleStyle");
        k0Var.d(writer, customScalarAdapters, value.f57417e);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        while (true) {
            int V1 = reader.V1(f61172b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                num3 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                num4 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else {
                if (V1 != 4) {
                    return new e50.s(num, num2, num3, num4, num5);
                }
                num5 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
