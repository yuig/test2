package j50;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class g implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f74691a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final List f74692b = e0.b("v3DownloadIdeaPinQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        i50.g value = (i50.g) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3DownloadIdeaPinQuery");
        pc.c.b(pc.c.c(d.f74687a)).d(writer, customScalarAdapters, value.f71547a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        i50.d dVar = null;
        while (reader.V1(f74692b) == 0) {
            dVar = (i50.d) pc.c.b(pc.c.c(d.f74687a)).f(reader, customScalarAdapters);
        }
        return new i50.g(dVar);
    }
}
