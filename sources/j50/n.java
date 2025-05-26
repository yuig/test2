package j50;

import i50.o;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class n implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n f74701a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final List f74702b = e0.b("v3PollDownloadIdeaPinQuery");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        o value = (o) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3PollDownloadIdeaPinQuery");
        pc.c.b(pc.c.c(k.f74697a)).d(writer, customScalarAdapters, value.f71560a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        i50.l lVar = null;
        while (reader.V1(f74702b) == 0) {
            lVar = (i50.l) pc.c.b(pc.c.c(k.f74697a)).f(reader, customScalarAdapters);
        }
        return new o(lVar);
    }
}
