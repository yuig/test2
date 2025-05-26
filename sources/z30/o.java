package z30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class o implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o f140782a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final List f140783b = e0.b("v3RecommendedTodayArticlesQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        y30.o value = (y30.o) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3RecommendedTodayArticlesQuery");
        pc.c.b(pc.c.c(d.f140768a)).d(writer, customScalarAdapters, value.f136760a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        y30.d dVar = null;
        while (reader.V1(f140783b) == 0) {
            dVar = (y30.d) pc.c.b(pc.c.c(d.f140768a)).f(reader, customScalarAdapters);
        }
        return new y30.o(dVar);
    }
}
