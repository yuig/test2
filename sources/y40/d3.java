package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d3 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d3 f136979a = new d3();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136980b = kotlin.collections.e0.b("__typename");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.o3 value = (x40.o3) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f132922a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f136980b) == 0) {
            str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
        }
        Intrinsics.f(str);
        return new x40.o3(str);
    }
}
