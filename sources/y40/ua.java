package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ua implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ua f137539a = new ua();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137540b = kotlin.collections.e0.b("node");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ob value = (x40.ob) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("node");
        pc.c.b(pc.c.c(ta.f137508a)).d(writer, customScalarAdapters, value.a());
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.nb nbVar = null;
        while (reader.V1(f137540b) == 0) {
            nbVar = (x40.nb) pc.c.b(pc.c.c(ta.f137508a)).f(reader, customScalarAdapters);
        }
        return new x40.ob(nbVar);
    }
}
