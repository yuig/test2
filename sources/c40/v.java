package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f25755a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25756b = kotlin.collections.f0.j("__typename", "id", "entityId");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.x value = (b40.x) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f21762a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f21763b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f21764c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int V1 = reader.V1(f25756b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    Intrinsics.f(str3);
                    return new b40.x(str, str2, str3);
                }
                str3 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
        }
    }
}
