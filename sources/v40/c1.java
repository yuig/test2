package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u40.g1;

/* loaded from: classes5.dex */
public final class c1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f124039a = new c1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124040b = kotlin.collections.f0.j("followerCount", "followers");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        g1 value = (g1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("followerCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f120328a);
        writer.M0("followers");
        pc.c.b(pc.c.c(s0.f124088a)).d(writer, customScalarAdapters, value.f120329b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        u40.w0 w0Var = null;
        while (true) {
            int V1 = reader.V1(f124040b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new g1(num, w0Var);
                }
                w0Var = (u40.w0) pc.c.b(pc.c.c(s0.f124088a)).f(reader, customScalarAdapters);
            }
        }
    }
}
