package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f124068a = new l0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124069b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.o0 value = (u40.o0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(f0.f124050a)).d(writer, customScalarAdapters, value.f120410a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        u40.i0 i0Var = null;
        while (reader.V1(f124069b) == 0) {
            i0Var = (u40.i0) pc.c.b(pc.c.c(f0.f124050a)).f(reader, customScalarAdapters);
        }
        return new u40.o0(i0Var);
    }
}
