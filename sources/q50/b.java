package q50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class b implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f102550a = new b();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p50.b value = (p50.b) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof p50.i) {
            List list = i.f102560a;
            p50.i value2 = (p50.i) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f98867a);
            writer.M0("data");
            pc.c.b(pc.c.c(c.f102551a)).d(writer, customScalarAdapters, value2.f98868b);
            return;
        }
        if (value instanceof p50.a) {
            List list2 = a.f102549a;
            p50.a value3 = (p50.a) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f98859a);
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "V3AndroidWidgetGetBoardPins")) {
            List list = a.f102549a;
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(typename, "typename");
            while (reader.V1(a.f102549a) == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
            Intrinsics.f(typename);
            return new p50.a(typename);
        }
        List list2 = i.f102560a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        p50.c cVar = null;
        while (true) {
            int V1 = reader.V1(i.f102560a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    return new p50.i(typename, cVar);
                }
                cVar = (p50.c) pc.c.b(pc.c.c(c.f102551a)).f(reader, customScalarAdapters);
            }
        }
    }
}
