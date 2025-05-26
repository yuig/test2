package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r2 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r2 f137433a = new r2();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137434b = kotlin.collections.e0.b("edges");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.b3 value = (x40.b3) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(q2.f137401a)))).d(writer, customScalarAdapters, value.f132003a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f137434b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(q2.f137401a)))).f(reader, customScalarAdapters);
        }
        return new x40.b3(list);
    }
}
