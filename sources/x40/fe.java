package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fe implements pc.j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final pc f132412d = new pc(6, 0);

    /* renamed from: a, reason: collision with root package name */
    public final List f132413a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132414b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f132415c;

    public fe(List emails, String boardId, pc.r0 message) {
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f132413a = emails;
        this.f132414b = boardId;
        this.f132415c = message;
    }

    @Override // pc.o0
    public final String a() {
        return "f308b9c2ba5017330b0f00fa9d686c2a0e64c1fb0b3f39455f5d8977808cebd2";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.ed.f137027a);
    }

    @Override // pc.o0
    public final String c() {
        return f132412d.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.x.f21976a;
        List selections = b50.x.f21980e;
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
        writer.M0("emails");
        pc.k0 k0Var = pc.c.f99524e;
        pc.c.a(k0Var).b(writer, customScalarAdapters, this.f132413a);
        writer.M0("boardId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f132414b);
        pc.r0 r0Var = this.f132415c;
        if (r0Var instanceof pc.q0) {
            writer.M0("message");
            pc.c.d(k0Var).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        return Intrinsics.d(this.f132413a, feVar.f132413a) && Intrinsics.d(this.f132414b, feVar.f132414b) && Intrinsics.d(this.f132415c, feVar.f132415c);
    }

    public final int hashCode() {
        return this.f132415c.hashCode() + a.cb.d(this.f132414b, this.f132413a.hashCode() * 31, 31);
    }

    @Override // pc.o0
    public final String name() {
        return "InviteBoardCollaboratorEmailMutation";
    }

    public final String toString() {
        return "InviteBoardCollaboratorEmailMutation(emails=" + this.f132413a + ", boardId=" + this.f132414b + ", message=" + this.f132415c + ")";
    }
}
