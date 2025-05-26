package t30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class j implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f116307a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final List f116308b = f0.j("actionUri", "image");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        s30.k value = (s30.k) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("actionUri");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f111038a);
        writer.M0("image");
        pc.c.b(pc.c.c(i.f116305a)).d(writer, customScalarAdapters, value.f111039b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        s30.j jVar = null;
        while (true) {
            int V1 = reader.V1(f116308b);
            if (V1 == 0) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new s30.k(str, jVar);
                }
                jVar = (s30.j) pc.c.b(pc.c.c(i.f116305a)).f(reader, customScalarAdapters);
            }
        }
    }
}
