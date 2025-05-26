package q30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class l implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l f102292a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final List f102293b = e0.b("v3EmailFollowUserMutation");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p30.m value = (p30.m) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3EmailFollowUserMutation");
        pc.c.b(pc.c.c(k.f102291a)).d(writer, customScalarAdapters, value.f98744a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        p30.l lVar = null;
        while (reader.V1(f102293b) == 0) {
            lVar = (p30.l) pc.c.b(pc.c.c(k.f102291a)).f(reader, customScalarAdapters);
        }
        return new p30.m(lVar);
    }
}
