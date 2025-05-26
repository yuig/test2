package t30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;
import s30.s;

/* loaded from: classes2.dex */
public final class r implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f116319a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final List f116320b = e0.b("v3AndroidCubesClustersQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        s value = (s) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3AndroidCubesClustersQuery");
        pc.c.b(pc.c.c(q.f116318a)).d(writer, customScalarAdapters, value.f111053a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        s30.r rVar = null;
        while (reader.V1(f116320b) == 0) {
            rVar = (s30.r) pc.c.b(pc.c.c(q.f116318a)).f(reader, customScalarAdapters);
        }
        return new s(rVar);
    }
}
