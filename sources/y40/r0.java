package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f137429a = new r0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137430b = kotlin.collections.f0.j("__typename", "id", "entityId");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.y0 value = (x40.y0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133716a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f133717b);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f133718c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int V1 = reader.V1(f137430b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    Intrinsics.f(str3);
                    return new x40.y0(str, str2, str3);
                }
                str3 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
        }
    }
}
