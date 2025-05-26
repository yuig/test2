package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m9 implements pc.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j6 f132813d = new j6(4, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132814a;

    /* renamed from: b, reason: collision with root package name */
    public final pc.r0 f132815b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f132816c;

    public m9(String conversationId) {
        pc.p0 shouldRequestPinsubTopicId = pc.p0.f99597a;
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(shouldRequestPinsubTopicId, "imageSpec");
        Intrinsics.checkNotNullParameter(shouldRequestPinsubTopicId, "shouldRequestPinsubTopicId");
        this.f132814a = conversationId;
        this.f132815b = shouldRequestPinsubTopicId;
        this.f132816c = shouldRequestPinsubTopicId;
    }

    @Override // pc.o0
    public final String a() {
        return "7aa0aaaf2a83d73093afeb8bfad96861fb34575eb94461221e388604a0635b16";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.s8.f137470a);
    }

    @Override // pc.o0
    public final String c() {
        return f132813d.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.r.f21928a;
        List selections = b50.r.f21932e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        pp2.a.R0(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9)) {
            return false;
        }
        m9 m9Var = (m9) obj;
        return Intrinsics.d(this.f132814a, m9Var.f132814a) && Intrinsics.d(this.f132815b, m9Var.f132815b) && Intrinsics.d(this.f132816c, m9Var.f132816c);
    }

    public final int hashCode() {
        return this.f132816c.hashCode() + pk2.f.a(this.f132815b, this.f132814a.hashCode() * 31, 31);
    }

    @Override // pc.o0
    public final String name() {
        return "GetConversationQuery";
    }

    public final String toString() {
        return "GetConversationQuery(conversationId=" + this.f132814a + ", imageSpec=" + this.f132815b + ", shouldRequestPinsubTopicId=" + this.f132816c + ")";
    }
}
