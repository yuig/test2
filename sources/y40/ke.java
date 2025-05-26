package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ke implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ke f137227a = new ke();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137228b = kotlin.collections.e0.b("officialUser");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.pf value = (x40.pf) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("officialUser");
        pc.c.b(pc.c.c(je.f137196a)).d(writer, customScalarAdapters, value.f133043a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.of ofVar = null;
        while (reader.V1(f137228b) == 0) {
            ofVar = (x40.of) pc.c.b(pc.c.c(je.f137196a)).f(reader, customScalarAdapters);
        }
        return new x40.pf(ofVar);
    }
}
