package h40;

import g40.h;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import pc.v;

/* loaded from: classes5.dex */
public final class g implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f67625a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final List f67626b = e0.b("v3RemoveFatigueForInterestAfterFeedbackMutation");

    @Override // pc.a
    public final void d(tc.g writer, v customScalarAdapters, Object obj) {
        h value = (h) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3RemoveFatigueForInterestAfterFeedbackMutation");
        pc.c.b(pc.c.c(f.f67624a)).d(writer, customScalarAdapters, value.f63498a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        g40.g gVar = null;
        while (reader.V1(f67626b) == 0) {
            gVar = (g40.g) pc.c.b(pc.c.c(f.f67624a)).f(reader, customScalarAdapters);
        }
        return new h(gVar);
    }
}
