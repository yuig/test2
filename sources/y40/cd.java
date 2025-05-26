package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cd implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final cd f136964a = new cd();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136965b = kotlin.collections.f0.j("entityId", "type");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ce value = (x40.ce) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("entityId");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f132148a);
        writer.M0("type");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f132149b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f136965b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(str);
                    return new x40.ce(str, str2);
                }
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
