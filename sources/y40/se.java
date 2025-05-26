package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class se implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final se f137480a = new se();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137481b = kotlin.collections.e0.b("itemId");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.xf value = (x40.xf) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("itemId");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f133690a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f137481b) == 0) {
            str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
        }
        return new x40.xf(str);
    }
}
