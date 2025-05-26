package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x2 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final x2 f137615a = new x2();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137616b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.h3 value = (x40.h3) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(v2.f137557a)).d(writer, customScalarAdapters, value.f132468a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.f3 f3Var = null;
        while (reader.V1(f137616b) == 0) {
            f3Var = (x40.f3) pc.c.b(pc.c.c(v2.f137557a)).f(reader, customScalarAdapters);
        }
        return new x40.h3(f3Var);
    }
}
