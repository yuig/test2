package k40;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l f78280a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78281b = f0.j("message", "paramPath");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.m value = (j40.m) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("message");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f74610a);
        writer.M0("paramPath");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f74611b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f78281b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(str);
                    return new j40.m(str, str2);
                }
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
