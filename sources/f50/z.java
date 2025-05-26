package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final z f61201a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61202b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.a0 value = (e50.a0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(p.f61165a)).d(writer, customScalarAdapters, value.f57257a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        e50.q qVar = null;
        while (reader.V1(f61202b) == 0) {
            qVar = (e50.q) pc.c.b(pc.c.c(p.f61165a)).f(reader, customScalarAdapters);
        }
        return new e50.a0(qVar);
    }
}
