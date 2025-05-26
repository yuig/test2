package n40;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.k0;
import pc.v;

/* loaded from: classes5.dex */
public final class e implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f89200a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final List f89201b = f0.j("countryCode", "countryName");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        m40.e value = (m40.e) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("countryCode");
        k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f85821a);
        writer.M0("countryName");
        k0Var.d(writer, customScalarAdapters, value.f85822b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f89201b);
            if (V1 == 0) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new m40.e(str, str2);
                }
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
