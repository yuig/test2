package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ne implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ne f137326a = new ne();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137327b = kotlin.collections.e0.b("__typename");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.sf value = (x40.sf) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("__typename");
        pc.c.f99520a.d(writer, customScalarAdapters, value.a());
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f137327b) == 0) {
            str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
        }
        Intrinsics.f(str);
        return new x40.sf(str);
    }
}
