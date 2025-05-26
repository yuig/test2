package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.gi;
import x40.hi;

/* loaded from: classes5.dex */
public final class zg implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final zg f137701a = new zg();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137702b = kotlin.collections.e0.b("v3ReportContactRequestsMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        hi value = (hi) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3ReportContactRequestsMutation");
        pc.c.b(pc.c.c(yg.f137670a)).d(writer, customScalarAdapters, value.f132513a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        gi giVar = null;
        while (reader.V1(f137702b) == 0) {
            giVar = (gi) pc.c.b(pc.c.c(yg.f137670a)).f(reader, customScalarAdapters);
        }
        return new hi(giVar);
    }
}
