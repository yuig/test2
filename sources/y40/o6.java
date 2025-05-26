package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o6 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o6 f137343a = new o6();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137344b = kotlin.collections.f0.j("__typename", "id", "entityId", "status", "invitedUser");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.g7 value = (x40.g7) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132432a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132433b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132434c);
        writer.M0("status");
        pc.c.f99528i.d(writer, customScalarAdapters, value.f132435d);
        writer.M0("invitedUser");
        pc.c.b(pc.c.c(n6.f137313a)).d(writer, customScalarAdapters, value.f132436e);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        Object obj = null;
        x40.f7 f7Var = null;
        while (true) {
            int V1 = reader.V1(f137344b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str3 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                obj = pc.c.f99528i.f(reader, customScalarAdapters);
            } else {
                if (V1 != 4) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    Intrinsics.f(str3);
                    return new x40.g7(str, str2, str3, obj, f7Var);
                }
                f7Var = (x40.f7) pc.c.b(pc.c.c(n6.f137313a)).f(reader, customScalarAdapters);
            }
        }
    }
}
