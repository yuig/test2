package t30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class l implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l f116311a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final List f116312b = f0.j("clusters", "publishStatus");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        s30.m value = (s30.m) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("clusters");
        pc.c.b(pc.c.a(pc.c.c(k.f116309a))).d(writer, customScalarAdapters, value.f111043a);
        writer.M0("publishStatus");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f111044b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        String str = null;
        while (true) {
            int V1 = reader.V1(f116312b);
            if (V1 == 0) {
                list = (List) pc.c.b(pc.c.a(pc.c.c(k.f116309a))).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new s30.m(list, str);
                }
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
