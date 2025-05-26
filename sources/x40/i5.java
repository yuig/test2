package x40;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i5 implements pc.j0 {

    /* renamed from: o, reason: collision with root package name */
    public static final m0 f132521o = new m0(14, 0);

    /* renamed from: a, reason: collision with root package name */
    public final pc.r0 f132522a;

    /* renamed from: b, reason: collision with root package name */
    public final pc.r0 f132523b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f132524c;

    /* renamed from: d, reason: collision with root package name */
    public final pc.r0 f132525d;

    /* renamed from: e, reason: collision with root package name */
    public final String f132526e;

    /* renamed from: f, reason: collision with root package name */
    public final pc.r0 f132527f;

    /* renamed from: g, reason: collision with root package name */
    public final pc.r0 f132528g;

    /* renamed from: h, reason: collision with root package name */
    public final pc.r0 f132529h;

    /* renamed from: i, reason: collision with root package name */
    public final pc.r0 f132530i;

    /* renamed from: j, reason: collision with root package name */
    public final List f132531j;

    /* renamed from: k, reason: collision with root package name */
    public final pc.r0 f132532k;

    /* renamed from: l, reason: collision with root package name */
    public final pc.r0 f132533l;

    /* renamed from: m, reason: collision with root package name */
    public final pc.r0 f132534m;

    /* renamed from: n, reason: collision with root package name */
    public final pc.r0 f132535n;

    public i5(pc.r0 board, pc.r0 exploreArticle, pc.r0 pin, pc.r0 pins, String source, pc.r0 text, pc.r0 todayArticle, pc.r0 user, pc.r0 userDidItData, ArrayList userIds, pc.r0 emails) {
        pc.p0 shouldRequestPinsubTopicId = pc.p0.f99597a;
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
        Intrinsics.checkNotNullParameter(shouldRequestPinsubTopicId, "imageSpec");
        Intrinsics.checkNotNullParameter(shouldRequestPinsubTopicId, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(shouldRequestPinsubTopicId, "shouldRequestPinsubTopicId");
        this.f132522a = board;
        this.f132523b = exploreArticle;
        this.f132524c = pin;
        this.f132525d = pins;
        this.f132526e = source;
        this.f132527f = text;
        this.f132528g = todayArticle;
        this.f132529h = user;
        this.f132530i = userDidItData;
        this.f132531j = userIds;
        this.f132532k = emails;
        this.f132533l = shouldRequestPinsubTopicId;
        this.f132534m = shouldRequestPinsubTopicId;
        this.f132535n = shouldRequestPinsubTopicId;
    }

    @Override // pc.o0
    public final String a() {
        return "a3761d34c918a81f711e7a02cec2e9db0481b4413e03518da8edc926453bd23f";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.w4.f137589a);
    }

    @Override // pc.o0
    public final String c() {
        return f132521o.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 type = c50.l2.f26125a.n();
        Intrinsics.checkNotNullParameter("data", "name");
        Intrinsics.checkNotNullParameter(type, "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.k.f21889a;
        List selections = b50.k.f21893e;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", type, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        oe.f.e1(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return Intrinsics.d(this.f132522a, i5Var.f132522a) && Intrinsics.d(this.f132523b, i5Var.f132523b) && Intrinsics.d(this.f132524c, i5Var.f132524c) && Intrinsics.d(this.f132525d, i5Var.f132525d) && Intrinsics.d(this.f132526e, i5Var.f132526e) && Intrinsics.d(this.f132527f, i5Var.f132527f) && Intrinsics.d(this.f132528g, i5Var.f132528g) && Intrinsics.d(this.f132529h, i5Var.f132529h) && Intrinsics.d(this.f132530i, i5Var.f132530i) && Intrinsics.d(this.f132531j, i5Var.f132531j) && Intrinsics.d(this.f132532k, i5Var.f132532k) && Intrinsics.d(this.f132533l, i5Var.f132533l) && Intrinsics.d(this.f132534m, i5Var.f132534m) && Intrinsics.d(this.f132535n, i5Var.f132535n);
    }

    public final int hashCode() {
        return this.f132535n.hashCode() + pk2.f.a(this.f132534m, pk2.f.a(this.f132533l, pk2.f.a(this.f132532k, ep.b.c(this.f132531j, pk2.f.a(this.f132530i, pk2.f.a(this.f132529h, pk2.f.a(this.f132528g, pk2.f.a(this.f132527f, a.cb.d(this.f132526e, pk2.f.a(this.f132525d, pk2.f.a(this.f132524c, pk2.f.a(this.f132523b, this.f132522a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // pc.o0
    public final String name() {
        return "CreateConversationMutation";
    }

    public final String toString() {
        return "CreateConversationMutation(board=" + this.f132522a + ", exploreArticle=" + this.f132523b + ", pin=" + this.f132524c + ", pins=" + this.f132525d + ", source=" + this.f132526e + ", text=" + this.f132527f + ", todayArticle=" + this.f132528g + ", user=" + this.f132529h + ", userDidItData=" + this.f132530i + ", userIds=" + this.f132531j + ", emails=" + this.f132532k + ", imageSpec=" + this.f132533l + ", clientTrackingParams=" + this.f132534m + ", shouldRequestPinsubTopicId=" + this.f132535n + ")";
    }
}
