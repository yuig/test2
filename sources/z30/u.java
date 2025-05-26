package z30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes.dex */
public final class u implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final u f140790a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final List f140791b = e0.b("v3GetUserStateQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        y30.v value = (y30.v) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetUserStateQuery");
        pc.c.b(pc.c.c(t.f140789a)).d(writer, customScalarAdapters, value.f136769a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        y30.u uVar = null;
        while (reader.V1(f140791b) == 0) {
            uVar = (y30.u) pc.c.b(pc.c.c(t.f140789a)).f(reader, customScalarAdapters);
        }
        return new y30.v(uVar);
    }
}
