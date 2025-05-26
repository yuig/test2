package h40;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class c implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c f67620a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final List f67621b = f0.j("__typename", "id");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        g40.d value = (g40.d) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f63493a);
        writer.M0("id");
        eVar.d(writer, customScalarAdapters, value.f63494b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f67621b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    return new g40.d(str, str2);
                }
                str2 = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            }
        }
    }
}
