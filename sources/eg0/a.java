package eg0;

import i32.t1;
import i32.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58859b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58860c;

    /* renamed from: d, reason: collision with root package name */
    public final String f58861d;

    /* renamed from: e, reason: collision with root package name */
    public final String f58862e;

    /* renamed from: f, reason: collision with root package name */
    public final String f58863f;

    /* renamed from: g, reason: collision with root package name */
    public final String f58864g;

    /* renamed from: h, reason: collision with root package name */
    public final String f58865h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f58866i;

    /* renamed from: j, reason: collision with root package name */
    public final String f58867j;

    /* renamed from: k, reason: collision with root package name */
    public final String f58868k;

    /* renamed from: l, reason: collision with root package name */
    public final String f58869l;

    /* renamed from: m, reason: collision with root package name */
    public final String f58870m;

    /* renamed from: n, reason: collision with root package name */
    public final int f58871n;

    /* renamed from: o, reason: collision with root package name */
    public final int f58872o;

    /* renamed from: p, reason: collision with root package name */
    public final h32.c f58873p;

    public a(vd0.c obj, int i13, boolean z13, String botChallengeType, boolean z14) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(botChallengeType, "botChallengeType");
        this.f58858a = z13;
        this.f58859b = botChallengeType;
        this.f58860c = z14;
        String o13 = obj.o("title_text", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        this.f58861d = o13;
        String o14 = obj.o("detail_text", "");
        Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
        this.f58862e = o14;
        String o15 = obj.o("message_dismissible", "");
        Intrinsics.checkNotNullExpressionValue(o15, "optString(...)");
        this.f58863f = o15;
        String o16 = obj.o("message_blocking", "");
        Intrinsics.checkNotNullExpressionValue(o16, "optString(...)");
        this.f58864g = o16;
        String o17 = obj.o("input_text_hint", "");
        Intrinsics.checkNotNullExpressionValue(o17, "optString(...)");
        this.f58865h = o17;
        Boolean h10 = obj.h("checkbox_checked", Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
        this.f58866i = h10.booleanValue();
        String o18 = obj.o("checkbox_text", "");
        Intrinsics.checkNotNullExpressionValue(o18, "optString(...)");
        this.f58867j = o18;
        String o19 = obj.o("dismiss_button_text", "");
        Intrinsics.checkNotNullExpressionValue(o19, "optString(...)");
        this.f58868k = o19;
        String o23 = obj.o("complete_button_image", "");
        Intrinsics.checkNotNullExpressionValue(o23, "optString(...)");
        this.f58869l = o23;
        String o24 = obj.o("complete_button_text", "");
        Intrinsics.checkNotNullExpressionValue(o24, "optString(...)");
        this.f58870m = o24;
        obj.j(0, "id");
        this.f58871n = obj.j(t1.DISMISS.getValue(), "dismiss_action");
        this.f58872o = obj.j(u.COMPLETE.getValue(), "complete_action");
        h32.c.Companion.getClass();
        this.f58873p = h32.a.a(i13);
    }

    public final String a() {
        return this.f58861d;
    }
}
