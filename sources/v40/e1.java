package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u40.i1;

/* loaded from: classes5.dex */
public final class e1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f124047a = new e1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124048b = kotlin.collections.e0.b("v3GetUserHandlerQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        i1 value = (i1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetUserHandlerQuery");
        pc.c.b(pc.c.c(p0.f124081a)).d(writer, customScalarAdapters, value.f120339a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        u40.t0 t0Var = null;
        while (reader.V1(f124048b) == 0) {
            t0Var = (u40.t0) pc.c.b(pc.c.c(p0.f124081a)).f(reader, customScalarAdapters);
        }
        return new i1(t0Var);
    }
}
