package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h3 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final h3 f137114a = new h3();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137115b = kotlin.collections.e0.b("products");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.s3 value = (x40.s3) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("products");
        pc.c.b(pc.c.a(pc.c.c(g3.f137081a))).d(writer, customScalarAdapters, value.f133226a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f137115b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.c(g3.f137081a))).f(reader, customScalarAdapters);
        }
        return new x40.s3(list);
    }
}
