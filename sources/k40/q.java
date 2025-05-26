package k40;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q f78288a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78289b = e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.r value = (j40.r) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(p.f78286a)).d(writer, customScalarAdapters, value.f74623a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        j40.q qVar = null;
        while (reader.V1(f78289b) == 0) {
            qVar = (j40.q) pc.c.b(pc.c.c(p.f78286a)).f(reader, customScalarAdapters);
        }
        return new j40.r(qVar);
    }
}
