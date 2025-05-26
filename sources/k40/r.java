package k40;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f78290a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final List f78291b = e0.b("hasNextPage");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        j40.s value = (j40.s) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("hasNextPage");
        pc.c.f99522c.d(writer, customScalarAdapters, Boolean.valueOf(value.f74624a));
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Boolean bool = null;
        while (reader.V1(f78291b) == 0) {
            bool = (Boolean) pc.c.f99522c.f(reader, customScalarAdapters);
        }
        Intrinsics.f(bool);
        return new j40.s(bool.booleanValue());
    }
}
