package q30;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes2.dex */
public final class f implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f102284a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final List f102285b = e0.b("v3EmailClickMutation");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        p30.f value = (p30.f) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3EmailClickMutation");
        pc.c.b(pc.c.c(e.f102283a)).d(writer, customScalarAdapters, value.f98733a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        p30.e eVar = null;
        while (reader.V1(f102285b) == 0) {
            eVar = (p30.e) pc.c.b(pc.c.c(e.f102283a)).f(reader, customScalarAdapters);
        }
        return new p30.f(eVar);
    }
}
