package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n9 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n9 f137318a = new n9();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137319b = kotlin.collections.e0.b("compatibleVersion");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ha value = (x40.ha) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("compatibleVersion");
        pc.c.f99524e.d(writer, customScalarAdapters, value.f132497a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String str = null;
        while (reader.V1(f137319b) == 0) {
            str = (String) pc.c.f99524e.f(reader, customScalarAdapters);
        }
        return new x40.ha(str);
    }
}
