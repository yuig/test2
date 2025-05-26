package q50;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class o implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o f102568a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final List f102569b = e0.b("v3AndroidWidgetGetHomefeedPinsQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p50.p value = (p50.p) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3AndroidWidgetGetHomefeedPinsQuery");
        pc.c.b(pc.c.c(l.f102564a)).d(writer, customScalarAdapters, value.f98879a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        p50.m mVar = null;
        while (reader.V1(f102569b) == 0) {
            mVar = (p50.m) pc.c.b(pc.c.c(l.f102564a)).f(reader, customScalarAdapters);
        }
        return new p50.p(mVar);
    }
}
