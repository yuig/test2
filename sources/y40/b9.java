package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b9 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b9 f136929a = new b9();

    /* renamed from: b, reason: collision with root package name */
    public static final List f136930b = kotlin.collections.e0.b("fullName");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.v9 value = (x40.v9) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("fullName");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f133549a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f136930b) == 0) {
            str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
        }
        return new x40.v9(str);
    }
}
