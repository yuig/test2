package c40;

import b40.s0;
import b40.u0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f25746a = new q0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25747b = kotlin.collections.e0.b("v3UpdateObjectSubscriptionsForNotificationsGraphqlMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u0 value = (u0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3UpdateObjectSubscriptionsForNotificationsGraphqlMutation");
        pc.c.b(pc.c.c(o0.f25740a)).d(writer, customScalarAdapters, value.f21752a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        s0 s0Var = null;
        while (reader.V1(f25747b) == 0) {
            s0Var = (s0) pc.c.b(pc.c.c(o0.f25740a)).f(reader, customScalarAdapters);
        }
        return new u0(s0Var);
    }
}
