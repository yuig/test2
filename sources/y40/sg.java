package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.yh;
import x40.zh;

/* loaded from: classes5.dex */
public final class sg implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final sg f137484a = new sg();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137485b = kotlin.collections.e0.b("v3RemoveBoardCollaboratorsMutationv2");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        zh value = (zh) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3RemoveBoardCollaboratorsMutationv2");
        pc.c.b(pc.c.c(rg.f137455a)).d(writer, customScalarAdapters, value.f133830a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        yh yhVar = null;
        while (reader.V1(f137485b) == 0) {
            yhVar = (yh) pc.c.b(pc.c.c(rg.f137455a)).f(reader, customScalarAdapters);
        }
        return new zh(yhVar);
    }
}
