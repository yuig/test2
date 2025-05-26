package k40;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o f78284a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78285b = e0.b("url");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.p value = (j40.p) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("url");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f74615a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f78285b) == 0) {
            str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
        }
        return new j40.p(str);
    }
}
