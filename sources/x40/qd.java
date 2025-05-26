package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qd implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final pc f133120b = new pc(3, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f133121a;

    public qd(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.f133121a = conversationId;
    }

    @Override // pc.o0
    public final String a() {
        return "0dc9142508842c67b6b45c7e7a40c4f739ad1c473cee45ddae40166c1e2d794c";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.rc.f137448a);
    }

    @Override // pc.o0
    public final String c() {
        return f133120b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.v.f21962a;
        List selections = b50.v.f21971j;
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
        writer.M0("conversationId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f133121a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd) && Intrinsics.d(this.f133121a, ((qd) obj).f133121a);
    }

    public final int hashCode() {
        return this.f133121a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "GetUsersConversationQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("GetUsersConversationQuery(conversationId="), this.f133121a, ")");
    }
}
