package k40;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f78272a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78273b = e0.b("v3OrientationSignalsMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.f value = (j40.f) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3OrientationSignalsMutation");
        pc.c.b(pc.c.c(d.f78270a)).d(writer, customScalarAdapters, value.f74602a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        j40.d dVar = null;
        while (reader.V1(f78273b) == 0) {
            dVar = (j40.d) pc.c.b(pc.c.c(d.f78270a)).f(reader, customScalarAdapters);
        }
        return new j40.f(dVar);
    }
}
