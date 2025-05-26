package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e5 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e5 f137014a = new e5();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137015b = kotlin.collections.e0.b("v3CreateConversationMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.q5 value = (x40.q5) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3CreateConversationMutation");
        pc.c.b(pc.c.c(d5.f136983a)).d(writer, customScalarAdapters, value.f133106a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.p5 p5Var = null;
        while (reader.V1(f137015b) == 0) {
            p5Var = (x40.p5) pc.c.b(pc.c.c(d5.f136983a)).f(reader, customScalarAdapters);
        }
        return new x40.q5(p5Var);
    }
}
