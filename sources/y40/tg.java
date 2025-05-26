package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.bi;

/* loaded from: classes5.dex */
public final class tg implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final tg f137518a = new tg();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137519b = kotlin.collections.f0.j("__typename", "entityId", "id");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        bi value = (bi) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132058a);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132059b);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132060c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int V1 = reader.V1(f137519b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    Intrinsics.f(str3);
                    return new bi(str, str2, str3);
                }
                str3 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
        }
    }
}
