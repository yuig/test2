package com.pinterest.feature.pin.closeup.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b11.i;
import b11.p0;
import b11.q0;
import b11.r0;
import b11.s0;
import b11.t0;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.sharesheet.view.UABAnimatedShareButton;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import ek2.j;
import h32.c1;
import java.util.HashMap;
import kh2.u2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.z;
import net.quikkly.android.utils.BitmapUtils;
import np0.g;
import nx.b0;
import nx.d0;
import nx.d1;
import org.jetbrains.annotations.NotNull;
import p80.d;
import pk.a0;
import qh1.e;
import rl2.g0;
import rm1.c;
import uq.w;
import wk2.a;
import x02.i2;
import xj2.b;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/closeup/view/UnifiedPinActionBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "closeupActionLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UnifiedPinActionBarView extends w {
    public static final /* synthetic */ int L = 0;
    public m60.w A;
    public g B;
    public a C;
    public d1 D;
    public i2 E;
    public z F;
    public e G;
    public b0 H;
    public es.a I;

    /* renamed from: J, reason: collision with root package name */
    public final v f47036J;
    public r0 K;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f47037d;

    /* renamed from: e, reason: collision with root package name */
    public String f47038e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f47039f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIcon f47040g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f47041h;

    /* renamed from: i, reason: collision with root package name */
    public final UABAnimatedShareButton f47042i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f47043j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltButton f47044k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltButton f47045l;

    /* renamed from: m, reason: collision with root package name */
    public final FrameLayout f47046m;

    /* renamed from: n, reason: collision with root package name */
    public c f47047n;

    /* renamed from: o, reason: collision with root package name */
    public String f47048o;

    /* renamed from: p, reason: collision with root package name */
    public f30 f47049p;

    /* renamed from: q, reason: collision with root package name */
    public final b f47050q;

    /* renamed from: r, reason: collision with root package name */
    public c82.a f47051r;

    /* renamed from: s, reason: collision with root package name */
    public long f47052s;

    /* renamed from: t, reason: collision with root package name */
    public final v32.c f47053t;

    /* renamed from: u, reason: collision with root package name */
    public v32.c f47054u;

    /* renamed from: v, reason: collision with root package name */
    public j f47055v;

    /* renamed from: w, reason: collision with root package name */
    public final i f47056w;

    /* renamed from: x, reason: collision with root package name */
    public String f47057x;

    /* renamed from: y, reason: collision with root package name */
    public final t0 f47058y;

    /* renamed from: z, reason: collision with root package name */
    public final s0 f47059z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPinActionBarView(Context context, d0 pinalytics, String str) {
        super(context, 17);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f47047n = c.LIGHT;
        this.f47050q = new b();
        this.f47053t = v32.c.LIKE;
        this.f47056w = i.D;
        this.f47058y = new t0(this);
        this.f47059z = new s0(this);
        this.f47036J = m.b(new r0(this, 1));
        this.K = new r0(this, 0);
        View.inflate(getContext(), d.view_unified_pin_action_bar, this);
        View findViewById = findViewById(p80.c.action_module_comments_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.f47039f = viewGroup;
        View findViewById2 = findViewById(p80.c.action_module_comments_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltIcon gestaltIcon = (GestaltIcon) findViewById2;
        this.f47040g = gestaltIcon;
        View findViewById3 = findViewById(p80.c.action_module_share_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        this.f47041h = linearLayout;
        View findViewById4 = findViewById(p80.c.action_module_share_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        UABAnimatedShareButton uABAnimatedShareButton = (UABAnimatedShareButton) findViewById4;
        this.f47042i = uABAnimatedShareButton;
        View findViewById5 = findViewById(p80.c.action_buttons_center);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47043j = (LinearLayout) findViewById5;
        gestaltIcon.g2(new q0(this, 0));
        uABAnimatedShareButton.Z(this.f47047n);
        a0();
        Z();
        View findViewById6 = findViewById(p80.c.clickthrough_button_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47046m = (FrameLayout) findViewById6;
        if (T()) {
            linearLayout.setVisibility(8);
            viewGroup.setVisibility(8);
            linearLayout.setOnClickListener(null);
            viewGroup.setOnClickListener(null);
            viewGroup.setOnLongClickListener(null);
        }
        setClickable(true);
        setClipChildren(false);
        this.f47037d = pinalytics;
        this.f47038e = str;
    }

    public final void L(String str, HashMap hashMap) {
        d0 d0Var;
        c1 c1Var;
        Boolean bool = Boolean.FALSE;
        f30 f30Var = this.f47049p;
        if (f30Var == null || (d0Var = this.f47037d) == null) {
            return;
        }
        String str2 = this.f47057x;
        if (str2 != null) {
            String uid = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            c1Var = u2.O(uid, str2);
        } else {
            c1Var = null;
        }
        c82.a aVar = this.f47051r;
        g gVar = this.B;
        if (gVar == null) {
            Intrinsics.r("closeupActionController");
            throw null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gVar.a(context, f30Var, str, "unknown", d0Var, aVar, this.f47050q, (r25 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : c1Var, (r25 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? Boolean.FALSE : bool, (r25 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? new HashMap() : hashMap, false);
    }

    public final boolean T() {
        return ((Boolean) this.f47036J.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(com.pinterest.api.model.f30 r10) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView.X(com.pinterest.api.model.f30):void");
    }

    public final void Z() {
        View findViewById = findViewById(p80.c.clickthrough_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        gestaltButton.d(i.E);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f47045l = gestaltButton;
    }

    public final void a0() {
        View findViewById = findViewById(p80.c.save_pinit_bt);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        gestaltButton.d(i.F);
        gestaltButton.g(new p0(this, 2));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f47044k = gestaltButton;
    }

    public final void d0() {
        GestaltButton gestaltButton = this.f47044k;
        if (gestaltButton == null) {
            Intrinsics.r("saveButton");
            throw null;
        }
        f30 f30Var = this.f47049p;
        if (f30Var != null && Intrinsics.d(f30Var.T5(), Boolean.TRUE)) {
            a0.l0(gestaltButton);
            return;
        }
        f30 f30Var2 = this.f47049p;
        if (f30Var2 != null && g0.U(f30Var2)) {
            gestaltButton.d(i.H);
            return;
        }
        f30 f30Var3 = this.f47049p;
        if (f30Var3 == null || g0.U(f30Var3)) {
            return;
        }
        gestaltButton.d(i.I);
    }

    public final m60.w getEventManager() {
        m60.w wVar = this.A;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getEventManager().h(this.f47059z);
        getEventManager().h(this.f47058y);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getEventManager().j(this.f47059z);
        getEventManager().j(this.f47058y);
        this.f47050q.d();
        j jVar = this.f47055v;
        if (jVar != null && !jVar.isDisposed()) {
            jVar.dispose();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPinActionBarView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 17);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47047n = c.LIGHT;
        this.f47050q = new b();
        this.f47053t = v32.c.LIKE;
        this.f47056w = i.D;
        this.f47058y = new t0(this);
        this.f47059z = new s0(this);
        this.f47036J = m.b(new r0(this, 1));
        this.K = new r0(this, 0);
        View.inflate(getContext(), d.view_unified_pin_action_bar, this);
        View findViewById = findViewById(p80.c.action_module_comments_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.f47039f = viewGroup;
        View findViewById2 = findViewById(p80.c.action_module_comments_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltIcon gestaltIcon = (GestaltIcon) findViewById2;
        this.f47040g = gestaltIcon;
        View findViewById3 = findViewById(p80.c.action_module_share_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        this.f47041h = linearLayout;
        View findViewById4 = findViewById(p80.c.action_module_share_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        UABAnimatedShareButton uABAnimatedShareButton = (UABAnimatedShareButton) findViewById4;
        this.f47042i = uABAnimatedShareButton;
        View findViewById5 = findViewById(p80.c.action_buttons_center);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47043j = (LinearLayout) findViewById5;
        gestaltIcon.g2(new q0(this, 0));
        uABAnimatedShareButton.Z(this.f47047n);
        a0();
        Z();
        View findViewById6 = findViewById(p80.c.clickthrough_button_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47046m = (FrameLayout) findViewById6;
        if (T()) {
            linearLayout.setVisibility(8);
            viewGroup.setVisibility(8);
            linearLayout.setOnClickListener(null);
            viewGroup.setOnClickListener(null);
            viewGroup.setOnLongClickListener(null);
        }
        setClickable(true);
        setClipChildren(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPinActionBarView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 17, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47047n = c.LIGHT;
        this.f47050q = new b();
        this.f47053t = v32.c.LIKE;
        this.f47056w = i.D;
        this.f47058y = new t0(this);
        this.f47059z = new s0(this);
        this.f47036J = m.b(new r0(this, 1));
        this.K = new r0(this, 0);
        View.inflate(getContext(), d.view_unified_pin_action_bar, this);
        View findViewById = findViewById(p80.c.action_module_comments_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.f47039f = viewGroup;
        View findViewById2 = findViewById(p80.c.action_module_comments_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltIcon gestaltIcon = (GestaltIcon) findViewById2;
        this.f47040g = gestaltIcon;
        View findViewById3 = findViewById(p80.c.action_module_share_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        this.f47041h = linearLayout;
        View findViewById4 = findViewById(p80.c.action_module_share_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        UABAnimatedShareButton uABAnimatedShareButton = (UABAnimatedShareButton) findViewById4;
        this.f47042i = uABAnimatedShareButton;
        View findViewById5 = findViewById(p80.c.action_buttons_center);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47043j = (LinearLayout) findViewById5;
        gestaltIcon.g2(new q0(this, 0));
        uABAnimatedShareButton.Z(this.f47047n);
        a0();
        Z();
        View findViewById6 = findViewById(p80.c.clickthrough_button_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47046m = (FrameLayout) findViewById6;
        if (T()) {
            linearLayout.setVisibility(8);
            viewGroup.setVisibility(8);
            linearLayout.setOnClickListener(null);
            viewGroup.setOnClickListener(null);
            viewGroup.setOnLongClickListener(null);
        }
        setClickable(true);
        setClipChildren(false);
    }
}
