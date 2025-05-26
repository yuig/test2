package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f25715a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25716b = kotlin.collections.e0.b("v3DeleteNewsHubBadgeMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.f value = (b40.f) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3DeleteNewsHubBadgeMutation");
        pc.c.b(pc.c.c(e.f25712a)).d(writer, customScalarAdapters, value.f21705a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        b40.e eVar = null;
        while (reader.V1(f25716b) == 0) {
            eVar = (b40.e) pc.c.b(pc.c.c(e.f25712a)).f(reader, customScalarAdapters);
        }
        return new b40.f(eVar);
    }
}
