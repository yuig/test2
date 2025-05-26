package f50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f61175a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61176b = kotlin.collections.f0.j("headerDisplay", "cornerRadius");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        e50.t value = (e50.t) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("headerDisplay");
        pc.c.b(pc.c.c(r.f61171a)).d(writer, customScalarAdapters, value.f57420a);
        writer.M0("cornerRadius");
        pc.c.f99525f.d(writer, customScalarAdapters, value.f57421b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        e50.s sVar = null;
        Double d2 = null;
        while (true) {
            int V1 = reader.V1(f61176b);
            if (V1 == 0) {
                sVar = (e50.s) pc.c.b(pc.c.c(r.f61171a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new e50.t(sVar, d2);
                }
                d2 = (Double) pc.c.f99525f.f(reader, customScalarAdapters);
            }
        }
    }
}
