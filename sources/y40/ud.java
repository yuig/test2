package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ud implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ud f137544a = new ud();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137545b = kotlin.collections.e0.b("v3LogPushNotificationMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.xe value = (x40.xe) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3LogPushNotificationMutation");
        pc.c.b(pc.c.c(td.f137513a)).d(writer, customScalarAdapters, value.f133689a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.we weVar = null;
        while (reader.V1(f137545b) == 0) {
            weVar = (x40.we) pc.c.b(pc.c.c(td.f137513a)).f(reader, customScalarAdapters);
        }
        return new x40.xe(weVar);
    }
}
