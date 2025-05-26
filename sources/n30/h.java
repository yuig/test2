package n30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class h implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final h f89156a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final List f89157b = e0.b("v3GetPinQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        m30.h value = (m30.h) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetPinQuery");
        pc.c.b(pc.c.c(d.f89150a)).d(writer, customScalarAdapters, value.f85754a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        m30.d dVar = null;
        while (reader.V1(f89157b) == 0) {
            dVar = (m30.d) pc.c.b(pc.c.c(d.f89150a)).f(reader, customScalarAdapters);
        }
        return new m30.h(dVar);
    }
}
