package n40;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class g implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f89203a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final List f89204b = e0.b("v3GetCountriesListQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        m40.g value = (m40.g) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetCountriesListQuery");
        pc.c.b(pc.c.c(d.f89199a)).d(writer, customScalarAdapters, value.f85825a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        m40.d dVar = null;
        while (reader.V1(f89204b) == 0) {
            dVar = (m40.d) pc.c.b(pc.c.c(d.f89199a)).f(reader, customScalarAdapters);
        }
        return new m40.g(dVar);
    }
}
