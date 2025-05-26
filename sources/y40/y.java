package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y f137640a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137641b = kotlin.collections.e0.b("v3AddConversationPinSeenMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.b0 value = (x40.b0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3AddConversationPinSeenMutation");
        pc.c.b(pc.c.c(x.f137610a)).d(writer, customScalarAdapters, value.f131998a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.a0 a0Var = null;
        while (reader.V1(f137641b) == 0) {
            a0Var = (x40.a0) pc.c.b(pc.c.c(x.f137610a)).f(reader, customScalarAdapters);
        }
        return new x40.b0(a0Var);
    }
}
