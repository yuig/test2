package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f61199a = new y0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61200b = kotlin.collections.f0.j("link", "text");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.z0 value = (e50.z0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("link");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f57476a);
        writer.M0("text");
        k0Var.d(writer, customScalarAdapters, value.f57477b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f61200b);
            if (V1 == 0) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new e50.z0(str, str2);
                }
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
