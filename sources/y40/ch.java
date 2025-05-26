package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.li;

/* loaded from: classes.dex */
public final class ch implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ch f136971a = new ch();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136972b = kotlin.collections.f0.j("__typename", "phoneCountry", "phoneNumber", "email");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        li value = (li) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.d());
        writer.M0("phoneCountry");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.b());
        writer.M0("phoneNumber");
        k0Var.d(writer, customScalarAdapters, value.c());
        writer.M0("email");
        k0Var.d(writer, customScalarAdapters, value.a());
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int V1 = reader.V1(f136972b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str3 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 3) {
                    Intrinsics.f(str);
                    return new li(str, str2, str3, str4);
                }
                str4 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
