package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ve implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ve f137576a = new ve();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137577b = kotlin.collections.f0.j("pageCount", "metadata", "isDeleted");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ag value = (x40.ag) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("pageCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f131968a);
        writer.M0("metadata");
        pc.c.b(pc.c.c(ue.f137546a)).d(writer, customScalarAdapters, value.f131969b);
        writer.M0("isDeleted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f131970c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        x40.zf zfVar = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f137577b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                zfVar = (x40.zf) pc.c.b(pc.c.c(ue.f137546a)).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new x40.ag(num, zfVar, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
