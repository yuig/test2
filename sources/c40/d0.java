package c40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f25710a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final List f25711b = kotlin.collections.e0.b("v3GetNewsSummaryQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        b40.f0 value = (b40.f0) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetNewsSummaryQuery");
        pc.c.b(pc.c.c(c0.f25708a)).d(writer, customScalarAdapters, value.f21706a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        b40.e0 e0Var = null;
        while (reader.V1(f25711b) == 0) {
            e0Var = (b40.e0) pc.c.b(pc.c.c(c0.f25708a)).f(reader, customScalarAdapters);
        }
        return new b40.f0(e0Var);
    }
}
