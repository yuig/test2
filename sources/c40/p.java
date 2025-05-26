package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f25741a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25742b = kotlin.collections.e0.b("v3GetCurrentUserHandlerQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.q value = (b40.q) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetCurrentUserHandlerQuery");
        pc.c.b(pc.c.c(j.f25726a)).d(writer, customScalarAdapters, value.f21739a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        b40.k kVar = null;
        while (reader.V1(f25742b) == 0) {
            kVar = (b40.k) pc.c.b(pc.c.c(j.f25726a)).f(reader, customScalarAdapters);
        }
        return new b40.q(kVar);
    }
}
