package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements pc.j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f133284c = new m0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f133285a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133286b;

    public t0(String boardId, String userId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f133285a = boardId;
        this.f133286b = userId;
    }

    @Override // pc.o0
    public final String a() {
        return "89138fbf292be84978bd261be70abe801f2d4bec976fb1e15a1119860339617e";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.m0.f137267a);
    }

    @Override // pc.o0
    public final String c() {
        return f133284c.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.f.f21844a;
        List selections = b50.f.f21847d;
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
        eVar.d(writer, customScalarAdapters, this.f133285a);
        writer.M0("userId");
        eVar.d(writer, customScalarAdapters, this.f133286b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f133285a, t0Var.f133285a) && Intrinsics.d(this.f133286b, t0Var.f133286b);
    }

    public final int hashCode() {
        return this.f133286b.hashCode() + (this.f133285a.hashCode() * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "ApproveCollaboratorMutation";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ApproveCollaboratorMutation(boardId=");
        sb3.append(this.f133285a);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f133286b, ")");
    }
}
