package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ic implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ic f137162a = new ic();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137163b = kotlin.collections.e0.b("edges");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.gd value = (x40.gd) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("edges");
        pc.c.b(pc.c.a(pc.c.b(pc.c.c(hc.f137130a)))).d(writer, customScalarAdapters, value.f132450a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f137163b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.b(pc.c.c(hc.f137130a)))).f(reader, customScalarAdapters);
        }
        return new x40.gd(list);
    }
}
