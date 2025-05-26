package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f137036a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137037b = kotlin.collections.e0.b("v3AcceptBoardCollaboratorInviteMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.f value = (x40.f) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3AcceptBoardCollaboratorInviteMutation");
        pc.c.b(pc.c.c(e.f137004a)).d(writer, customScalarAdapters, value.f132366a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.e eVar = null;
        while (reader.V1(f137037b) == 0) {
            eVar = (x40.e) pc.c.b(pc.c.c(e.f137004a)).f(reader, customScalarAdapters);
        }
        return new x40.f(eVar);
    }
}
