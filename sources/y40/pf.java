package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pf implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final pf f137392a = new pf();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137393b = kotlin.collections.e0.b("officialUser");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.vg value = (x40.vg) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("officialUser");
        pc.c.b(pc.c.c(of.f137359a)).d(writer, customScalarAdapters, value.f133557a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.ug ugVar = null;
        while (reader.V1(f137393b) == 0) {
            ugVar = (x40.ug) pc.c.b(pc.c.c(of.f137359a)).f(reader, customScalarAdapters);
        }
        return new x40.vg(ugVar);
    }
}
