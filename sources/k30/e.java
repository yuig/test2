package k30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes.dex */
public final class e implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f78230a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78231b = f0.j("__typename", "conversationBadgeCount");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        j30.e value = (j30.e) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f74548a);
        writer.M0("conversationBadgeCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f74549b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Integer num = null;
        while (true) {
            int V1 = reader.V1(f78231b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(str);
                    return new j30.e(str, num);
                }
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
