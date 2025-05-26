package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class za implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final za f137690a = new za();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137691b = kotlin.collections.e0.b("v3GetConversationsQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.tb value = (x40.tb) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetConversationsQuery");
        pc.c.b(pc.c.c(w8.f137596a)).d(writer, customScalarAdapters, value.f133359a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.q9 q9Var = null;
        while (reader.V1(f137691b) == 0) {
            q9Var = (x40.q9) pc.c.b(pc.c.c(w8.f137596a)).f(reader, customScalarAdapters);
        }
        return new x40.tb(q9Var);
    }
}
