package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qa implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final qa f137415a = new qa();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137416b = kotlin.collections.e0.b("edges");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.kb value = (x40.kb) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(pa.f137384a)))).d(writer, customScalarAdapters, value.f132673a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f137416b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(pa.f137384a)))).f(reader, customScalarAdapters);
        }
        return new x40.kb(list);
    }
}
