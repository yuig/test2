package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z6 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final z6 f137683a = new z6();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137684b = kotlin.collections.e0.b("__typename");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.s7 value = (x40.s7) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f133241a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f137684b) == 0) {
            str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
        }
        Intrinsics.f(str);
        return new x40.s7(str);
    }
}
