package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ba implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ba f136931a = new ba();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136932b = kotlin.collections.e0.b("products");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.va value = (x40.va) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("products");
        pc.c.b(pc.c.a(pc.c.c(aa.f136898a))).d(writer, customScalarAdapters, value.f133550a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f136932b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.c(aa.f136898a))).f(reader, customScalarAdapters);
        }
        return new x40.va(list);
    }
}
