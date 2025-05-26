package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ec implements pc.u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j6 f132334c = new j6(27, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132336b;

    public ec(String boardId, String userId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f132335a = boardId;
        this.f132336b = userId;
    }

    @Override // pc.o0
    public final String a() {
        return "0da638545d706784fb323cee7fd7067c0440051fbb0c47096aa3c01d91d2c212";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.ib.f137160a);
    }

    @Override // pc.o0
    public final String c() {
        return f132334c.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.t.f21944a;
        List selections = b50.t.f21950g;
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
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f132335a);
        writer.M0("userId");
        eVar.d(writer, customScalarAdapters, this.f132336b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return Intrinsics.d(this.f132335a, ecVar.f132335a) && Intrinsics.d(this.f132336b, ecVar.f132336b);
    }

    public final int hashCode() {
        return this.f132336b.hashCode() + (this.f132335a.hashCode() * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "GetUserBoardInviteQuery";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GetUserBoardInviteQuery(boardId=");
        sb3.append(this.f132335a);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f132336b, ")");
    }
}
