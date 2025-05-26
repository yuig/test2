package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f61135a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61136b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.g value = (e50.g) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(a.f61106a)).d(writer, customScalarAdapters, value.f57346a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        e50.a aVar = null;
        while (reader.V1(f61136b) == 0) {
            aVar = (e50.a) pc.c.b(pc.c.c(a.f61106a)).f(reader, customScalarAdapters);
        }
        return new e50.g(aVar);
    }
}
