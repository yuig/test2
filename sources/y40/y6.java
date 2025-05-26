package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y6 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y6 f137653a = new y6();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137654b = kotlin.collections.f0.j("__typename", "width", "height");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.r7 value = (x40.r7) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f133172a);
        writer.M0("width");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.f133173b);
        writer.M0("height");
        k0Var.d(writer, customScalarAdapters, value.f133174c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int V1 = reader.V1(f137654b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(str);
                    return new x40.r7(num, num2, str);
                }
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
