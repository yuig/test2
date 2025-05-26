package w30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes3.dex */
public final class e implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f127900a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final List f127901b = f0.j("__typename", "id", "entityId", "explicitlyFollowedByMe", "followerCount");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        v30.e value = (v30.e) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f123923a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f123924b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f123925c);
        writer.M0("explicitlyFollowedByMe");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f123926d);
        writer.M0("followerCount");
        pc.c.f99526g.d(writer, customScalarAdapters, value.f123927e);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Integer num = null;
        while (true) {
            int V1 = reader.V1(f127901b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str3 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            } else {
                if (V1 != 4) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    Intrinsics.f(str3);
                    return new v30.e(str, str2, str3, bool, num);
                }
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
