package f50;

import e50.f1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f61130a = new e1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f61131b = kotlin.collections.e0.b("v3SearchUsersWithStoriesQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        f1 value = (f1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3SearchUsersWithStoriesQuery");
        pc.c.b(pc.c.c(k.f61149a)).d(writer, customScalarAdapters, value.f57345a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        e50.l lVar = null;
        while (reader.V1(f61131b) == 0) {
            lVar = (e50.l) pc.c.b(pc.c.c(k.f61149a)).f(reader, customScalarAdapters);
        }
        return new f1(lVar);
    }
}
