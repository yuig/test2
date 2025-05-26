package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements pc.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g40.a f132420b = new g40.a(25, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132421a;

    public g(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f132421a = boardId;
    }

    @Override // pc.o0
    public final String a() {
        return "a693e71bc746d8068221125978ff38807c98d969507040be3778dd52a6b15d69";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.f.f137036a);
    }

    @Override // pc.o0
    public final String c() {
        return f132420b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.a.f21780a;
        List selections = b50.a.f21783d;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("boardId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f132421a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f132421a, ((g) obj).f132421a);
    }

    public final int hashCode() {
        return this.f132421a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "AcceptBoardCollaboratorInviteMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("AcceptBoardCollaboratorInviteMutation(boardId="), this.f132421a, ")");
    }
}
