package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xc implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final xc f137632a = new xc();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137633b = kotlin.collections.e0.b("v3HideConversationMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.wd value = (x40.wd) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3HideConversationMutation");
        pc.c.b(pc.c.c(vc.f137573a)).d(writer, customScalarAdapters, value.f133626a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.ud udVar = null;
        while (reader.V1(f137633b) == 0) {
            udVar = (x40.ud) pc.c.b(pc.c.c(vc.f137573a)).f(reader, customScalarAdapters);
        }
        return new x40.wd(udVar);
    }
}
