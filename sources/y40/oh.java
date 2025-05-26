package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.wi;
import x40.xi;

/* loaded from: classes5.dex */
public final class oh implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final oh f137363a = new oh();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137364b = kotlin.collections.f0.j("cursor", "node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        xi value = (xi) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("cursor");
        pc.c.b(pc.c.f99520a).d(writer, customScalarAdapters, value.f133712a);
        writer.M0("node");
        pc.c.b(pc.c.c(nh.f137331a)).d(writer, customScalarAdapters, value.f133713b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        wi wiVar = null;
        while (true) {
            int V1 = reader.V1(f137364b);
            if (V1 == 0) {
                str = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new xi(str, wiVar);
                }
                wiVar = (wi) pc.c.b(pc.c.c(nh.f137331a)).f(reader, customScalarAdapters);
            }
        }
    }
}
