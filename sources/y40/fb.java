package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fb implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final fb f137059a = new fb();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137060b = kotlin.collections.f0.j("__typename", "id", "entityId", "fullName", "imageMediumUrl");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ac value = (x40.ac) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f131959a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f131960b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f131961c);
        writer.M0("fullName");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f131962d);
        writer.M0("imageMediumUrl");
        pc.c.b(eVar).d(writer, customScalarAdapters, value.f131963e);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int V1 = reader.V1(f137060b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str3 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                str4 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 4) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    Intrinsics.f(str3);
                    return new x40.ac(str, str2, str3, str4, str5);
                }
                str5 = (String) pc.c.b(pc.c.f99520a).f(reader, customScalarAdapters);
            }
        }
    }
}
