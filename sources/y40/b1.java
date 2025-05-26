package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f136914a = new b1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136915b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.k1 value = (x40.k1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(z0.f137673a)).d(writer, customScalarAdapters, value.f132628a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.i1 i1Var = null;
        while (reader.V1(f136915b) == 0) {
            i1Var = (x40.i1) pc.c.b(pc.c.c(z0.f137673a)).f(reader, customScalarAdapters);
        }
        return new x40.k1(i1Var);
    }
}
