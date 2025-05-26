package sf1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.pinterest.feature.storypin.closeup.view.IdeaPinScrubber;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.f2;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import we1.a2;

/* loaded from: classes5.dex */
public final class h0 extends uq.w {
    public static final /* synthetic */ int C = 0;
    public final ObjectAnimator A;
    public final e0 B;

    /* renamed from: d, reason: collision with root package name */
    public final mf1.a f112579d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f112580e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f112581f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f112582g;

    /* renamed from: h, reason: collision with root package name */
    public m60.w f112583h;

    /* renamed from: i, reason: collision with root package name */
    public lh0.v1 f112584i;

    /* renamed from: j, reason: collision with root package name */
    public final Guideline f112585j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f112586k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f112587l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltIcon f112588m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f112589n;

    /* renamed from: o, reason: collision with root package name */
    public final IdeaPinScrubber f112590o;

    /* renamed from: p, reason: collision with root package name */
    public final GestaltText f112591p;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltIconButton f112592q;

    /* renamed from: r, reason: collision with root package name */
    public final GestaltIconButton f112593r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f112594s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f112595t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f112596u;

    /* renamed from: v, reason: collision with root package name */
    public k0 f112597v;

    /* renamed from: w, reason: collision with root package name */
    public float f112598w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f112599x;

    /* renamed from: y, reason: collision with root package name */
    public float f112600y;

