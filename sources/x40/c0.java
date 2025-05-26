package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements pc.j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g40.a f132066d = new g40.a(28, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132067a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132068b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132069c;

    public c0(String conversationId, String senderId, String pinId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f132067a = conversationId;
        this.f132068b = senderId;
        this.f132069c = pinId;
    }

    @Override // pc.o0
    public final String a() {
        return "4b5af93d38f8b72fb516f6af13a886b017b8ea86e508cbc74d0710548b571326";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.y.f137640a);
    }

    @Override // pc.o0
    public final String c() {
        return f132066d.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.d.f21820a;
        List selections = b50.d.f21822c;
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
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f132067a);
        writer.M0("senderId");
        eVar.d(writer, customScalarAdapters, this.f132068b);
        writer.M0("pinId");
        eVar.d(writer, customScalarAdapters, this.f132069c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f132067a, c0Var.f132067a) && Intrinsics.d(this.f132068b, c0Var.f132068b) && Intrinsics.d(this.f132069c, c0Var.f132069c);
    }

    public final int hashCode() {
        return this.f132069c.hashCode() + a.cb.d(this.f132068b, this.f132067a.hashCode() * 31, 31);
    }

    @Override // pc.o0
    public final String name() {
        return "AddConversationPinSeenMutation";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AddConversationPinSeenMutation(conversationId=");
        sb3.append(this.f132067a);
        sb3.append(", senderId=");
        sb3.append(this.f132068b);
        sb3.append(", pinId=");
        return a.a.p(sb3, this.f132069c, ")");
    }
}
