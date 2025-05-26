package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f136881a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136882b = kotlin.collections.f0.j("__typename", "entityId", "text", "thread");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.e0 value = (x40.e0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132294a);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132295b);
        writer.M0("text");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f132296c);
        writer.M0("thread");
        pc.c.b(pc.c.c(z.f137671a)).d(writer, customScalarAdapters, value.f132297d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        x40.d0 d0Var = null;
        while (true) {
            int V1 = reader.V1(f136882b);
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
                    return new x40.e0(str, str2, str3, d0Var);
                }
                d0Var = (x40.d0) pc.c.b(pc.c.c(z.f137671a)).f(reader, customScalarAdapters);
            }
        }
    }
}
