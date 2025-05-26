package q50;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class m implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final m f102565a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final List f102566b = f0.j("entityId", "imageMediumUrl");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p50.n value = (p50.n) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("entityId");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f98875a);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f98876b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f102566b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(str);
                    return new p50.n(str, str2);
                }
                str2 = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            }
        }
    }
}
