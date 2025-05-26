package h30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes.dex */
public final class f implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f66782a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final List f66783b = e0.b("v3AddDeviceTokenMutation");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        g30.f value = (g30.f) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3AddDeviceTokenMutation");
        pc.c.b(pc.c.c(e.f66781a)).d(writer, customScalarAdapters, value.f63419a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        g30.e eVar = null;
        while (reader.V1(f66783b) == 0) {
            eVar = (g30.e) pc.c.b(pc.c.c(e.f66781a)).f(reader, customScalarAdapters);
        }
        return new g30.f(eVar);
    }
}
