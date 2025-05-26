package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y5 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y5 f137651a = new y5();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137652b = kotlin.collections.e0.b("v3DeclineContactRequestsMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.o6 value = (x40.o6) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3DeclineContactRequestsMutation");
        pc.c.b(pc.c.c(x5.f137621a)).d(writer, customScalarAdapters, value.f132941a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.n6 n6Var = null;
        while (reader.V1(f137652b) == 0) {
            n6Var = (x40.n6) pc.c.b(pc.c.c(x5.f137621a)).f(reader, customScalarAdapters);
        }
        return new x40.o6(n6Var);
    }
}
