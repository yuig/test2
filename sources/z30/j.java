package z30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class j implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f140774a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final List f140775b = f0.j("node", "cursor");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        y30.j value = (y30.j) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(g.f140771a)).d(writer, customScalarAdapters, value.f136748a);
        writer.M0("cursor");
        pc.c.b(pc.c.f99520a).d(writer, customScalarAdapters, value.f136749b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        y30.g gVar = null;
        String str = null;
        while (true) {
            int V1 = reader.V1(f140775b);
            if (V1 == 0) {
                gVar = (y30.g) pc.c.b(pc.c.c(g.f140771a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new y30.j(gVar, str);
                }
                str = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            }
        }
    }
}
