package n30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class f implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f89153a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final List f89154b = e0.b("boardTitleSuggestions");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        m30.f value = (m30.f) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("boardTitleSuggestions");
        pc.c.b(pc.c.a(pc.c.c(e.f89151a))).d(writer, customScalarAdapters, value.f85751a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        List list = null;
        while (reader.V1(f89154b) == 0) {
            list = (List) pc.c.b(pc.c.a(pc.c.c(e.f89151a))).f(reader, customScalarAdapters);
        }
        return new m30.f(list);
    }
}
