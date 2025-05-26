package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class re implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final re f137451a = new re();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137452b = kotlin.collections.e0.b("products");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.wf value = (x40.wf) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("products");
        pc.c.b(pc.c.a(pc.c.c(qe.f137421a))).d(writer, customScalarAdapters, value.a());
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f137452b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.c(qe.f137421a))).f(reader, customScalarAdapters);
        }
        return new x40.wf(list);
    }
}
