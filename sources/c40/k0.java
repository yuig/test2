package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f25729a = new k0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25730b = kotlin.collections.e0.b("v3HideNewsHubPinMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.n0 value = (b40.n0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3HideNewsHubPinMutation");
        pc.c.b(pc.c.c(j0.f25727a)).d(writer, customScalarAdapters, value.f21728a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        b40.m0 m0Var = null;
        while (reader.V1(f25730b) == 0) {
            m0Var = (b40.m0) pc.c.b(pc.c.c(j0.f25727a)).f(reader, customScalarAdapters);
        }
        return new b40.n0(m0Var);
    }
}
