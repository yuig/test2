package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m5 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final m5 f137276a = new m5();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137277b = kotlin.collections.e0.b("entityId");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.a6 value = (x40.a6) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("entityId");
        pc.c.f99520a.d(writer, customScalarAdapters, value.f131916a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f137277b) == 0) {
            str = (String) pc.c.f99520a.f(reader, customScalarAdapters);
        }
        Intrinsics.f(str);
        return new x40.a6(str);
    }
}
