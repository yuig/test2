package w30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;
import v30.o;

/* loaded from: classes3.dex */
public final class n implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n f127913a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final List f127914b = e0.b("v3UnfollowUserMethodMutation");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        o value = (o) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3UnfollowUserMethodMutation");
        pc.c.b(pc.c.c(k.f127909a)).d(writer, customScalarAdapters, value.f123945a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        v30.l lVar = null;
        while (reader.V1(f127914b) == 0) {
            lVar = (v30.l) pc.c.b(pc.c.c(k.f127909a)).f(reader, customScalarAdapters);
        }
        return new o(lVar);
    }
}
