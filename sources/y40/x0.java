package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f137611a = new x0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137612b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.f1 value = (x40.f1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(v0.f137554a)).d(writer, customScalarAdapters, value.f132369a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.d1 d1Var = null;
        while (reader.V1(f137612b) == 0) {
            d1Var = (x40.d1) pc.c.b(pc.c.c(v0.f137554a)).f(reader, customScalarAdapters);
        }
        return new x40.f1(d1Var);
    }
}
