package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l5 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l5 f137244a = new l5();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137245b = kotlin.collections.e0.b("v3CreateRequestToJoinBoardMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.y5 value = (x40.y5) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3CreateRequestToJoinBoardMutation");
        pc.c.b(pc.c.c(k5.f137214a)).d(writer, customScalarAdapters, value.f133725a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.x5 x5Var = null;
        while (reader.V1(f137245b) == 0) {
            x5Var = (x40.x5) pc.c.b(pc.c.c(k5.f137214a)).f(reader, customScalarAdapters);
        }
        return new x40.y5(x5Var);
    }
}
