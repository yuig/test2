package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x40.mi;

/* loaded from: classes.dex */
public final class dh implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final dh f137002a = new dh();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137003b = kotlin.collections.f0.j("__typename", "code", "phoneCode");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        mi value = (mi) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.c());
        writer.M0("code");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.a());
        writer.M0("phoneCode");
        k0Var.d(writer, customScalarAdapters, value.b());
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int V1 = reader.V1(f137003b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(str);
                    return new mi(str, str2, str3);
                }
                str3 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
