package t30;

import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import pc.k0;
import pc.v;

/* loaded from: classes2.dex */
public final class a implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f116293a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final List f116294b = f0.j("height", "uri", "width");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        s30.a value = (s30.a) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("height");
        k0 k0Var = pc.c.f99526g;
        k0Var.d(writer, customScalarAdapters, value.f111018a);
        writer.M0("uri");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f111019b);
        writer.M0("width");
        k0Var.d(writer, customScalarAdapters, value.f111020c);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Integer num = null;
        String str = null;
        Integer num2 = null;
        while (true) {
            int V1 = reader.V1(f116294b);
            if (V1 == 0) {
                num = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            } else if (V1 == 1) {
                str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
            } else {
                if (V1 != 2) {
                    return new s30.a(num, num2, str);
                }
                num2 = (Integer) pc.c.f99526g.f(reader, customScalarAdapters);
            }
        }
    }
}
