package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fa implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final fa f137057a = new fa();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137058b = kotlin.collections.f0.j("pageCount", "metadata", "isDeleted");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.za value = (x40.za) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133815a);
        writer.M0("metadata");
        pc.c.b(pc.c.c(ea.f137022a)).d(writer, customScalarAdapters, value.f133816b);
        writer.M0("isDeleted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f133817c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        x40.ya yaVar = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f137058b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                yaVar = (x40.ya) pc.c.b(pc.c.c(ea.f137022a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.za(num, yaVar, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
