package x40;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r5 implements pc.j0 {

    /* renamed from: m, reason: collision with root package name */
    public static final m0 f133157m = new m0(26, 0);

    /* renamed from: a, reason: collision with root package name */
    public final pc.r0 f133158a;

    /* renamed from: b, reason: collision with root package name */
    public final pc.r0 f133159b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f133160c;

    /* renamed from: d, reason: collision with root package name */
    public final pc.r0 f133161d;

    /* renamed from: e, reason: collision with root package name */
    public final String f133162e;

    /* renamed from: f, reason: collision with root package name */
    public final pc.r0 f133163f;

    /* renamed from: g, reason: collision with root package name */
    public final pc.r0 f133164g;

    /* renamed from: h, reason: collision with root package name */
    public final pc.r0 f133165h;

    /* renamed from: i, reason: collision with root package name */
    public final pc.r0 f133166i;

    /* renamed from: j, reason: collision with root package name */
    public final List f133167j;

    /* renamed from: k, reason: collision with root package name */
    public final pc.r0 f133168k;

    /* renamed from: l, reason: collision with root package name */
    public final pc.r0 f133169l;

    public r5(pc.r0 board, pc.r0 exploreArticle, pc.r0 pin, pc.r0 pins, String source, pc.r0 text, pc.r0 todayArticle, pc.r0 user, pc.r0 userDidItData, ArrayList userIds, pc.r0 emails, pc.r0 clientTrackingParams) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(exploreArticle, "exploreArticle");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(todayArticle, "todayArticle");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(userDidItData, "userDidItData");
        Intrinsics.checkNotNullParameter(userIds, "userIds");
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        this.f133158a = board;
        this.f133159b = exploreArticle;
        this.f133160c = pin;
        this.f133161d = pins;
        this.f133162e = source;
        this.f133163f = text;
        this.f133164g = todayArticle;
        this.f133165h = user;
        this.f133166i = userDidItData;
        this.f133167j = userIds;
        this.f133168k = emails;
        this.f133169l = clientTrackingParams;
    }

    @Override // pc.o0
    public final String a() {
        return "d8696b14460c2b1c1c1c61753a07b8c74a12e6a2544a06df0ea9c04ed6f9b364";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.e5.f137014a);
    }

    @Override // pc.o0
    public final String c() {
        return f133157m.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.l.f21894a;
        List selections = b50.l.f21898e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        pe.i.k1(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        return Intrinsics.d(this.f133158a, r5Var.f133158a) && Intrinsics.d(this.f133159b, r5Var.f133159b) && Intrinsics.d(this.f133160c, r5Var.f133160c) && Intrinsics.d(this.f133161d, r5Var.f133161d) && Intrinsics.d(this.f133162e, r5Var.f133162e) && Intrinsics.d(this.f133163f, r5Var.f133163f) && Intrinsics.d(this.f133164g, r5Var.f133164g) && Intrinsics.d(this.f133165h, r5Var.f133165h) && Intrinsics.d(this.f133166i, r5Var.f133166i) && Intrinsics.d(this.f133167j, r5Var.f133167j) && Intrinsics.d(this.f133168k, r5Var.f133168k) && Intrinsics.d(this.f133169l, r5Var.f133169l);
    }

    public final int hashCode() {
        return this.f133169l.hashCode() + pk2.f.a(this.f133168k, ep.b.c(this.f133167j, pk2.f.a(this.f133166i, pk2.f.a(this.f133165h, pk2.f.a(this.f133164g, pk2.f.a(this.f133163f, a.cb.d(this.f133162e, pk2.f.a(this.f133161d, pk2.f.a(this.f133160c, pk2.f.a(this.f133159b, this.f133158a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // pc.o0
    public final String name() {
        return "CreateConversationWithSimplifiedResponseMutation";
    }

    public final String toString() {
        return "CreateConversationWithSimplifiedResponseMutation(board=" + this.f133158a + ", exploreArticle=" + this.f133159b + ", pin=" + this.f133160c + ", pins=" + this.f133161d + ", source=" + this.f133162e + ", text=" + this.f133163f + ", todayArticle=" + this.f133164g + ", user=" + this.f133165h + ", userDidItData=" + this.f133166i + ", userIds=" + this.f133167j + ", emails=" + this.f133168k + ", clientTrackingParams=" + this.f133169l + ")";
    }
}
