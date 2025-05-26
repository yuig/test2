package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class he implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final he f137133a = new he();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137134b = kotlin.collections.e0.b("officialUser");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.mf value = (x40.mf) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("officialUser");
        pc.c.b(pc.c.c(ge.f137101a)).d(writer, customScalarAdapters, value.a());
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.lf lfVar = null;
        while (reader.V1(f137134b) == 0) {
            lfVar = (x40.lf) pc.c.b(pc.c.c(ge.f137101a)).f(reader, customScalarAdapters);
        }
        return new x40.mf(lfVar);
    }
}
