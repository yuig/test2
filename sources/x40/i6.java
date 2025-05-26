package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i6 implements pc.j0 {

    /* renamed from: g, reason: collision with root package name */
    public static final m0 f132536g = new m0(29, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132537a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132538b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f132539c;

    /* renamed from: d, reason: collision with root package name */
    public final pc.r0 f132540d;

    /* renamed from: e, reason: collision with root package name */
    public final String f132541e;

    /* renamed from: f, reason: collision with root package name */
    public final pc.r0 f132542f;

    public i6(String conversation, String anchorMessage, pc.r0 text, pc.r0 pinId, String source, pc.r0 clientTrackingParams) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(anchorMessage, "anchorMessage");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        this.f132537a = conversation;
        this.f132538b = anchorMessage;
        this.f132539c = text;
        this.f132540d = pinId;
        this.f132541e = source;
        this.f132542f = clientTrackingParams;
    }

    @Override // pc.o0
    public final String a() {
        return "ef4193d7b702528614dc2a03827705609386d84b91e9f776a451c10e683c4410";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.t5.f137498a);
    }

    @Override // pc.o0
    public final String c() {
        return f132536g.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.n.f21904a;
        List selections = b50.n.f21909f;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        ph.a.K0(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return Intrinsics.d(this.f132537a, i6Var.f132537a) && Intrinsics.d(this.f132538b, i6Var.f132538b) && Intrinsics.d(this.f132539c, i6Var.f132539c) && Intrinsics.d(this.f132540d, i6Var.f132540d) && Intrinsics.d(this.f132541e, i6Var.f132541e) && Intrinsics.d(this.f132542f, i6Var.f132542f);
    }

    public final int hashCode() {
        return this.f132542f.hashCode() + a.cb.d(this.f132541e, pk2.f.a(this.f132540d, pk2.f.a(this.f132539c, a.cb.d(this.f132538b, this.f132537a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // pc.o0
    public final String name() {
        return "CreateThreadMutation";
    }

    public final String toString() {
        return "CreateThreadMutation(conversation=" + this.f132537a + ", anchorMessage=" + this.f132538b + ", text=" + this.f132539c + ", pinId=" + this.f132540d + ", source=" + this.f132541e + ", clientTrackingParams=" + this.f132542f + ")";
    }
}
