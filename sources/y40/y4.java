package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y4 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y4 f137649a = new y4();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137650b = kotlin.collections.f0.j("__typename", "id", "entityId", "lastMessage");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.k5 value = (x40.k5) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132661a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132662b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132663c);
        writer.M0("lastMessage");
        pc.c.b(pc.c.c(x4.f137619a)).d(writer, customScalarAdapters, value.f132664d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        x40.j5 j5Var = null;
        while (true) {
            int V1 = reader.V1(f137650b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str3 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    Intrinsics.f(str3);
                    return new x40.k5(str, str2, str3, j5Var);
                }
                j5Var = (x40.j5) pc.c.b(pc.c.c(x4.f137619a)).f(reader, customScalarAdapters);
            }
        }
    }
}
