package q50;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class l implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l f102564a = new l();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p50.m value = (p50.m) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof p50.o) {
            List list = n.f102567a;
            p50.o value2 = (p50.o) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f98877a);
            writer.M0("data");
            pc.c.a(pc.c.b(pc.c.c(m.f102565a))).b(writer, customScalarAdapters, value2.f98878b);
            return;
        }
        if (value instanceof p50.l) {
            List list2 = k.f102563a;
            p50.l value3 = (p50.l) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f98874a);
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "V3AndroidWidgetGetHomefeedPins")) {
            List list = k.f102563a;
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(typename, "typename");
            while (reader.V1(k.f102563a) == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
            Intrinsics.f(typename);
            return new p50.l(typename);
        }
        List list2 = n.f102567a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        ArrayList arrayList = null;
        while (true) {
            int V1 = reader.V1(n.f102567a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    Intrinsics.f(arrayList);
                    return new p50.o(typename, arrayList);
                }
                arrayList = pc.c.a(pc.c.b(pc.c.c(m.f102565a))).a(reader, customScalarAdapters);
            }
        }
    }
}
