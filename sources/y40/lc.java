package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lc implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final lc f137254a = new lc();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137255b = kotlin.collections.e0.b("users");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.jd value = (x40.jd) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("users");
        pc.c.b(pc.c.c(kc.f137224a)).d(writer, customScalarAdapters, value.f132615a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.id idVar = null;
        while (reader.V1(f137255b) == 0) {
            idVar = (x40.id) pc.c.b(pc.c.c(kc.f137224a)).f(reader, customScalarAdapters);
        }
        return new x40.jd(idVar);
    }
}
