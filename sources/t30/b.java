package t30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.k0;
import pc.v;

/* loaded from: classes2.dex */
public final class b implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f116295a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final List f116296b = f0.j("image", "actionText", "actionUri", "subtitle", "title");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        s30.b value = (s30.b) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("image");
        pc.c.b(pc.c.c(a.f116293a)).d(writer, customScalarAdapters, value.f111021a);
        writer.M0("actionText");
        k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f111022b);
        writer.M0("actionUri");
        k0Var.d(writer, customScalarAdapters, value.f111023c);
        writer.M0("subtitle");
        k0Var.d(writer, customScalarAdapters, value.f111024d);
        writer.M0("title");
        k0Var.d(writer, customScalarAdapters, value.f111025e);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        s30.a aVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int V1 = reader.V1(f116296b);
            if (V1 == 0) {
                aVar = (s30.a) pc.c.b(pc.c.c(a.f116293a)).f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 2) {
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 3) {
                str3 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 4) {
                    return new s30.b(aVar, str, str2, str3, str4);
                }
                str4 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
