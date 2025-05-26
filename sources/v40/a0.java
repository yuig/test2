package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f124030a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124031b = kotlin.collections.e0.b("v3GetCurrentUserHandlerQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.b0 value = (u40.b0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetCurrentUserHandlerQuery");
        pc.c.b(pc.c.c(s.f124087a)).d(writer, customScalarAdapters, value.f120295a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        u40.t tVar = null;
        while (reader.V1(f124031b) == 0) {
            tVar = (u40.t) pc.c.b(pc.c.c(s.f124087a)).f(reader, customScalarAdapters);
        }
        return new u40.b0(tVar);
    }
}
