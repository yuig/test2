package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ai implements pc.j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final pc f131991c = new pc(23, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f131992a;

    /* renamed from: b, reason: collision with root package name */
    public final List f131993b;

    public ai(String boardId, List userIds) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        this.f131992a = boardId;
        this.f131993b = userIds;
    }

    @Override // pc.o0
    public final String a() {
        return "d5e7dd642340c65a4a3407dd9f2c59c85d29d74edeb97206c402ca6a0ab26cba";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.sg.f137484a);
    }

    @Override // pc.o0
    public final String c() {
        return f131991c.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.e0.f21840a;
        List selections = b50.e0.f21843d;
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
        pc.c.f99520a.d(writer, customScalarAdapters, this.f131992a);
        writer.M0("userIds");
        pc.c.a(pc.c.f99524e).b(writer, customScalarAdapters, this.f131993b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return Intrinsics.d(this.f131992a, aiVar.f131992a) && Intrinsics.d(this.f131993b, aiVar.f131993b);
    }

    public final int hashCode() {
        return this.f131993b.hashCode() + (this.f131992a.hashCode() * 31);
    }

    @Override // pc.o0
    public final String name() {
        return "RemoveCollaboratorMutation";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RemoveCollaboratorMutation(boardId=");
        sb3.append(this.f131992a);
        sb3.append(", userIds=");
        return a.c.j(sb3, this.f131993b, ")");
    }
}
