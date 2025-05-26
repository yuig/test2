package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kd implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final kd f137225a = new kd();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137226b = kotlin.collections.e0.b("v3InviteBoardCollaboratorsMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.le value = (x40.le) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3InviteBoardCollaboratorsMutation");
        pc.c.b(pc.c.c(id.f137164a)).d(writer, customScalarAdapters, value.f132753a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.je jeVar = null;
        while (reader.V1(f137226b) == 0) {
            jeVar = (x40.je) pc.c.b(pc.c.c(id.f137164a)).f(reader, customScalarAdapters);
        }
        return new x40.le(jeVar);
    }
}
