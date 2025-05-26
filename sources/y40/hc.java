package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hc implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final hc f137130a = new hc();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137131b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.fd value = (x40.fd) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(gc.f137098a)).d(writer, customScalarAdapters, value.f132411a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.ed edVar = null;
        while (reader.V1(f137131b) == 0) {
            edVar = (x40.ed) pc.c.b(pc.c.c(gc.f137098a)).f(reader, customScalarAdapters);
        }
        return new x40.fd(edVar);
    }
}
