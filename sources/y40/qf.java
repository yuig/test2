package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qf implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final qf f137423a = new qf();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137424b = kotlin.collections.f0.j("__typename", "verified");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.wg value = (x40.wg) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f133628a);
        writer.M0("verified");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f133629b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f137424b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(str);
                    return new x40.wg(str, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
