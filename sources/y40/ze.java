package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ze implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ze f137697a = new ze();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137698b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.eg value = (x40.eg) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(ae.f136905a)).d(writer, customScalarAdapters, value.f132360a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.ff ffVar = null;
        while (reader.V1(f137698b) == 0) {
            ffVar = (x40.ff) pc.c.b(pc.c.c(ae.f136905a)).f(reader, customScalarAdapters);
        }
        return new x40.eg(ffVar);
    }
}
