package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f137236a = new l1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137237b = kotlin.collections.e0.b("products");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.v1 value = (x40.v1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("products");
        pc.c.b(pc.c.a(pc.c.c(k1.f137206a))).d(writer, customScalarAdapters, value.f133524a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f137237b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.c(k1.f137206a))).f(reader, customScalarAdapters);
        }
        return new x40.v1(list);
    }
}
