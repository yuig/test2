package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f61160a = new n0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61161b = kotlin.collections.e0.b("tabs");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.o0 value = (e50.o0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("tabs");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(m0.f61157a)))).d(writer, customScalarAdapters, value.f57401a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f61161b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(m0.f61157a)))).f(reader, customScalarAdapters);
        }
        return new e50.o0(list);
    }
}
