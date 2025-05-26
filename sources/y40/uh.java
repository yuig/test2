package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.dj;
import x40.ji;

/* loaded from: classes.dex */
public final class uh implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final uh f137551a = new uh();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137552b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        dj value = (dj) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(ah.f136910a)).d(writer, customScalarAdapters, value.f132293a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        ji jiVar = null;
        while (reader.V1(f137552b) == 0) {
            jiVar = (ji) pc.c.b(pc.c.c(ah.f136910a)).f(reader, customScalarAdapters);
        }
        return new dj(jiVar);
    }
}
