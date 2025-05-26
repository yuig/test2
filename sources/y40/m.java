package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final m f137265a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137266b = kotlin.collections.e0.b("v3AcceptContactRequestsMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.n value = (x40.n) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3AcceptContactRequestsMutation");
        pc.c.b(pc.c.c(l.f137234a)).d(writer, customScalarAdapters, value.f132856a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.m mVar = null;
        while (reader.V1(f137266b) == 0) {
            mVar = (x40.m) pc.c.b(pc.c.c(l.f137234a)).f(reader, customScalarAdapters);
        }
        return new x40.n(mVar);
    }
}
