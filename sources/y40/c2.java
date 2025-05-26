package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c2 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c2 f136946a = new c2();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136947b = kotlin.collections.e0.b("products");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.m2 value = (x40.m2) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("products");
        pc.c.b(pc.c.a(pc.c.c(b2.f136916a))).d(writer, customScalarAdapters, value.f132802a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f136947b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.c(b2.f136916a))).f(reader, customScalarAdapters);
        }
        return new x40.m2(list);
    }
}
