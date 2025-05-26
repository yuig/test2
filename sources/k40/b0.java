package k40;

import j40.d0;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f78267a = new b0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78268b = e0.b("v3OrientationStatusQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        d0 value = (d0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3OrientationStatusQuery");
        pc.c.b(pc.c.c(z.f78302a)).d(writer, customScalarAdapters, value.f74599a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        j40.b0 b0Var = null;
        while (reader.V1(f78268b) == 0) {
            b0Var = (j40.b0) pc.c.b(pc.c.c(z.f78302a)).f(reader, customScalarAdapters);
        }
        return new d0(b0Var);
    }
}
