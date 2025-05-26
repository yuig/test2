package wg1;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.feature.ideaPinCreation.closeup.view.e1;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.e4;
import lh0.g1;
import lh0.z3;
import m60.r0;
import nx.d1;
import rq.o2;
import so.jb;
import so.oa;
import x02.a2;

/* loaded from: classes5.dex */
public final class z extends b implements tg1.k {
    public static final /* synthetic */ int C = 0;
    public ug1.k A;
    public final gs0.k B;

    /* renamed from: j, reason: collision with root package name */
    public final nx.d0 f129876j;

    /* renamed from: k, reason: collision with root package name */
    public final e4 f129877k;

    /* renamed from: l, reason: collision with root package name */
    public final ConstraintLayout f129878l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f129879m;

    /* renamed from: n, reason: collision with root package name */
    public final WebImageView f129880n;

    /* renamed from: o, reason: collision with root package name */
    public final PinterestVideoView f129881o;

    /* renamed from: p, reason: collision with root package name */
    public GestaltIconButton f129882p;

    /* renamed from: q, reason: collision with root package name */
    public GestaltIconButton f129883q;

    /* renamed from: r, reason: collision with root package name */
    public final GestaltText f129884r;

    /* renamed from: s, reason: collision with root package name */
    public final GestaltText f129885s;

    /* renamed from: t, reason: collision with root package name */
    public final GestaltText f129886t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f129887u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltButton f129888v;

