package q50;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class f implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f102555a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final List f102556b = e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p50.f value = (p50.f) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(e.f102553a)).d(writer, customScalarAdapters, value.f98863a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        p50.e eVar = null;
        while (reader.V1(f102556b) == 0) {
            eVar = (p50.e) pc.c.b(pc.c.c(e.f102553a)).f(reader, customScalarAdapters);
        }
        return new p50.f(eVar);
    }
}
