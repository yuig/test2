package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z5 implements pc.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f133805b = new m0(28, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f133806a;

    public z5(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f133806a = boardId;
    }

    @Override // pc.o0
    public final String a() {
        return "0aa277ce4722239c7b5b616abbe10902b14443c36b20d1ecbe699375ddd7f79b";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.l5.f137244a);
    }

    @Override // pc.o0
    public final String c() {
        return f133805b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.m.f21899a;
        List selections = b50.m.f21903e;
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
        pc.c.f99520a.d(writer, customScalarAdapters, this.f133806a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5) && Intrinsics.d(this.f133806a, ((z5) obj).f133806a);
    }

    public final int hashCode() {
        return this.f133806a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "CreateRequestToJoinBoardMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CreateRequestToJoinBoardMutation(boardId="), this.f133806a, ")");
    }
}
