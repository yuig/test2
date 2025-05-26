package y40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f6 implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f6 f137049a = new f6();

    /* renamed from: b, reason: collision with root package name */
    public static final List f137050b = kotlin.collections.e0.b("v3DeclineOrDeleteBoardCollaboratorInviteMutation");

    @Override // pc.a
    public final void d(tc.g writer, pc.v customScalarAdapters, Object obj) {
        x40.w6 value = (x40.w6) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("v3DeclineOrDeleteBoardCollaboratorInviteMutation");
        pc.c.b(pc.c.c(e6.f137016a)).d(writer, customScalarAdapters, value.f133595a);
    }

    @Override // pc.a
    public final Object f(tc.f reader, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        x40.v6 v6Var = null;
        while (reader.V1(f137050b) == 0) {
            v6Var = (x40.v6) pc.c.b(pc.c.c(e6.f137016a)).f(reader, customScalarAdapters);
        }
        return new x40.w6(v6Var);
    }
}
