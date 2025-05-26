package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t5 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t5 f137498a = new t5();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137499b = kotlin.collections.e0.b("v3CreateThreadMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.h6 value = (x40.h6) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3CreateThreadMutation");
        pc.c.b(pc.c.c(s5.f137466a)).d(writer, customScalarAdapters, value.f132490a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.g6 g6Var = null;
        while (reader.V1(f137499b) == 0) {
            g6Var = (x40.g6) pc.c.b(pc.c.c(s5.f137466a)).f(reader, customScalarAdapters);
        }
        return new x40.h6(g6Var);
    }
}
