package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n3 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n3 f137307a = new n3();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137308b = kotlin.collections.f0.j("__typename", "verified");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.y3 value = (x40.y3) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f133722a);
        writer.M0("verified");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f133723b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f137308b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(str);
                    return new x40.y3(str, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
