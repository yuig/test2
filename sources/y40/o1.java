package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o1 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f137335a = new o1();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137336b = kotlin.collections.e0.b("compatibleVersion");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.y1 value = (x40.y1) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("compatibleVersion");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f133719a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f137336b) == 0) {
            str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
        }
        return new x40.y1(str);
    }
}
