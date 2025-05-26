package j50;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.k0;
import pc.v;

/* loaded from: classes5.dex */
public final class e implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f74688a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final List f74689b = f0.j("__typename", "videoTrackingId", "videoUrl");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        i50.e value = (i50.e) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f71542a);
        writer.M0("videoTrackingId");
        k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f71543b);
        writer.M0("videoUrl");
        k0Var.d(writer, customScalarAdapters, value.f71544c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int V1 = reader.V1(f74689b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(str);
                    return new i50.e(str, str2, str3);
                }
                str3 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
