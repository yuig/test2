package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w4 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w4 f137589a = new w4();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137590b = kotlin.collections.e0.b("v3CreateConversationMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.h5 value = (x40.h5) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3CreateConversationMutation");
        pc.c.b(pc.c.c(v4.f137560a)).d(writer, customScalarAdapters, value.f132489a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.g5 g5Var = null;
        while (reader.V1(f137590b) == 0) {
            g5Var = (x40.g5) pc.c.b(pc.c.c(v4.f137560a)).f(reader, customScalarAdapters);
        }
        return new x40.h5(g5Var);
    }
}
