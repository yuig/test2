package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ed implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ed f137027a = new ed();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137028b = kotlin.collections.e0.b("v3InviteBoardCollaboratorEmailMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.ee value = (x40.ee) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3InviteBoardCollaboratorEmailMutation");
        pc.c.b(pc.c.c(bd.f136935a)).d(writer, customScalarAdapters, value.f132357a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.be beVar = null;
        while (reader.V1(f137028b) == 0) {
            beVar = (x40.be) pc.c.b(pc.c.c(bd.f136935a)).f(reader, customScalarAdapters);
        }
        return new x40.ee(beVar);
    }
}
