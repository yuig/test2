package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q2 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q2 f137401a = new q2();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137402b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.a3 value = (x40.a3) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(p2.f137370a)).d(writer, customScalarAdapters, value.f131912a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.z2 z2Var = null;
        while (reader.V1(f137402b) == 0) {
            z2Var = (x40.z2) pc.c.b(pc.c.c(p2.f137370a)).f(reader, customScalarAdapters);
        }
        return new x40.a3(z2Var);
    }
}