    /* renamed from: w, reason: collision with root package name */
    public final View f129889w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f129890x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f129891y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f129892z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, nx.d0 pinalytics, e4 experiments) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        if (!this.f129721i) {
            this.f129721i = true;
            oa oaVar = ((jb) ((a0) generatedComponent())).f113483a;
            this.B = oaVar.w2();
        }
        this.f129876j = pinalytics;
        this.f129877k = experiments;
        boolean q13 = hf0.b.q();
        this.f129890x = q13;
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin_one_and_a_half) + getResources().getDimensionPixelSize(ga2.b.lego_search_bar_height);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        setElevation(getResources().getDimension(eo1.c.space_100));
        t(getResources().getDimensionPixelSize(eo1.c.ignore));
        View inflate = LayoutInflater.from(context).inflate(q13 ? i82.e.view_spotlight_pin_cell_tablet : i82.e.view_spotlight_pin_cell, (ViewGroup) null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        this.f129878l = constraintLayout;
        int i13 = 0;
        constraintLayout.setOnClickListener(new u(this, 0));
        View findViewById = constraintLayout.findViewById(i82.c.spotlight_pin_overlay_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f129879m = (LinearLayout) findViewById;
        LinearLayout linearLayout = (LinearLayout) constraintLayout.findViewById(i82.c.spotlight_pin_content_container);
        this.f129887u = linearLayout;
        View findViewById2 = constraintLayout.findViewById(i82.c.spotlight_pin_promoter);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        this.f129884r = gestaltText;
        View findViewById3 = constraintLayout.findViewById(i82.c.spotlight_pin_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        this.f129885s = gestaltText2;
        View findViewById4 = constraintLayout.findViewById(i82.c.spotlight_hide_reason);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f129886t = (GestaltText) findViewById4;
        View findViewById5 = constraintLayout.findViewById(i82.c.spotlight_pin_cta_gestalt);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f129888v = (GestaltButton) findViewById5;
        X(null);
        this.f129889w = constraintLayout.findViewById(i82.c.wide_video_overlay);
        WebImageView webImageView = (WebImageView) constraintLayout.findViewById(i82.c.pin_spotlight_image_view);
        this.f129880n = webImageView;
        if (q13) {
            ViewGroup.LayoutParams layoutParams = webImageView.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
            float dimensionPixelSize2 = webImageView.getResources().getDimensionPixelSize(eo1.c.space_800);
            webImageView.g2(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        }
        View findViewById6 = constraintLayout.findViewById(i82.c.spotlight_immersive_video);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        PinterestVideoView pinterestVideoView = (PinterestVideoView) findViewById6;
        this.f129881o = pinterestVideoView;
        pinterestVideoView.A(false);
        pinterestVideoView.f52796x = true;
        pinterestVideoView.M(q13 ? pinterestVideoView.getResources().getDimensionPixelSize(eo1.c.space_800) : 0.0f);
        pinterestVideoView.P(true);
        pinterestVideoView.O(false);
        pinterestVideoView.g0(nc2.j.AUTOPLAY_BY_STATE_WITH_NETWORK);
        pinterestVideoView.e0(bc2.m.GRID);
        pinterestVideoView.u0(new e1(this, 4));
        pinterestVideoView.getViewTreeObserver().addOnGlobalLayoutListener(new w(pinterestVideoView, i13));
        if (q13) {
            ViewGroup.LayoutParams layoutParams2 = pinterestVideoView.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = dimensionPixelSize;
        }
        if (q13) {
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = dimensionPixelSize;
            if (hf0.b.m()) {
                gestaltText2.i(d.F);
            }
        }
        if (!dl2.b.T1(context)) {
            gestaltText.i(d.G);
        }
        addView(constraintLayout);
    }

    public final boolean D(boolean z13) {
        return z13 || !this.f129890x;
    }

    public final void L() {
        PinterestVideoView pinterestVideoView = this.f129881o;
        if (pinterestVideoView.f()) {
            oc2.i.a(pinterestVideoView);
        }
    }

    public final void T() {
        Integer num = this.f129891y;
        if (num != null) {
            int intValue = num.intValue();
            Context context = getContext();
            int i13 = eo1.b.color_white_0;
            Object obj = d5.a.f53679a;
            if (f5.c.d(intValue, context.getColor(i13)) < 4.5d) {
                this.f129884r.i(d.f129734J);
                this.f129885s.i(d.K);
                GestaltIconButton gestaltIconButton = this.f129882p;
                if (gestaltIconButton == null) {
                    Intrinsics.r("overflowIcon");
                    throw null;
                }
                gestaltIconButton.t(d.L);
                GestaltIconButton gestaltIconButton2 = this.f129883q;
                if (gestaltIconButton2 != null) {
                    gestaltIconButton2.t(d.M);
                } else {
                    Intrinsics.r("soundIcon");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(com.pinterest.api.model.f30 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "overflowIcon"
            java.lang.String r1 = "soundIcon"
            java.lang.String r2 = "findViewById(...)"
            androidx.constraintlayout.widget.ConstraintLayout r3 = r8.f129878l
            r4 = 0
            if (r9 == 0) goto L1d
            com.pinterest.api.model.g r9 = r9.t3()
            if (r9 == 0) goto L1d
            java.lang.Boolean r9 = r9.c0()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r5)
            if (r9 != 0) goto L39
        L1d:
            lh0.e4 r9 = r8.f129877k
            r9.getClass()
            lh0.z3 r5 = lh0.a4.f83297a
            lh0.z0 r9 = r9.f83339a
            lh0.g1 r9 = (lh0.g1) r9
            java.lang.String r6 = "enabled"
            java.lang.String r7 = "slp_swap_overflow_audio_buttons"
            boolean r5 = r9.o(r7, r6, r5)
            if (r5 != 0) goto L5a
            boolean r9 = r9.l(r7)
            if (r9 == 0) goto L39
            goto L5a
        L39:
            int r9 = i82.c.spotlight_icon1
            android.view.View r9 = r3.findViewById(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            com.pinterest.gestalt.iconbutton.GestaltIconButton r9 = (com.pinterest.gestalt.iconbutton.GestaltIconButton) r9
            r8.f129882p = r9
            int r9 = i82.c.spotlight_icon2
            android.view.View r9 = r3.findViewById(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            com.pinterest.gestalt.iconbutton.GestaltIconButton r9 = (com.pinterest.gestalt.iconbutton.GestaltIconButton) r9
            r8.f129883q = r9
            if (r9 == 0) goto L56
            goto L78
        L56:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r4
        L5a:
            int r9 = i82.c.spotlight_icon2
            android.view.View r9 = r3.findViewById(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            com.pinterest.gestalt.iconbutton.GestaltIconButton r9 = (com.pinterest.gestalt.iconbutton.GestaltIconButton) r9
            r8.f129882p = r9
            int r9 = i82.c.spotlight_icon1
            android.view.View r9 = r3.findViewById(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            com.pinterest.gestalt.iconbutton.GestaltIconButton r9 = (com.pinterest.gestalt.iconbutton.GestaltIconButton) r9
            r8.f129883q = r9
            com.pinterest.gestalt.iconbutton.GestaltIconButton r9 = r8.f129882p
            if (r9 == 0) goto Ld2
        L78:
            com.pinterest.gestalt.iconbutton.GestaltIconButton r2 = r8.f129882p
            if (r2 == 0) goto Lce
            wg1.y r0 = wg1.y.f129858j
            r2.t(r0)
            com.pinterest.gestalt.iconbutton.GestaltIconButton r0 = r8.f129883q
            if (r0 == 0) goto Lca
            wg1.y r2 = wg1.y.f129859k
            r0.t(r2)
            android.content.Context r0 = r8.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r0 = dl2.b.T1(r0)
            if (r0 != 0) goto Lc9
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            if (r0 == 0) goto Lc1
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            android.content.Context r3 = r8.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            int r2 = eo1.c.space_200
            int r2 = bs1.c.V(r3, r2)
            r0.topMargin = r2
            r9.setLayoutParams(r0)
            com.pinterest.gestalt.iconbutton.GestaltIconButton r9 = r8.f129883q
            if (r9 == 0) goto Lbd
            wg1.y r0 = wg1.y.f129860l
            r9.t(r0)
            goto Lc9
        Lbd:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r4
        Lc1:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            r9.<init>(r0)
            throw r9
        Lc9:
            return
        Lca:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r4
        Lce:
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r4
        Ld2:
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.z.X(com.pinterest.api.model.f30):void");
    }

    public final void Y(boolean z13) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rm1.q qVar = !dl2.b.T1(context) ? z13 ? rm1.q.MUTE : rm1.q.SOUND : z13 ? rm1.q.MUTE_FILL : rm1.q.SOUND_FILL;
        GestaltIconButton gestaltIconButton = this.f129883q;
        if (gestaltIconButton != null) {
            gestaltIconButton.t(new o2(qVar, 25));
        } else {
            Intrinsics.r("soundIcon");
            throw null;
        }
    }

    public final void Z(final boolean z13) {
        boolean z14 = this.f129890x;
        if (z14 || !D(this.f129892z)) {
            return;
        }
        final boolean z15 = this.f129892z;
        final GestaltButton gestaltButton = this.f129888v;
        ViewGroup.LayoutParams layoutParams = gestaltButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        final ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.f17691t = -1;
        Runnable runnable = new Runnable() { // from class: wg1.v
            @Override // java.lang.Runnable
            public final void run() {
                boolean z16;
                z this$0 = z.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ConstraintLayout.LayoutParams this_updateLayoutParams = layoutParams2;
                Intrinsics.checkNotNullParameter(this_updateLayoutParams, "$this_updateLayoutParams");
                GestaltButton this_apply = gestaltButton;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                int lineCount = this$0.f129885s.getLineCount();
                GestaltText gestaltText = this$0.f129885s;
                if (lineCount == 1 || ((z16 = z15) && z13)) {
                    this_updateLayoutParams.setMargins(0, 0, bs1.c.W(this_apply, eo1.c.space_400), 0);
                    this_updateLayoutParams.f17671i = this$0.f129884r.getId();
                    this_updateLayoutParams.f17677l = gestaltText.getId();
                } else if (z16) {
                    this_updateLayoutParams.setMargins(0, 0, bs1.c.W(this_apply, eo1.c.space_400), 0);
                    this_updateLayoutParams.f17673j = this$0.f129881o.getId();
                    this_updateLayoutParams.f17677l = 0;
                } else if (lineCount > 1) {
                    this_updateLayoutParams.setMargins(0, 0, bs1.c.W(this_apply, eo1.c.space_400), 0);
                    this_updateLayoutParams.f17671i = gestaltText.getId();
                    this_updateLayoutParams.f17677l = gestaltText.getId();
                } else {
                    this_updateLayoutParams.setMargins(0, 0, bs1.c.W(this_apply, eo1.c.space_400), bs1.c.W(this_apply, eo1.c.space_400));
                    this_updateLayoutParams.f17671i = -1;
                    this_updateLayoutParams.f17677l = 0;
                }
            }
        };
        GestaltText gestaltText = this.f129885s;
        gestaltText.post(runnable);
        gestaltButton.setLayoutParams(layoutParams2);
        boolean z16 = this.f129892z;
        GestaltText gestaltText2 = this.f129884r;
        if (!z14 && D(z16)) {
            ViewGroup.LayoutParams layoutParams3 = gestaltText2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
            layoutParams4.f17693v = -1;
            layoutParams4.f17692u = gestaltButton.getId();
            Context context = gestaltText2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            layoutParams4.setMarginStart(bs1.c.V(context, eo1.c.space_400));
            Context context2 = gestaltText2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            layoutParams4.setMarginEnd(bs1.c.V(context2, eo1.c.space_400));
            if (z16 && z13) {
                Context context3 = gestaltText2.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = bs1.c.V(context3, eo1.c.space_100);
                layoutParams4.f17673j = this.f129881o.getId();
                layoutParams4.f17675k = gestaltText.getId();
                layoutParams4.K = 2;
            } else if (z13) {
                Context context4 = gestaltText2.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = bs1.c.V(context4, eo1.c.space_100);
                layoutParams4.f17671i = -1;
                layoutParams4.f17677l = -1;
                layoutParams4.f17675k = gestaltText.getId();
            } else {
                layoutParams4.f17671i = gestaltButton.getId();
                layoutParams4.f17677l = gestaltButton.getId();
                layoutParams4.f17675k = -1;
            }
            gestaltText2.setLayoutParams(layoutParams4);
            gestaltText2.i(y.f129861m);
            gestaltText2.requestLayout();
        }
        boolean z17 = this.f129892z;
        if (!z14 && D(z17)) {
            ViewGroup.LayoutParams layoutParams5 = gestaltText.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            ((ViewGroup.MarginLayoutParams) layoutParams6).width = 0;
            layoutParams6.f17693v = -1;
            layoutParams6.f17692u = gestaltButton.getId();
            layoutParams6.f17675k = -1;
            layoutParams6.f17677l = 0;
            Context context5 = gestaltText.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            layoutParams6.setMarginStart(bs1.c.V(context5, eo1.c.space_400));
            Context context6 = gestaltText.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            layoutParams6.setMarginEnd(bs1.c.V(context6, eo1.c.space_400));
            if (z17) {
                layoutParams6.f17673j = gestaltText2.getId();
                layoutParams6.K = 2;
            } else {
                Context context7 = gestaltText.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = bs1.c.V(context7, eo1.c.space_400);
            }
            gestaltText.setLayoutParams(layoutParams6);
            gestaltText.i(y.f129863o);
            gestaltText.requestLayout();
        }
        boolean z18 = this.f129892z;
        if (z14 || !z18) {
            return;
        }
        gestaltText2.i(y.f129862n);
        gestaltText.post(new s81.g(this, 7));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (i13 == 24 || i13 == 25) {
            Object systemService = getContext().getSystemService("audio");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            boolean z13 = i13 == 25 && ((AudioManager) systemService).getStreamVolume(3) == 0;
            this.f129881o.P(z13);
            Y(z13);
        }
        return super.onKeyDown(i13, keyEvent);
    }

    public final void x() {
        f30 f30Var;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        String str;
        HashMap hashMap4;
        HashMap hashMap5;
        e4 e4Var;
        String D;
        a11.n nVar;
        boolean z13;
        boolean a13;
        String uid;
        ug1.k kVar = this.A;
        if (kVar == null || (f30Var = kVar.f122211o) == null) {
            return;
        }
        boolean z14 = kVar.f122209m;
        uk1.d dVar = kVar.f122197a;
        if (z14) {
            nx.d0 d0Var = dVar.f122379a;
            f1 f1Var = f1.TAP;
            g0 g0Var = g0.FLOWED_PIN;
            String uid2 = f30Var.getUid();
            u0 u0Var = u0.UNDO_BUTTON;
            Intrinsics.f(d0Var);
            d0Var.N(f1Var, u0Var, g0Var, uid2, false);
            js0.a aVar = kVar.f122221y;
            if (aVar != null) {
                Object[] objArr = new Object[1];
                f30 f30Var2 = kVar.f122211o;
                objArr[0] = f30Var2 != null ? f30Var2.getUid() : null;
                com.pinterest.hairball.network.d prepare = aVar.prepare(objArr);
                a2 a2Var = ck2.i.f27924d;
                Intrinsics.checkNotNullExpressionValue(a2Var, "emptyConsumer(...)");
                kVar.addDisposable(prepare.execute((ak2.e) a2Var, (ak2.e) kVar.f122220x));
            }
            f30 f30Var3 = kVar.f122211o;
            if (f30Var3 == null || (uid = f30Var3.getUid()) == null) {
                return;
            }
            gb2.f fVar = gb2.f.f64747a;
            gb2.f.c(new gb2.i(uid, wa2.p.STATE_NO_FEEDBACK, wa2.o.BOTH));
            return;
        }
        kVar.f122218v = kVar.f122219w.a();
        String p33 = kVar.p3(kVar.f122211o);
        f30 f30Var4 = kVar.f122211o;
        ur.a aVar2 = kVar.f122208l;
        xr.a aVar3 = kVar.f122202f;
        if (f30Var4 != null && ((es.c) ((ur.b) aVar2).f123058a).l0(f30Var4)) {
            aVar3.a(f30Var4, true);
        }
        ((z) ((tg1.k) kVar.getView())).f129881o.F0 = p33;
        HashMap hashMap6 = kVar.f122214r;
        if (hashMap6 != null) {
            kVar.f122207k.a(kVar.f122211o, aVar3, hashMap6);
        }
        nx.d0 d0Var2 = dVar.f122379a;
        Intrinsics.f(d0Var2);
        g0 g0Var2 = g0.FLOWED_PIN;
        f30 f30Var5 = kVar.f122211o;
        String uid3 = f30Var5 != null ? f30Var5.getUid() : null;
        HashMap hashMap7 = kVar.f122214r;
        if (hashMap7 != null) {
            hashMap7.put("is_premiere", "true");
            Unit unit = Unit.f80348a;
            hashMap = hashMap7;
        } else {
            hashMap = null;
        }
        nx.d0.B(d0Var2, null, g0Var2, uid3, hashMap, 17);
        f1 f1Var2 = f1.PIN_CLICKTHROUGH;
        HashMap hashMap8 = kVar.f122214r;
        if (hashMap8 != null) {
            hashMap8.put("is_premiere", "true");
            Unit unit2 = Unit.f80348a;
            hashMap2 = hashMap8;
        } else {
            hashMap2 = null;
        }
        nx.d0.B(d0Var2, f1Var2, g0Var2, p33, hashMap2, 16);
        f1 f1Var3 = f1.PIN_CLICK;
        g0 g0Var3 = g0.BROWSER;
        HashMap hashMap9 = kVar.f122214r;
        if (hashMap9 != null) {
            hashMap9.put("click_type", "clickthrough");
            hashMap9.put("is_premiere", "true");
            Unit unit3 = Unit.f80348a;
            hashMap3 = hashMap9;
        } else {
            hashMap3 = null;
        }
        f30 f30Var6 = kVar.f122211o;
        if (f30Var6 != null) {
            d1 d1Var = kVar.f122206j;
            str = d1Var != null ? d1Var.b(f30Var6) : null;
        } else {
            str = null;
        }
        d0Var2.k(f1Var3, g0Var3, p33, hashMap3, str);
        f1 f1Var4 = f1.VIEW_WEBSITE_100;
        f30 f30Var7 = kVar.f122211o;
        String uid4 = f30Var7 != null ? f30Var7.getUid() : null;
        HashMap hashMap10 = kVar.f122214r;
        if (hashMap10 != null) {
            hashMap10.put("pin_is_promoted", "true");
            hashMap10.put("closeup_navigation_type", nq.b.CLICK.getType());
            Unit unit4 = Unit.f80348a;
            hashMap4 = hashMap10;
        } else {
            hashMap4 = null;
        }
        nx.d0.B(d0Var2, f1Var4, g0Var3, uid4, hashMap4, 16);
        f1 f1Var5 = f1.DESTINATION_VIEW;
        HashMap hashMap11 = kVar.f122214r;
        if (hashMap11 != null) {
            hashMap11.put("click_type", "clickthrough");
            Unit unit5 = Unit.f80348a;
            hashMap5 = hashMap11;
        } else {
            hashMap5 = null;
        }
        nx.d0.B(d0Var2, f1Var5, g0Var3, p33, hashMap5, 16);
        f1 f1Var6 = f1.VIEW_WEBSITE_ONE_PIXEL;
        f30 f30Var8 = kVar.f122211o;
        nx.d0.B(d0Var2, f1Var6, g0Var3, f30Var8 != null ? f30Var8.getUid() : null, kVar.f122214r, 16);
        String p34 = kVar.p3(f30Var);
        ((z) ((tg1.k) kVar.getView())).f129881o.F0 = p34;
        ur.b bVar = (ur.b) aVar2;
        boolean E = ((es.c) bVar.f123058a).E(f30Var);
        e4 e4Var2 = kVar.f122201e;
        if (E) {
            e4Var2.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) e4Var2.f83339a;
            if (g1Var.o("android_premiere_slp_mdl", "enabled", z3Var) || g1Var.l("android_premiere_slp_mdl")) {
                ni1.d dVar2 = kVar.f122205i;
                es.a aVar4 = bVar.f123058a;
                e4Var = e4Var2;
                a13 = dVar2.a(f30Var, null, null, null, null, (r19 & 32) != 0 ? false : false, (r19 & 64) != 0 ? false : false, aVar4);
                if (a13) {
                    return;
                }
                D = com.bumptech.glide.c.D(f30Var);
                if (D != null || (nVar = kVar.f122217u) == null) {
                }
                int i13 = kVar.f122212p;
                kVar.f122204h.getClass();
                ps0.y yVar = ro1.c.f108967f;
                ro1.b e13 = ps0.y.e(D);
                if (e13 == ro1.b.PROFILE || e13 == ro1.b.BOARD) {
                    e4Var.getClass();
                    z3 z3Var2 = a4.f83298b;
                    g1 g1Var2 = (g1) e4Var.f83339a;
                    if (g1Var2.o("premiere_spotlight_clickthrough_expansion", "enabled", z3Var2) || g1Var2.l("premiere_spotlight_clickthrough_expansion")) {
                        z13 = true;
                        a11.e.c(nVar, D, f30Var, z13, 0, i13, null, false, false, null, kVar.f122214r, p34, false, false, null, false, false, true, 63848);
                        return;
                    }
                }
                z13 = false;
                a11.e.c(nVar, D, f30Var, z13, 0, i13, null, false, false, null, kVar.f122214r, p34, false, false, null, false, false, true, 63848);
                return;
            }
        }
        e4Var = e4Var2;
        D = com.bumptech.glide.c.D(f30Var);
        if (D != null) {
        }
    }
}
