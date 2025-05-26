package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x6 implements pc.j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j6 f133673c = new j6(1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f133674a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133675b;

    public x6(String boardId, String userId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f133674a = boardId;
        this.f133675b = userId;
    }

    @Override // pc.o0
    public final String a() {
        return "1778731a6176d30052ebaf6c6cf2d2c68cd90fd2d6de3c46dd0fccea1bc274f5";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.f6.f137049a);
    }

    @Override // pc.o0
    public final String c() {
        return f133673c.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.p.f21913a;
        List selections = b50.p.f21917e;
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
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f133674a);
        writer.M0("userId");
        eVar.d(writer, customScalarAdapters, this.f133675b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return Intrinsics.d(this.f133674a, x6Var.f133674a) && Intrinsics.d(this.f133675b, x6Var.f133675b);
    }

    public final int hashCode() {
        return this.f133675b.hashCode() + (this.f133674a.hashCode() * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "DeclineOrDeleteBoardCollaboratorInviteMutation";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeclineOrDeleteBoardCollaboratorInviteMutation(boardId=");
        sb3.append(this.f133674a);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f133675b, ")");
    }
}
