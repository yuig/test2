package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f124107a = new y0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124108b = kotlin.collections.f0.j("cursor", "node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.c1 value = (u40.c1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("cursor");
        pc.c.b(pc.c.f99520a).d(writer, customScalarAdapters, value.f120313a);
        writer.M0("node");
        pc.c.b(pc.c.c(x0.f124104a)).d(writer, customScalarAdapters, value.f120314b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        u40.b1 b1Var = null;
        while (true) {
            int V1 = reader.V1(f124108b);
            if (V1 == 0) {
                str = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new u40.c1(str, b1Var);
                }
                b1Var = (u40.b1) pc.c.b(pc.c.c(x0.f124104a)).f(reader, customScalarAdapters);
            }
        }
    }
}
