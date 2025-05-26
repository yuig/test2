package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xd implements pc.j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final pc f133687b = new pc(5, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f133688a;

    public xd(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.f133688a = conversationId;
    }

    @Override // pc.o0
    public final String a() {
        return "819120c20cd1ab967772eb5d8d4528ee22ab9d13567d902df323b3e3c10633ac";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.xc.f137632a);
    }

    @Override // pc.o0
    public final String c() {
        return f133687b.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.w.f21972a;
        List selections = b50.w.f21975d;
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
        writer.M0("conversationId");
        pc.c.f99520a.d(writer, customScalarAdapters, this.f133688a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd) && Intrinsics.d(this.f133688a, ((xd) obj).f133688a);
    }

    public final int hashCode() {
        return this.f133688a.hashCode();
    }

    @Override // pc.o0
    public final String name() {
        return "HideConversationMutation";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("HideConversationMutation(conversationId="), this.f133688a, ")");
    }
}
