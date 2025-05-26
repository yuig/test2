package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f137075a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137076b = kotlin.collections.e0.b("v3AddThreadMessageMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.k0 value = (x40.k0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3AddThreadMessageMutation");
        pc.c.b(pc.c.c(f0.f137038a)).d(writer, customScalarAdapters, value.f132627a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.j0 j0Var = null;
        while (reader.V1(f137076b) == 0) {
            j0Var = (x40.j0) pc.c.b(pc.c.c(f0.f137038a)).f(reader, customScalarAdapters);
        }
        return new x40.k0(j0Var);
    }
}
