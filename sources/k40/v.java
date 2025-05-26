package k40;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f78296a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78297b = e0.b("v3OrientationTopicsQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.w value = (j40.w) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3OrientationTopicsQuery");
        pc.c.b(pc.c.c(j.f78278a)).d(writer, customScalarAdapters, value.f74631a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        j40.k kVar = null;
        while (reader.V1(f78297b) == 0) {
            kVar = (j40.k) pc.c.b(pc.c.c(j.f78278a)).f(reader, customScalarAdapters);
        }
        return new j40.w(kVar);
    }
}
