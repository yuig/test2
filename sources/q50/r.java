package q50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p50.t;
import pc.v;

/* loaded from: classes5.dex */
public final class r implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f102572a = new r();

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        t value = (t) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof p50.r) {
            List list = p.f102570a;
            p50.r value2 = (p50.r) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value2, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value2.f98884a);
            writer.M0("data");
            pc.c.f99527h.d(writer, customScalarAdapters, value2.f98885b);
            return;
        }
        if (value instanceof p50.s) {
            List list2 = q.f102571a;
            p50.s value3 = (p50.s) value;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value3, "value");
            writer.M0("__typename");
            pc.c.f99520a.d(writer, customScalarAdapters, value3.f98886a);
        }
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "BooleanResponse")) {
            List list = q.f102571a;
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(typename, "typename");
            while (reader.V1(q.f102571a) == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
            Intrinsics.f(typename);
            return new p50.s(typename);
        }
        List list2 = p.f102570a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(p.f102570a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(typename);
                    return new p50.r(typename, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
