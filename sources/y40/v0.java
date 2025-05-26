package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f137554a = new v0();

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.d1 value = (x40.d1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof x40.c1)) {
            if (value instanceof x40.e1) {
                List list = w0.f137583a;
                w0.b(writer, customScalarAdapters, (x40.e1) value);
                return;
            }
            return;
        }
        List list2 = u0.f137523a;
        x40.c1 value2 = (x40.c1) value;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value2, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value2.f132070a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value2.f132071b);
        writer.M0("name");
        pc.c.f99524e.d(writer, customScalarAdapters, value2.f132072c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        String typename = ep.b.m(reader, "reader", customScalarAdapters, "customScalarAdapters", reader);
        if (!Intrinsics.d(typename, "Board")) {
            return w0.a(reader, customScalarAdapters, typename);
        }
        List list = u0.f137523a;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(typename, "typename");
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(u0.f137523a);
            if (V1 == 0) {
                typename = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(typename);
                    Intrinsics.f(str);
                    return new x40.c1(typename, str, str2);
                }
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
