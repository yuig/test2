package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hg implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final hg f137136a = new hg();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137137b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.nh value = (x40.nh) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(gg.f137104a)).d(writer, customScalarAdapters, value.f132900a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.mh mhVar = null;
        while (reader.V1(f137137b) == 0) {
            mhVar = (x40.mh) pc.c.b(pc.c.c(gg.f137104a)).f(reader, customScalarAdapters);
        }
        return new x40.nh(mhVar);
    }
}
