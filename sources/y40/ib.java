package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ib implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ib f137160a = new ib();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137161b = kotlin.collections.e0.b("v3GetUserBoardInviteQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.dc value = (x40.dc) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetUserBoardInviteQuery");
        pc.c.b(pc.c.c(db.f136993a)).d(writer, customScalarAdapters, value.f132244a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.yb ybVar = null;
        while (reader.V1(f137161b) == 0) {
            ybVar = (x40.yb) pc.c.b(pc.c.c(db.f136993a)).f(reader, customScalarAdapters);
        }
        return new x40.dc(ybVar);
    }
}
