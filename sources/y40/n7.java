package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n7 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n7 f137315a = new n7();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137316b = kotlin.collections.f0.j("__typename", "type", "src");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.g8 value = (x40.g8) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f132437a);
        writer.M0("type");
        pc.k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f132438b);
        writer.M0("src");
        k0Var.d(writer, customScalarAdapters, value.f132439c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int V1 = reader.V1(f137316b);
            if (V1 == 0) {
                str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    Intrinsics.f(str);
                    return new x40.g8(str, str2, str3);
                }
                str3 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
