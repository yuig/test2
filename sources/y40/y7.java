package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y7 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y7 f137655a = new y7();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137656b = kotlin.collections.f0.j("pageCount", "metadata", "isDeleted");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.r8 value = (x40.r8) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133175a);
        writer.M0("metadata");
        pc.c.b(pc.c.c(x7.f137624a)).d(writer, customScalarAdapters, value.f133176b);
        writer.M0("isDeleted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f133177c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        x40.q8 q8Var = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f137656b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                q8Var = (x40.q8) pc.c.b(pc.c.c(x7.f137624a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.r8(num, q8Var, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
