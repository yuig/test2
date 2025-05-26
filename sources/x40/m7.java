package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m7 implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j6 f132810b = new j6(2, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132811a;

    public m7(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f132811a = boardId;
    }

    @Override // pc.o0
    public final String a() {
        return "ff3de8259780532bd98213a1c32cf68959edd4384c4c139d479c848eb645f98f";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.t6.f137500a);
    }

    @Override // pc.o0
    public final String c() {
        return f132810b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.q.f21918a;
        List selections = b50.q.f21927j;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("boardId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f132811a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7) && Intrinsics.d(this.f132811a, ((m7) obj).f132811a);
    }

    public final int hashCode() {
        return this.f132811a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "GetBoardCollaboratorInvitesQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("GetBoardCollaboratorInvitesQuery(boardId="), this.f132811a, ")");
    }
}
