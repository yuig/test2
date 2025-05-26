package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y f25761a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25762b = kotlin.collections.f0.j("__typename", "text", "url", "key");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.a0 value = (b40.a0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f21683a);
        writer.M0("text");
        pc.c.b(pc.c.a(eVar)).d(writer, customScalarAdapters, value.f21684b);
        writer.M0("url");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f21685c);
        writer.M0("key");
        k0Var.d(writer, customScalarAdapters, value.f21686d);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int V1 = reader.V1(f25762b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                list = (List) pc.c.b(pc.c.a(pc.c.f99520a)).f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    Intrinsics.f(str);
                    return new b40.a0(str, str2, str3, list);
                }
                str3 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
