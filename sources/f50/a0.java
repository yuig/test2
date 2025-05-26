package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f61107a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61108b = kotlin.collections.f0.j("backgroundColorHex", "iconType");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.b0 value = (e50.b0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("backgroundColorHex");
        pc.c.b(pc.c.a(pc.c.f99524e)).d(writer, customScalarAdapters, value.f57264a);
        writer.M0("iconType");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f57265b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        Integer num = null;
        while (true) {
            int V1 = reader.V1(f61108b);
            if (V1 == 0) {
                list = (List) pc.c.b(pc.c.a(pc.c.f99524e)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new e50.b0(num, list);
                }
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
