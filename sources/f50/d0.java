package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f61123a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61124b = kotlin.collections.f0.j("journeyDepth", "sourceModuleId");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.e0 value = (e50.e0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("journeyDepth");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f57317a);
        writer.M0("sourceModuleId");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f57318b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        String str = null;
        while (true) {
            int V1 = reader.V1(f61124b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new e50.e0(num, str);
                }
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
