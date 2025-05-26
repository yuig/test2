package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f124045a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124046b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.g0 value = (u40.g0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(b0.f124035a)).d(writer, customScalarAdapters, value.f120327a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        u40.d0 d0Var = null;
        while (reader.V1(f124046b) == 0) {
            d0Var = (u40.d0) pc.c.b(pc.c.c(b0.f124035a)).f(reader, customScalarAdapters);
        }
        return new u40.g0(d0Var);
    }
}
