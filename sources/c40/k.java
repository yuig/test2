package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f25728a = new k();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.l value = (b40.l) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof b40.o)) {
            if (value instanceof b40.m) {
                List list = l.f25731a;
                l.b(writer, customScalarAdapters, (b40.m) value);
                return;
            }
            return;
        }
        List list2 = n.f25737a;
        b40.o value2 = (b40.o) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value2, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value2.f21729b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value2.f21730c);
        writer.M0("badgeCounts");
        pc.c.b(pc.c.c(m.f25734a)).d(writer, customScalarAdapters, value2.f21731d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "User")) {
            return l.a(reader, customScalarAdapters, typename);
        }
        List list = n.f25737a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        String str = null;
        b40.n nVar = null;
        while (true) {
            int V1 = reader.V1(n.f25737a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(typename);
                    Intrinsics.f(str);
                    return new b40.o(typename, str, nVar);
                }
                nVar = (b40.n) pc.c.b(pc.c.c(m.f25734a)).f(reader, customScalarAdapters);
            }
        }
    }
}
