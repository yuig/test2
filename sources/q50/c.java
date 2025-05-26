package q50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class c implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c f102551a = new c();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p50.c value = (p50.c) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof p50.h) {
            List list = h.f102559a;
            p50.h value2 = (p50.h) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f98865a);
            writer.M0("connection");
            pc.c.b(pc.c.c(g.f102557a)).d(writer, customScalarAdapters, value2.f98866b);
            return;
        }
        if (value instanceof p50.d) {
            List list2 = d.f102552a;
            p50.d value3 = (p50.d) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f98860a);
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "V3AndroidWidgetGetBoardPinsDataConnectionContainer")) {
            List list = d.f102552a;
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(typename, "typename");
            while (reader.V1(d.f102552a) == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
            Intrinsics.f(typename);
            return new p50.d(typename);
        }
        List list2 = h.f102559a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        p50.g gVar = null;
        while (true) {
            int V1 = reader.V1(h.f102559a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    return new p50.h(typename, gVar);
                }
                gVar = (p50.g) pc.c.b(pc.c.c(g.f102557a)).f(reader, customScalarAdapters);
            }
        }
    }
}
