package t30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class h implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final h f116303a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final List f116304b = e0.b("v3AndroidCubesSignInQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        s30.h value = (s30.h) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3AndroidCubesSignInQuery");
        pc.c.b(pc.c.c(g.f116302a)).d(writer, customScalarAdapters, value.f111033a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        s30.g gVar = null;
        while (reader.V1(f116304b) == 0) {
            gVar = (s30.g) pc.c.b(pc.c.c(g.f116302a)).f(reader, customScalarAdapters);
        }
        return new s30.h(gVar);
    }
}