    /* renamed from: z, reason: collision with root package name */
    public final ObjectAnimator f112601z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, mf1.a ideaPinHostView, boolean z13, boolean z14, i0 listener) {
        super(context, 26);
        final int i13 = 0;
        final int i14 = 1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ideaPinHostView, "ideaPinHostView");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f112579d = ideaPinHostView;
        this.f112580e = z13;
        this.f112581f = z14;
        this.f112582g = listener;
        this.f112594s = new LinkedHashSet();
        this.f112599x = new int[2];
        View.inflate(context, rq1.b.view_idea_pin_video_controls, this);
        View findViewById = findViewById(rq1.a.video_controls_guideline);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f112585j = (Guideline) findViewById;
        View findViewById2 = findViewById(rq1.a.idea_pin_play_pause_overlay);
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        Intrinsics.f(frameLayout);
        frameLayout.setBackgroundColor(dl2.b.y0(frameLayout, eo1.a.color_background_dark_opacity_400));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f112586k = frameLayout;
        View findViewById3 = findViewById(rq1.a.idea_pin_play_pause_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        FrameLayout frameLayout2 = (FrameLayout) findViewById3;
        this.f112587l = frameLayout2;
        View findViewById4 = findViewById(rq1.a.idea_pin_play_pause_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltIcon gestaltIcon = (GestaltIcon) findViewById4;
        this.f112588m = gestaltIcon;
        View findViewById5 = findViewById(rq1.a.idea_pin_progress_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f112589n = (GestaltText) findViewById5;
        View findViewById6 = findViewById(rq1.a.idea_pin_scrubber);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        IdeaPinScrubber ideaPinScrubber = (IdeaPinScrubber) findViewById6;
        this.f112590o = ideaPinScrubber;
        View findViewById7 = findViewById(rq1.a.idea_pin_total_duration_text);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f112591p = (GestaltText) findViewById7;
        View findViewById8 = findViewById(rq1.a.idea_pin_mute_button);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById8;
        this.f112592q = gestaltIconButton;
        View findViewById9 = findViewById(rq1.a.idea_pin_expand_button);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) findViewById9;
        View findViewById10 = findViewById(rq1.a.idea_pin_cc_toggle_button);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        GestaltIconButton gestaltIconButton3 = (GestaltIconButton) findViewById10;
        this.f112593r = gestaltIconButton3;
        Context context2 = kb0.a.f79058b;
        if (((Boolean) ((ac2.u1) ((ac2.t1) ((oa) ((ac2.s1) lb.l0.k0(m60.f0.j0().getApplicationContext(), ac2.s1.class))).Sc.get())).f2063b.getValue()).booleanValue()) {
            gestaltIconButton3.t(c.f112525r);
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 22));
        }
        this.f112595t = frameLayout;
        int i15 = d0.f112539a[ideaPinHostView.ordinal()];
        if (i15 == 1) {
            this.f112596u = true;
            if (z13) {
                frameLayout.setAlpha(0.8f);
                bs1.c.U1(frameLayout);
            } else {
                frameLayout.setAlpha(0.0f);
                bs1.c.X0(frameLayout);
            }
            this.f112595t = this;
            setAlpha(0.0f);
            this.f112595t.setVisibility(4);
        } else if (i15 == 2) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            if (dl2.b.T1(context3)) {
                bs1.c.X0(gestaltIconButton2);
            } else {
                gestaltIconButton2.setVisibility(4);
            }
        } else if (i15 == 3) {
            gestaltIconButton2.t(c.f112523p);
        }
        if (z13) {
            gestaltIcon.g2(c.f112526s);
        } else {
            bs1.c.X0(frameLayout);
        }
        frameLayout2.setOnClickListener(new a2(this, 6));
        gestaltIconButton.u(new gm1.a(this) { // from class: sf1.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f112514b;

            {
                this.f112514b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                PinterestVideoView o13;
                int i16 = i13;
                h0 this$0 = this.f112514b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            e1 e1Var = (e1) this$0.f112582g;
                            int i17 = e1Var.f112558q.f19924d;
                            of1.b bVar = e1Var.F;
                            s1 D = bVar.D(i17);
                            if (D != null && !D.f112739q) {
                                i92.k kVar = e1Var.f112551j;
                                if (kVar != null) {
                                    kVar.k(pq1.f.toast_video_has_no_sound);
                                    return;
                                } else {
                                    Intrinsics.r("toastUtils");
                                    throw null;
                                }
                            }
                            h0 h0Var = e1Var.f112559r;
                            boolean z15 = !(h0Var.f112592q.w().f96639a == rm1.q.MUTE);
                            if (z15) {
                                h0Var.a0(true);
                                bVar.E();
                                nc2.h.f90406b = true;
                            } else {
                                h0Var.a0(e1Var.z0());
                                bVar.F();
                                nc2.h.f90406b = false;
                            }
                            j1 j1Var = e1Var.G;
                            if (j1Var != null) {
                                h32.f1 f1Var = z15 ? h32.f1.STORY_PIN_MUTE : h32.f1.STORY_PIN_UNMUTE;
                                h32.u0 u0Var = h32.u0.PIN_STORY_PIN_MUTE_BUTTON;
                                HashMap hashMap = new HashMap();
                                hashMap.put("is_music_attribution_visible", String.valueOf(e1Var.f112561t.getVisibility() == 0));
                                hashMap.put("is_promoted", String.valueOf(e1Var.O));
                                Unit unit = Unit.f80348a;
                                j1.L0(j1Var, f1Var, u0Var, hashMap, 8);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            mf1.a aVar = this$0.f112579d;
                            mf1.a aVar2 = mf1.a.PIN_CLOSEUP;
                            i0 i0Var = this$0.f112582g;
                            if (aVar == aVar2) {
                                e1 e1Var2 = (e1) i0Var;
                                m60.w eventManager = e1Var2.getEventManager();
                                NavigationImpl w13 = Navigation.w1((ScreenLocation) f2.f50783a.getValue());
                                j1 j1Var2 = e1Var2.G;
                                w13.m0("com.pinterest.EXTRA_PIN_ID", j1Var2 != null ? ((rf1.p0) j1Var2).u4() : null);
                                eventManager.d(w13);
                                return;
                            }
                            e1 e1Var3 = (e1) i0Var;
                            e1Var3.getClass();
                            Activity l03 = bs1.c.l0(e1Var3);
                            if (l03 != null) {
                                l03.onBackPressed();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            e1 e1Var4 = (e1) this$0.f112582g;
                            h0 h0Var2 = e1Var4.f112559r;
                            rm1.m mVar = h0Var2.f112593r.w().f96639a;
                            rm1.q qVar = rm1.q.CAPTIONS;
                            fd1.h hVar = new fd1.h(!(mVar == qVar), 12);
                            GestaltIconButton gestaltIconButton4 = h0Var2.f112593r;
                            gestaltIconButton4.t(hVar);
                            boolean z16 = gestaltIconButton4.w().f96639a == qVar;
                            s C2 = e1Var4.F.C(e1Var4.f112558q.f19924d);
                            if (C2 != null && (o13 = C2.o()) != null) {
                                o13.A0(z16);
                            }
                            j1 j1Var3 = e1Var4.G;
                            if (j1Var3 != null) {
                                j1.L0(j1Var3, z16 ? h32.f1.TOGGLE_ON : h32.f1.TOGGLE_OFF, h32.u0.CLOSED_CAPTIONS_BUTTON, null, 12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        gestaltIconButton2.u(new gm1.a(this) { // from class: sf1.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f112514b;

            {
                this.f112514b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                PinterestVideoView o13;
                int i16 = i14;
                h0 this$0 = this.f112514b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            e1 e1Var = (e1) this$0.f112582g;
                            int i17 = e1Var.f112558q.f19924d;
                            of1.b bVar = e1Var.F;
                            s1 D = bVar.D(i17);
                            if (D != null && !D.f112739q) {
                                i92.k kVar = e1Var.f112551j;
                                if (kVar != null) {
                                    kVar.k(pq1.f.toast_video_has_no_sound);
                                    return;
                                } else {
                                    Intrinsics.r("toastUtils");
                                    throw null;
                                }
                            }
                            h0 h0Var = e1Var.f112559r;
                            boolean z15 = !(h0Var.f112592q.w().f96639a == rm1.q.MUTE);
                            if (z15) {
                                h0Var.a0(true);
                                bVar.E();
                                nc2.h.f90406b = true;
                            } else {
                                h0Var.a0(e1Var.z0());
                                bVar.F();
                                nc2.h.f90406b = false;
                            }
                            j1 j1Var = e1Var.G;
                            if (j1Var != null) {
                                h32.f1 f1Var = z15 ? h32.f1.STORY_PIN_MUTE : h32.f1.STORY_PIN_UNMUTE;
                                h32.u0 u0Var = h32.u0.PIN_STORY_PIN_MUTE_BUTTON;
                                HashMap hashMap = new HashMap();
                                hashMap.put("is_music_attribution_visible", String.valueOf(e1Var.f112561t.getVisibility() == 0));
                                hashMap.put("is_promoted", String.valueOf(e1Var.O));
                                Unit unit = Unit.f80348a;
                                j1.L0(j1Var, f1Var, u0Var, hashMap, 8);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            mf1.a aVar = this$0.f112579d;
                            mf1.a aVar2 = mf1.a.PIN_CLOSEUP;
                            i0 i0Var = this$0.f112582g;
                            if (aVar == aVar2) {
                                e1 e1Var2 = (e1) i0Var;
                                m60.w eventManager = e1Var2.getEventManager();
                                NavigationImpl w13 = Navigation.w1((ScreenLocation) f2.f50783a.getValue());
                                j1 j1Var2 = e1Var2.G;
                                w13.m0("com.pinterest.EXTRA_PIN_ID", j1Var2 != null ? ((rf1.p0) j1Var2).u4() : null);
                                eventManager.d(w13);
                                return;
                            }
                            e1 e1Var3 = (e1) i0Var;
                            e1Var3.getClass();
                            Activity l03 = bs1.c.l0(e1Var3);
                            if (l03 != null) {
                                l03.onBackPressed();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            e1 e1Var4 = (e1) this$0.f112582g;
                            h0 h0Var2 = e1Var4.f112559r;
                            rm1.m mVar = h0Var2.f112593r.w().f96639a;
                            rm1.q qVar = rm1.q.CAPTIONS;
                            fd1.h hVar = new fd1.h(!(mVar == qVar), 12);
                            GestaltIconButton gestaltIconButton4 = h0Var2.f112593r;
                            gestaltIconButton4.t(hVar);
                            boolean z16 = gestaltIconButton4.w().f96639a == qVar;
                            s C2 = e1Var4.F.C(e1Var4.f112558q.f19924d);
                            if (C2 != null && (o13 = C2.o()) != null) {
                                o13.A0(z16);
                            }
                            j1 j1Var3 = e1Var4.G;
                            if (j1Var3 != null) {
                                j1.L0(j1Var3, z16 ? h32.f1.TOGGLE_ON : h32.f1.TOGGLE_OFF, h32.u0.CLOSED_CAPTIONS_BUTTON, null, 12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i16 = 2;
        gestaltIconButton3.u(new gm1.a(this) { // from class: sf1.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f112514b;

            {
                this.f112514b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                PinterestVideoView o13;
                int i162 = i16;
                h0 this$0 = this.f112514b;
                switch (i162) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            e1 e1Var = (e1) this$0.f112582g;
                            int i17 = e1Var.f112558q.f19924d;
                            of1.b bVar = e1Var.F;
                            s1 D = bVar.D(i17);
                            if (D != null && !D.f112739q) {
                                i92.k kVar = e1Var.f112551j;
                                if (kVar != null) {
                                    kVar.k(pq1.f.toast_video_has_no_sound);
                                    return;
                                } else {
                                    Intrinsics.r("toastUtils");
                                    throw null;
                                }
                            }
                            h0 h0Var = e1Var.f112559r;
                            boolean z15 = !(h0Var.f112592q.w().f96639a == rm1.q.MUTE);
                            if (z15) {
                                h0Var.a0(true);
                                bVar.E();
                                nc2.h.f90406b = true;
                            } else {
                                h0Var.a0(e1Var.z0());
                                bVar.F();
                                nc2.h.f90406b = false;
                            }
                            j1 j1Var = e1Var.G;
                            if (j1Var != null) {
                                h32.f1 f1Var = z15 ? h32.f1.STORY_PIN_MUTE : h32.f1.STORY_PIN_UNMUTE;
                                h32.u0 u0Var = h32.u0.PIN_STORY_PIN_MUTE_BUTTON;
                                HashMap hashMap = new HashMap();
                                hashMap.put("is_music_attribution_visible", String.valueOf(e1Var.f112561t.getVisibility() == 0));
                                hashMap.put("is_promoted", String.valueOf(e1Var.O));
                                Unit unit = Unit.f80348a;
                                j1.L0(j1Var, f1Var, u0Var, hashMap, 8);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            mf1.a aVar = this$0.f112579d;
                            mf1.a aVar2 = mf1.a.PIN_CLOSEUP;
                            i0 i0Var = this$0.f112582g;
                            if (aVar == aVar2) {
                                e1 e1Var2 = (e1) i0Var;
                                m60.w eventManager = e1Var2.getEventManager();
                                NavigationImpl w13 = Navigation.w1((ScreenLocation) f2.f50783a.getValue());
                                j1 j1Var2 = e1Var2.G;
                                w13.m0("com.pinterest.EXTRA_PIN_ID", j1Var2 != null ? ((rf1.p0) j1Var2).u4() : null);
                                eventManager.d(w13);
                                return;
                            }
                            e1 e1Var3 = (e1) i0Var;
                            e1Var3.getClass();
                            Activity l03 = bs1.c.l0(e1Var3);
                            if (l03 != null) {
                                l03.onBackPressed();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            e1 e1Var4 = (e1) this$0.f112582g;
                            h0 h0Var2 = e1Var4.f112559r;
                            rm1.m mVar = h0Var2.f112593r.w().f96639a;
                            rm1.q qVar = rm1.q.CAPTIONS;
                            fd1.h hVar = new fd1.h(!(mVar == qVar), 12);
                            GestaltIconButton gestaltIconButton4 = h0Var2.f112593r;
                            gestaltIconButton4.t(hVar);
                            boolean z16 = gestaltIconButton4.w().f96639a == qVar;
                            s C2 = e1Var4.F.C(e1Var4.f112558q.f19924d);
                            if (C2 != null && (o13 = C2.o()) != null) {
                                o13.A0(z16);
                            }
                            j1 j1Var3 = e1Var4.G;
                            if (j1Var3 != null) {
                                j1.L0(j1Var3, z16 ? h32.f1.TOGGLE_ON : h32.f1.TOGGLE_OFF, h32.u0.CLOSED_CAPTIONS_BUTTON, null, 12);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ideaPinScrubber.setOnSeekBarChangeListener(new g0(this));
        ViewGroup viewGroup = this.f112595t;
        Property property = ViewGroup.ALPHA;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.8f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewGroup, ofFloat);
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        this.f112601z = ofPropertyValuesHolder;
        ViewGroup viewGroup2 = this.f112595t;
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat2, "ofFloat(...)");
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(viewGroup2, ofFloat2);
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder2, "ofPropertyValuesHolder(...)");
        this.A = ofPropertyValuesHolder2;
        this.B = new e0();
    }

    public final void L(Long l13) {
        if (this.f112580e || this.f112596u) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            boolean z13 = false;
            byte b13 = 0;
            if (!df.j1.l(context)) {
                postDelayed(new c0(this, b13 == true ? 1 : 0), l13 != null ? l13.longValue() : 0L);
                return;
            }
            long longValue = l13 != null ? l13.longValue() : 0L;
            ObjectAnimator objectAnimator = this.A;
            objectAnimator.setStartDelay(longValue);
            objectAnimator.setDuration(500L);
            objectAnimator.addListener(new androidx.recyclerview.widget.d0(this, z13, 4));
            objectAnimator.start();
        }
    }

    public final boolean T() {
        nc2.h hVar = nc2.h.f90405a;
        return nc2.h.a(((e1) this.f112582g).Z()).f90409a;
    }

    public final void X() {
        k0 k0Var = this.f112597v;
        if (k0Var == null || k0Var.f112642f) {
            return;
        }
        k0Var.f112642f = true;
        ((e1) this.f112582g).o0(k0Var.f112643g, this.f112598w);
        this.f112598w = k0Var.f112643g;
    }

    public final void Z() {
        k0 k0Var = this.f112597v;
        if (k0Var == null || !k0Var.f112642f) {
            return;
        }
        String videoStateId = ((e1) this.f112582g).Z();
        Intrinsics.checkNotNullParameter(videoStateId, "videoStateId");
        if (nc2.h.a(videoStateId).f90409a) {
            return;
        }
        if (!k0Var.f112641e) {
            Handler handler = k0Var.f112638b;
            handler.removeCallbacksAndMessages(null);
            k0Var.f112641e = true;
            handler.post(k0Var.f112639c);
        }
        k0Var.f112642f = false;
    }

    public final void a0(boolean z13) {
        this.f112592q.t(new fd1.h(z13, 13));
    }

    public final void d0(long j13, List pagesDurationPercentage, List pagesDurationMs) {
        Intrinsics.checkNotNullParameter(pagesDurationPercentage, "pagesDurationPercentage");
        Intrinsics.checkNotNullParameter(pagesDurationMs, "pagesDurationMs");
        String a13 = ac2.d.a(j13, ac2.q1.VIDEO_CLOSE_UP, ac2.e1.ROUND);
        GestaltText gestaltText = this.f112591p;
        pk.a0.p(gestaltText, a13);
        gestaltText.addOnLayoutChangeListener(new f0(this, pagesDurationPercentage, pagesDurationMs, j13));
    }

    public final void g0() {
        if (this.f112580e || this.f112596u) {
            this.f112595t.setAlpha(0.8f);
            bs1.c.U1(this.f112595t);
        }
    }

    public final void k0(boolean z13) {
        e1 e1Var = (e1) this.f112582g;
        int size = e1Var.F.f94412j.size();
        for (int i13 = 0; i13 < size; i13++) {
            j1 j1Var = e1Var.G;
            String u43 = j1Var != null ? ((rf1.p0) j1Var).u4() : null;
            if (u43 != null) {
                String uid = u43 + "-" + i13;
                if (i13 == e1Var.f112558q.f19924d) {
                    IdeaPinScrubber ideaPinScrubber = this.f112590o;
                    long d2 = ml2.c.d(ideaPinScrubber.d(i13) * ideaPinScrubber.b(i13));
                    nc2.h hVar = nc2.h.f90405a;
                    nc2.l videoState = new nc2.l(z13, d2, 12);
                    Intrinsics.checkNotNullParameter(uid, "uid");
                    Intrinsics.checkNotNullParameter(videoState, "videoState");
                    nc2.h.f90407c.put(uid, videoState);
                } else {
                    nc2.h hVar2 = nc2.h.f90405a;
                    nc2.l videoState2 = new nc2.l(z13, 0L, 12);
                    Intrinsics.checkNotNullParameter(uid, "uid");
                    Intrinsics.checkNotNullParameter(videoState2, "videoState");
                    nc2.h.f90407c.put(uid, videoState2);
                }
            }
        }
    }

    public final void o0(float f13) {
        this.f112600y = f13;
        if (f13 == 0.0f) {
            return;
        }
        getLocationOnScreen(this.f112599x);
        float min = Math.min(f13 - (r1[1] + getHeight()), 0.0f);
        if (Math.abs(min) > getHeight()) {
            return;
        }
        Guideline guideline = this.f112585j;
        ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.f17657b = Math.abs((int) min);
        guideline.setLayoutParams(layoutParams2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m60.w wVar = this.f112583h;
        if (wVar != null) {
            wVar.h(this.B);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LinkedHashSet linkedHashSet = this.f112594s;
        ArrayList Q = CollectionsKt.Q(CollectionsKt.F0(linkedHashSet));
        ArrayList arrayList = new ArrayList();
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Animator) next).isRunning()) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).cancel();
        }
        linkedHashSet.clear();
        m60.w wVar = this.f112583h;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.B);
        super.onDetachedFromWindow();
    }
}
