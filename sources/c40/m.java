package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final m f25734a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25735b = kotlin.collections.f0.j("messages", "newsHub");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.n value = (b40.n) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("messages");
        pc.k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.f21726a);
        writer.M0("newsHub");
        k0Var.d(writer, customScalarAdapters, value.f21727b);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int V1 = reader.V1(f25735b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else {
                if (V1 != 1) {
                    return new b40.n(num, num2);
                }
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
