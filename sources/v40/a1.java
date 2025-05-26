package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f124032a = new a1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124033b = kotlin.collections.f0.j("pageInfo", "edges");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.e1 value = (u40.e1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageInfo");
        pc.c.c(z0.f124110a).d(writer, customScalarAdapters, value.f120321a);
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(y0.f124107a)))).d(writer, customScalarAdapters, value.f120322b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        u40.d1 d1Var = null;
        List list = null;
        while (true) {
            int V1 = reader.V1(f124033b);
            if (V1 == 0) {
                d1Var = (u40.d1) pc.c.c(z0.f124110a).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(d1Var);
                    return new u40.e1(d1Var, list);
                }
                list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(y0.f124107a)))).f(reader, customScalarAdapters);
            }
        }
    }
}
