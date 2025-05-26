package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f25720a = new g0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25721b = kotlin.collections.e0.b("id");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.j0 value = (b40.j0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("id");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f21719a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f25721b) == 0) {
            str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
        }
        Intrinsics.f(str);
        return new b40.j0(str);
    }
}
