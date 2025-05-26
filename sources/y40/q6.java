package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q6 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q6 f137408a = new q6();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137409b = kotlin.collections.e0.b("edges");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.i7 value = (x40.i7) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(p6.f137377a)))).d(writer, customScalarAdapters, value.f132543a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f137409b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(p6.f137377a)))).f(reader, customScalarAdapters);
        }
        return new x40.i7(list);
    }
}
