package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dc implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final dc f136994a = new dc();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136995b = kotlin.collections.e0.b("v3GetUserContactRequestsByUserQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ad value = (x40.ad) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetUserContactRequestsByUserQuery");
        pc.c.b(pc.c.c(mb.f137288a)).d(writer, customScalarAdapters, value.f131964a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.ic icVar = null;
        while (reader.V1(f136995b) == 0) {
            icVar = (x40.ic) pc.c.b(pc.c.c(mb.f137288a)).f(reader, customScalarAdapters);
        }
        return new x40.ad(icVar);
    }
}
