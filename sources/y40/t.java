package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f137488a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137489b = kotlin.collections.e0.b("v3AddConversationMessageMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.v value = (x40.v) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3AddConversationMessageMutation");
        pc.c.b(pc.c.c(s.f137457a)).d(writer, customScalarAdapters, value.f133521a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.u uVar = null;
        while (reader.V1(f137489b) == 0) {
            uVar = (x40.u) pc.c.b(pc.c.c(s.f137457a)).f(reader, customScalarAdapters);
        }
        return new x40.v(uVar);
    }
}
