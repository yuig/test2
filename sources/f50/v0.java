package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f61188a = new v0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61189b = kotlin.collections.f0.j("storyPinBlockId", "storyPinPageId");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.w0 value = (e50.w0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("storyPinBlockId");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.f57443a);
        writer.M0("storyPinPageId");
        k0Var.d(writer, customScalarAdapters, value.f57444b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int V1 = reader.V1(f61189b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new e50.w0(num, num2);
                }
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
