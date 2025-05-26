package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ub implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ub f137541a = new ub();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137542b = kotlin.collections.f0.j("__typename", "id", "entityId", "emails", "unread", "readTimesMs");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.rc value = (x40.rc) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133181a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133182b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133183c);
        writer.M0("emails");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value.f133184d);
        writer.M0("unread");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f133185e);
        writer.M0("readTimesMs");
        pc.c.b(pc.c.a(pc.c.c(tb.f137510a))).d(writer, customScalarAdapters, value.f133186f);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Integer num = null;
        List list2 = null;
        while (true) {
            int V1 = reader.V1(f137542b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str3 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                list = (List) pc.c.b(pc.c.a(pc.c.f99520a)).f(reader, customScalarAdapters);
            } else if (V1 == 4) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else {
                if (V1 != 5) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    Intrinsics.f(str3);
                    return new x40.rc(str, str2, str3, list, num, list2);
                }
                list2 = (List) pc.c.b(pc.c.a(pc.c.c(tb.f137510a))).f(reader, customScalarAdapters);
            }
        }
    }
}
