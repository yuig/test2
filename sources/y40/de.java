package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.Cif;

/* loaded from: classes.dex */
public final class de implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final de f136997a = new de();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136998b = kotlin.collections.f0.j("__typename", "width", "height");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        Cif value = (Cif) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.c());
        writer.M0("width");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.b());
        writer.M0("height");
        k0Var.d(writer, customScalarAdapters, value.a());
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int V1 = reader.V1(f136998b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(str);
                    return new Cif(num, num2, str);
                }
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
