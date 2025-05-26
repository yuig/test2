package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m4 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final m4 f137274a = new m4();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137275b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.x4 value = (x40.x4) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(l4.f137242a)).d(writer, customScalarAdapters, value.f133672a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.w4 w4Var = null;
        while (reader.V1(f137275b) == 0) {
            w4Var = (x40.w4) pc.c.b(pc.c.c(l4.f137242a)).f(reader, customScalarAdapters);
        }
        return new x40.x4(w4Var);
    }
}
