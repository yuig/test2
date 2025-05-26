package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t6 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final t6 f137500a = new t6();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137501b = kotlin.collections.e0.b("v3GetBoardCollaboratorInvitesQuery");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.l7 value = (x40.l7) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3GetBoardCollaboratorInvitesQuery");
        pc.c.b(pc.c.c(j6.f137183a)).d(writer, customScalarAdapters, value.f132705a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.b7 b7Var = null;
        while (reader.V1(f137501b) == 0) {
            b7Var = (x40.b7) pc.c.b(pc.c.c(j6.f137183a)).f(reader, customScalarAdapters);
        }
        return new x40.l7(b7Var);
    }
}
