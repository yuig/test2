package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o f124076a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124077b = kotlin.collections.e0.b("v3EditSettingsHandlerMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.o value = (u40.o) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3EditSettingsHandlerMutation");
        pc.c.b(pc.c.c(n.f124073a)).d(writer, customScalarAdapters, value.f120409a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        u40.n nVar = null;
        while (reader.V1(f124077b) == 0) {
            nVar = (u40.n) pc.c.b(pc.c.c(n.f124073a)).f(reader, customScalarAdapters);
        }
        return new u40.o(nVar);
    }
}
