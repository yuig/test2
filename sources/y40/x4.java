package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x4 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final x4 f137619a = new x4();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137620b = kotlin.collections.f0.j("__typename", "type", "id", "entityId");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.j5 value = (x40.j5) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132588a);
        writer.M0("type");
        pc.c.f99528i.d(writer, customScalarAdapters, value.f132589b);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f132590c);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f132591d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Object obj = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int V1 = reader.V1(f137620b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                obj = pc.c.f99528i.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    Intrinsics.f(str3);
                    return new x40.j5(str, str2, str3, obj);
                }
                str3 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
        }
    }
}
