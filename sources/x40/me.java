package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class me implements pc.j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final pc f132823d = new pc(7, 0);

    /* renamed from: a, reason: collision with root package name */
    public final List f132824a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132825b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132826c;

    public me(List collaboratorIds, String boardId, String message) {
        Intrinsics.checkNotNullParameter(collaboratorIds, "collaboratorIds");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132824a = collaboratorIds;
        this.f132825b = boardId;
        this.f132826c = message;
    }

    @Override // pc.o0
    public final String a() {
        return "6253d4dfa84e8e2c3673c69d42b340f490162b0f9de6b1bf7902cfc61544c57c";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.kd.f137225a);
    }

    @Override // pc.o0
    public final String c() {
        return f132823d.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.y.f21981a;
        List selections = b50.y.f21984d;
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
        writer.M0("collaboratorIds");
        pc.c.a(pc.c.f99524e).b(writer, customScalarAdapters, this.f132824a);
        writer.M0("boardId");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f132825b);
        writer.M0("message");
        eVar.d(writer, customScalarAdapters, this.f132826c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me)) {
            return false;
        }
        me meVar = (me) obj;
        return Intrinsics.d(this.f132824a, meVar.f132824a) && Intrinsics.d(this.f132825b, meVar.f132825b) && Intrinsics.d(this.f132826c, meVar.f132826c);
    }

    public final int hashCode() {
        return this.f132826c.hashCode() + a.cb.d(this.f132825b, this.f132824a.hashCode() * 31, 31);
    }

    @Override // pc.o0
    public final String name() {
        return "InviteBoardCollaboratorsMutation";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InviteBoardCollaboratorsMutation(collaboratorIds=");
        sb3.append(this.f132824a);
        sb3.append(", boardId=");
        sb3.append(this.f132825b);
        sb3.append(", message=");
        return a.a.p(sb3, this.f132826c, ")");
    }
}
