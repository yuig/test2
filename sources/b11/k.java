package b11;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.z3;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes5.dex */
public final class k extends FrameLayout implements af2.c {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f21049o = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f21050a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21051b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f21052c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButtonGroup f21053d;

    /* renamed from: e, reason: collision with root package name */
    public f30 f21054e;

    /* renamed from: f, reason: collision with root package name */
    public String f21055f;

    /* renamed from: g, reason: collision with root package name */
    public final xj2.b f21056g;

    /* renamed from: h, reason: collision with root package name */
    public String f21057h;

    /* renamed from: i, reason: collision with root package name */
    public final m60.w f21058i;

    /* renamed from: j, reason: collision with root package name */
    public final np0.g f21059j;

    /* renamed from: k, reason: collision with root package name */
    public final lh0.z f21060k;

    /* renamed from: l, reason: collision with root package name */
    public final hs.d f21061l;

    /* renamed from: m, reason: collision with root package name */
    public final nx.b0 f21062m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f21063n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, nx.d0 pinalytics) {
        super(context);
        fm1.c cVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        if (!this.f21051b) {
            this.f21051b = true;
            jb jbVar = (jb) ((l) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f21058i = (m60.w) oaVar.f113885r0.get();
            s8 s8Var = jbVar.f113485c;
            this.f21059j = s8Var.h5();
            this.f21060k = s8Var.i5();
            this.f21061l = s8Var.a6();
            this.f21062m = (nx.b0) oaVar.R8.get();
        }
        this.f21052c = pinalytics;
        this.f21056g = new xj2.b();
        this.f21063n = xk2.m.b(new w01.e0(this, 3));
        hs.d dVar = this.f21061l;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        boolean b13 = dVar.b();
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int W = (!hf0.b.n() || bs1.c.k0(context).isInMultiWindowMode()) ? bs1.c.W(this, eo1.c.space_200) : bs1.c.W(this, eo1.c.space_400);
        setPaddingRelative(W, b13 ? bs1.c.W(this, eo1.c.space_200) : bs1.c.W(this, eo1.c.space_400), W, b13 ? bs1.c.W(this, eo1.c.space_200) : 0);
        GestaltButtonGroup gestaltButtonGroup = new GestaltButtonGroup(6, context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        gestaltButtonGroup.setLayoutParams(layoutParams);
        ((g1) a().f83517a).c("android_ctx_closeup_clickthrough_button_show");
        lh0.z a13 = a();
        z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        Intrinsics.checkNotNullParameter("enabled_expand", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        if (((g1) a13.f83517a).k("android_ctx_closeup_clickthrough_button_show", "enabled_expand", activate)) {
            cVar = fm1.c.VISIBLE;
        } else {
            lh0.z a14 = a();
            Intrinsics.checkNotNullParameter("enabled_blank_space", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            cVar = ((g1) a14.f83517a).k("android_ctx_closeup_clickthrough_button_show", "enabled_blank_space", activate) ? fm1.c.INVISIBLE : fm1.c.GONE;
        }
        gestaltButtonGroup.a(new ky0.b(18, cVar, a().a() ? yl1.c.LARGE : yl1.c.SMALL));
        gestaltButtonGroup.b(new lq0.o(17, gestaltButtonGroup, this));
        GestaltButton gestaltButton = (GestaltButton) gestaltButtonGroup.findViewById(zl1.a.primary_button);
        Intrinsics.f(gestaltButton);
        gestaltButton.setMinWidth(bs1.c.W(gestaltButton, p80.a.action_button_min_width));
        ViewGroup.LayoutParams layoutParams2 = gestaltButton.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMarginStart(bs1.c.W(gestaltButton, eo1.c.space_100));
        gestaltButton.setLayoutParams(marginLayoutParams);
        GestaltButton gestaltButton2 = (GestaltButton) gestaltButtonGroup.findViewById(zl1.a.secondary_button);
        gestaltButton2.setId(p80.c.clickthrough_button);
        gestaltButton2.setMinWidth(bs1.c.W(gestaltButton2, p80.a.action_button_min_width));
        addView(gestaltButtonGroup);
        this.f21053d = gestaltButtonGroup;
        setClickable(true);
        setClipChildren(false);
    }

    public final lh0.z a() {
        lh0.z zVar = this.f21060k;
        if (zVar != null) {
            return zVar;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final boolean b(f30 f30Var) {
        if (f30Var == null && (f30Var = this.f21054e) == null) {
            return true;
        }
        boolean z13 = f30Var.V4() && !f30Var.U4().booleanValue();
        String s53 = f30Var.s5();
        return (s53 == null || kotlin.text.z.j(s53) || !z13) ? false : true;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f21050a == null) {
            this.f21050a = new ye2.o(this);
        }
        return this.f21050a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f21050a == null) {
            this.f21050a = new ye2.o(this);
        }
        return this.f21050a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f21056g.d();
        super.onDetachedFromWindow();
    }
}
