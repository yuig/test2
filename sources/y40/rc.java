package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rc implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final rc f137448a = new rc();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137449b = kotlin.collections.e0.b("v3GetConversationQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.pd value = (x40.pd) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetConversationQuery");
        pc.c.b(pc.c.c(qc.f137418a)).d(writer, customScalarAdapters, value.f133041a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.od odVar = null;
        while (reader.V1(f137449b) == 0) {
            odVar = (x40.od) pc.c.b(pc.c.c(qc.f137418a)).f(reader, customScalarAdapters);
        }
        return new x40.pd(odVar);
    }
}
