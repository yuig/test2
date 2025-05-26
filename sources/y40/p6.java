package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p6 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p6 f137377a = new p6();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137378b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.h7 value = (x40.h7) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(o6.f137343a)).d(writer, customScalarAdapters, value.f132491a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.g7 g7Var = null;
        while (reader.V1(f137378b) == 0) {
            g7Var = (x40.g7) pc.c.b(pc.c.c(o6.f137343a)).f(reader, customScalarAdapters);
        }
        return new x40.h7(g7Var);
    }
}
