package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d7 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d7 f136985a = new d7();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136986b = kotlin.collections.e0.b("products");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.w7 value = (x40.w7) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("products");
        pc.c.b(pc.c.a(pc.c.c(c7.f136954a))).d(writer, customScalarAdapters, value.f133596a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f136986b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.c(c7.f136954a))).f(reader, customScalarAdapters);
        }
        return new x40.w7(list);
    }
}
