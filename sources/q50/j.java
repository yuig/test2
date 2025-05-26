package q50;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class j implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j f102561a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final List f102562b = e0.b("v3AndroidWidgetGetBoardPinsQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p50.j value = (p50.j) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3AndroidWidgetGetBoardPinsQuery");
        pc.c.b(pc.c.c(b.f102550a)).d(writer, customScalarAdapters, value.f98869a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        p50.b bVar = null;
        while (reader.V1(f102562b) == 0) {
            bVar = (p50.b) pc.c.b(pc.c.c(b.f102550a)).f(reader, customScalarAdapters);
        }
        return new p50.j(bVar);
    }
}
