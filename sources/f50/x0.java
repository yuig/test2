package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f61196a = new x0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61197b = kotlin.collections.f0.j("text", "textTags");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.y0 value = (e50.y0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("text");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f57459a);
        writer.M0("textTags");
        pc.c.b(pc.c.a(pc.c.c(w0.f61192a))).d(writer, customScalarAdapters, value.f57460b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        List list = null;
        while (true) {
            int V1 = reader.V1(f61197b);
            if (V1 == 0) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new e50.y0(str, list);
                }
                list = (List) pc.c.b(pc.c.a(pc.c.c(w0.f61192a))).f(reader, customScalarAdapters);
            }
        }
    }
}
