package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k9 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k9 f137219a = new k9();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137220b = kotlin.collections.e0.b("products");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ea value = (x40.ea) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("products");
        pc.c.b(pc.c.a(pc.c.c(j9.f137188a))).d(writer, customScalarAdapters, value.f132322a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f137220b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.c(j9.f137188a))).f(reader, customScalarAdapters);
        }
        return new x40.ea(list);
    }
}
