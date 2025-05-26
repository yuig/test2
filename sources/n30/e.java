package n30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.k0;
import pc.v;

/* loaded from: classes2.dex */
public final class e implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f89151a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final List f89152b = f0.j("title", "metadata");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        m30.e value = (m30.e) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("title");
        k0 k0Var = pc.c.f99524e;
        k0Var.d(writer, customScalarAdapters, value.f85749a);
        writer.M0("metadata");
        k0Var.d(writer, customScalarAdapters, value.f85750b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int V1 = reader.V1(f89152b);
            if (V1 == 0) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new m30.e(str, str2);
                }
                str2 = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            }
        }
    }
}
