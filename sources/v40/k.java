package v40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f124064a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final List f124065b = kotlin.collections.f0.j("__typename", "verified", "name");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        u40.k value = (u40.k) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f120353a);
        writer.M0("verified");
        pc.c.f99527h.d(writer, customScalarAdapters, value.f120354b);
        writer.M0("name");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f120355c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f124065b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                bool = (Boolean) pc.c.f99527h.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(str);
                    return new u40.k(str, str2, bool);
                }
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
