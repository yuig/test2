package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements pc.j0 {

    /* renamed from: g, reason: collision with root package name */
    public static final g40.a f132685g = new g40.a(29, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132686a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132687b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f132688c;

    /* renamed from: d, reason: collision with root package name */
    public final pc.r0 f132689d;

    /* renamed from: e, reason: collision with root package name */
    public final String f132690e;

    /* renamed from: f, reason: collision with root package name */
    public final pc.r0 f132691f;

    public l0(String conversationId, String threadId, pc.r0 message, pc.r0 pinId, String source, pc.r0 clientTrackingParams) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        this.f132686a = conversationId;
        this.f132687b = threadId;
        this.f132688c = message;
        this.f132689d = pinId;
        this.f132690e = source;
        this.f132691f = clientTrackingParams;
    }

    @Override // pc.o0
    public final String a() {
        return "25330452b13e35e3cee594d196a6f75241d0fbdc6d10ffab87137233e44398bb";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.g0.f137075a);
    }

    @Override // pc.o0
    public final String c() {
        return f132685g.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.e.f21834a;
        List selections = b50.e.f21839f;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        lp2.b.t(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f132686a, l0Var.f132686a) && Intrinsics.d(this.f132687b, l0Var.f132687b) && Intrinsics.d(this.f132688c, l0Var.f132688c) && Intrinsics.d(this.f132689d, l0Var.f132689d) && Intrinsics.d(this.f132690e, l0Var.f132690e) && Intrinsics.d(this.f132691f, l0Var.f132691f);
    }

    public final int hashCode() {
        return this.f132691f.hashCode() + a.cb.d(this.f132690e, pk2.f.a(this.f132689d, pk2.f.a(this.f132688c, a.cb.d(this.f132687b, this.f132686a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // pc.o0
    public final String name() {
        return "AddThreadMessageMutation";
    }

    public final String toString() {
        return "AddThreadMessageMutation(conversationId=" + this.f132686a + ", threadId=" + this.f132687b + ", message=" + this.f132688c + ", pinId=" + this.f132689d + ", source=" + this.f132690e + ", clientTrackingParams=" + this.f132691f + ")";
    }
}
