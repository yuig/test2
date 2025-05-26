package h30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class l implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l f66790a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final List f66791b = e0.b("v3RemoveDeviceTokenMutation");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        g30.m value = (g30.m) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3RemoveDeviceTokenMutation");
        pc.c.b(pc.c.c(k.f66789a)).d(writer, customScalarAdapters, value.f63430a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        g30.l lVar = null;
        while (reader.V1(f66791b) == 0) {
            lVar = (g30.l) pc.c.b(pc.c.c(k.f66789a)).f(reader, customScalarAdapters);
        }
        return new g30.m(lVar);
    }
}
