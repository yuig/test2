package k30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes.dex */
public final class g implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f78233a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78234b = e0.b("v3GetUserHandlerQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        j30.g value = (j30.g) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetUserHandlerQuery");
        pc.c.b(pc.c.c(d.f78229a)).d(writer, customScalarAdapters, value.f74552a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        j30.d dVar = null;
        while (reader.V1(f78234b) == 0) {
            dVar = (j30.d) pc.c.b(pc.c.c(d.f78229a)).f(reader, customScalarAdapters);
        }
        return new j30.g(dVar);
    }
}
