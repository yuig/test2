package q30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class o implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o f102297a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final List f102298b = f0.j("__typename", "entityId", "type", "isAccepted");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p30.q value = (p30.q) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f98751a);
        writer.M0("entityId");
        eVar.d(writer, customScalarAdapters, value.f98752b);
        writer.M0("type");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f98753c);
        writer.M0("isAccepted");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f98754d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        while (true) {
            int V1 = reader.V1(f102298b);
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
                    return new p30.q(str, str2, str3, bool);
                }
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            }
        }
    }
}
