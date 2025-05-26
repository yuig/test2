package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f137490a = new t0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137491b = kotlin.collections.e0.b("v3BatchDeclineContactRequestsMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.a1 value = (x40.a1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3BatchDeclineContactRequestsMutation");
        pc.c.b(pc.c.c(q0.f137398a)).d(writer, customScalarAdapters, value.f131894a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.x0 x0Var = null;
        while (reader.V1(f137491b) == 0) {
            x0Var = (x40.x0) pc.c.b(pc.c.c(q0.f137398a)).f(reader, customScalarAdapters);
        }
        return new x40.a1(x0Var);
    }
}
