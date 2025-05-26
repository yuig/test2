package t30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.k0;
import pc.v;

/* loaded from: classes2.dex */
public final class k implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f116309a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final List f116310b = f0.j("actionUri", "entities", "title");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        s30.l value = (s30.l) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("actionUri");
        k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f111040a);
        writer.M0("entities");
        pc.c.b(pc.c.a(pc.c.c(j.f116307a))).d(writer, customScalarAdapters, value.f111041b);
        writer.M0("title");
        k0Var.d(writer, customScalarAdapters, value.f111042c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        List list = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f116310b);
            if (V1 == 0) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                list = (List) pc.c.b(pc.c.a(pc.c.c(j.f116307a))).f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new s30.l(str, str2, list);
                }
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
