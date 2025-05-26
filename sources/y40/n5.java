package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n5 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n5 f137311a = new n5();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137312b = kotlin.collections.f0.j("__typename", "entityId", "text", "thread");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.b6 value = (x40.b6) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132015a);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132016b);
        writer.M0("text");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f132017c);
        writer.M0("thread");
        pc.c.b(pc.c.c(m5.f137276a)).d(writer, customScalarAdapters, value.f132018d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        x40.a6 a6Var = null;
        while (true) {
            int V1 = reader.V1(f137312b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str3 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    return new x40.b6(str, str2, str3, a6Var);
                }
                a6Var = (x40.a6) pc.c.b(pc.c.c(m5.f137276a)).f(reader, customScalarAdapters);
            }
        }
    }
}
