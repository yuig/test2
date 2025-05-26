package w30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes3.dex */
public final class g implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f127903a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final List f127904b = e0.b("v3FollowUserMethodMutation");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        v30.g value = (v30.g) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3FollowUserMethodMutation");
        pc.c.b(pc.c.c(d.f127899a)).d(writer, customScalarAdapters, value.f123930a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        v30.d dVar = null;
        while (reader.V1(f127904b) == 0) {
            dVar = (v30.d) pc.c.b(pc.c.c(d.f127899a)).f(reader, customScalarAdapters);
        }
        return new v30.g(dVar);
    }
}
