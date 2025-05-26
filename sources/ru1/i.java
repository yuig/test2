package ru1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import df.j1;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import nx.r0;
import pk.a0;
import x02.x2;
import yq1.u1;
import zq1.c0;

/* loaded from: classes2.dex */
public abstract class i extends jc0.h implements y {

    /* renamed from: x, reason: collision with root package name */
    public static final AccelerateDecelerateInterpolator f110045x = new AccelerateDecelerateInterpolator();

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f110046y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f110047z = new DecelerateInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public final r70.i f110048d;

    /* renamed from: e, reason: collision with root package name */
    public x2 f110049e;

    /* renamed from: f, reason: collision with root package name */
    public b60.b f110050f;

    /* renamed from: g, reason: collision with root package name */
    public b20.c f110051g;

    /* renamed from: h, reason: collision with root package name */
    public a f110052h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltIndicator f110053i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltIndicator f110054j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f110055k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f110056l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f110057m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltIcon f110058n;

    /* renamed from: o, reason: collision with root package name */
    public final ImageView f110059o;

    /* renamed from: p, reason: collision with root package name */
    public final View f110060p;

    /* renamed from: q, reason: collision with root package name */
    public final View f110061q;

    /* renamed from: r, reason: collision with root package name */
    public final View f110062r;

    /* renamed from: s, reason: collision with root package name */
    public final View f110063s;

    /* renamed from: t, reason: collision with root package name */
    public final GestaltAvatar f110064t;

    /* renamed from: u, reason: collision with root package name */
    public final xj2.b f110065u;

    /* renamed from: v, reason: collision with root package name */
    public final xk2.k f110066v;

    /* renamed from: w, reason: collision with root package name */
    public final xk2.v f110067w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, r70.i bottomNavTabModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bottomNavTabModel, "bottomNavTabModel");
        this.f110048d = bottomNavTabModel;
        this.f110065u = new xj2.b();
        this.f110066v = xk2.m.a(xk2.n.NONE, new r0(this, 29));
        this.f110067w = xk2.m.b(new l5.a(context, 5));
        View.inflate(context, v0.bottom_navigation_item, this);
        b20.c cVar = this.f110051g;
        if (cVar == null) {
            Intrinsics.r("bottomNavBarDisplayStateProvider");
            throw null;
        }
        this.f110052h = cVar.v(isInEditMode(), j1.E1(), k());
        View findViewById = findViewById(t0.tab_icon_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f110056l = (FrameLayout) findViewById;
        View findViewById2 = findViewById(t0.tab_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f110059o = (ImageView) findViewById2;
        View findViewById3 = findViewById(t0.tab_icon_vr);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f110058n = (GestaltIcon) findViewById3;
        View findViewById4 = findViewById(t0.tab_avatar_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f110060p = findViewById4;
        View findViewById5 = findViewById(t0.tab_avatar_background);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f110061q = findViewById5;
        View findViewById6 = findViewById(t0.tab_avatar_background_vr);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f110062r = findViewById6;
        View findViewById7 = findViewById(t0.tab_avatar_cut_off_vr);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f110063s = findViewById7;
        View findViewById8 = findViewById(t0.tab_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f110064t = (GestaltAvatar) findViewById8;
        View findViewById9 = findViewById(t0.empty_badge);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f110054j = (GestaltIndicator) findViewById9;
        View findViewById10 = findViewById(t0.empty_badge_vr);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f110053i = (GestaltIndicator) findViewById10;
        View findViewById11 = findViewById(t0.tab_content);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f110057m = (LinearLayout) findViewById11;
        View findViewById12 = findViewById(t0.tab_label);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById12;
        this.f110055k = gestaltText;
        u70.a aVar = bottomNavTabModel.f106380a;
        u70.a aVar2 = u70.a.PROFILE;
        if (aVar == aVar2) {
            b60.b bVar = this.f110050f;
            if (bVar == null) {
                Intrinsics.r("activeUserManager");
                throw null;
            }
            wy0 f13 = ((b60.d) bVar).f();
            if (f13 == null || dl2.b.o1(f13)) {
                j();
            } else {
                i();
            }
        } else {
            j();
        }
        a0.o(gestaltText, bottomNavTabModel.f106386g, new Object[0]);
        if (k()) {
            gestaltText.i(new h(this, 2));
            ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (bottomNavTabModel.f106380a == aVar2 && findViewById4.getVisibility() == 0) ? bs1.c.Z(this, eo1.c.sema_space_negative_50) : bs1.c.Z(this, eo1.c.space_0);
            gestaltText.setLayoutParams(marginLayoutParams);
        }
        setContentDescription(context.getResources().getText(bottomNavTabModel.f106389j));
        if (((Boolean) bottomNavTabModel.f106387h.invoke()).booleanValue()) {
            l();
        }
    }

    public final void d(boolean z13) {
        boolean E1 = j1.E1();
        ImageView imageView = this.f110059o;
        if (E1 && !k()) {
            imageView.clearColorFilter();
        }
        if (k()) {
            dl2.b.z(this.f110058n, new e(z13, this, 1));
        } else {
            Context context = getContext();
            r70.i iVar = this.f110048d;
            int a13 = z13 ? iVar.a() : iVar.b();
            Object obj = d5.a.f53679a;
            imageView.setImageDrawable(context.getDrawable(a13));
        }
        this.f110055k.i(new e(z13, this, 2));
    }

    public final void e(boolean z13) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltAvatar gestaltAvatar = this.f110064t;
        int F0 = dl2.b.F0(context, gestaltAvatar.O2().f108650d.getValue());
        boolean k13 = k();
        GestaltText gestaltText = this.f110055k;
        if (k13) {
            if (gestaltText.l().f108855m == fm1.c.VISIBLE) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                F0 = dl2.b.F0(context2, rm1.i.MD.getDimenAttrRes());
            }
            View view = this.f110062r;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = F0;
            layoutParams.height = F0;
            view.setLayoutParams(layoutParams);
            bs1.c.R1(view, z13);
        } else {
            gestaltAvatar.H2(new mm1.i(z13, 19));
            View view2 = this.f110061q;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int intValue = ((Number) this.f110066v.getValue()).intValue() + F0;
            layoutParams2.width = intValue;
            layoutParams2.height = intValue;
            view2.setLayoutParams(layoutParams2);
            bs1.c.R1(view2, z13);
        }
        if (gestaltText.l().f108855m != fm1.c.VISIBLE || k()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = gestaltText.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams.topMargin = z13 ? 0 : bs1.c.Z(this, eo1.c.bottom_nav_label_margin_top);
        gestaltText.setLayoutParams(marginLayoutParams);
        LinearLayout linearLayout = this.f110057m;
        ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams2.topMargin = z13 ? bs1.c.Z(this, eo1.c.bottom_nav_avatar_tab_with_label_offset) : 0;
        linearLayout.setLayoutParams(marginLayoutParams2);
    }

    public final GestaltIndicator f() {
        GestaltIndicator gestaltIndicator = k() ? this.f110053i : this.f110054j;
        j1.r(gestaltIndicator, f.f110033j);
        return gestaltIndicator;
    }

    public final ScreenDescription g() {
        ScreenModel b13 = ((Navigation) this.f110048d.f106385f.invoke()).b1();
        Intrinsics.checkNotNullExpressionValue(b13, "toScreenDescription(...)");
        return b13;
    }

    public final View h() {
        return this.f110063s;
    }

    public final void i() {
        GestaltAvatar gestaltAvatar = this.f110064t;
        gestaltAvatar.setClickable(false);
        b60.b bVar = this.f110050f;
        if (bVar == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 f13 = ((b60.d) bVar).f();
        if (f13 != null) {
            m0.V0(gestaltAvatar, f13);
        }
        bs1.c.X0(this.f110056l);
        bs1.c.X0(this.f110061q);
        bs1.c.U1(this.f110060p);
        x2 x2Var = this.f110049e;
        if (x2Var == null) {
            Intrinsics.r("userRepository");
            throw null;
        }
        b60.b bVar2 = this.f110050f;
        if (bVar2 == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        String id3 = com.bumptech.glide.d.Q(bVar2).getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f110065u.a(x2Var.C(id3).F(new c0(29, new u1(this, 16)), new d(0, g.f110037j), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final void j() {
        boolean k13 = k();
        GestaltIcon gestaltIcon = this.f110058n;
        ImageView imageView = this.f110059o;
        if (k13) {
            dl2.b.z(gestaltIcon, new h(this, 1));
            bs1.c.X0(imageView);
        } else {
            Context context = getContext();
            int b13 = this.f110048d.b();
            Object obj = d5.a.f53679a;
            imageView.setImageDrawable(context.getDrawable(b13));
            bs1.c.U1(imageView);
            gestaltIcon.g2(g.f110038k);
        }
        bs1.c.X0(this.f110060p);
    }

    public final boolean k() {
        return ((Boolean) this.f110067w.getValue()).booleanValue();
    }

    public final void l() {
        m(null);
    }

    public final void m(f5.g gVar) {
        if (gVar == null || !gVar.f61087b) {
            j1.r(f(), g.f110039l);
            return;
        }
        f().setAlpha(0.0f);
        j1.r(f(), g.f110040m);
        if (k()) {
            return;
        }
        GestaltIndicator f13 = f();
        int i13 = gVar.f61086a * 2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f13, (Property<GestaltIndicator, Float>) FrameLayout.ALPHA, 1.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(f110045x);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(i13);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1000L);
        animatorSet.setInterpolator(f110046y);
        Property property = FrameLayout.SCALE_X;
        ImageView imageView = this.f110059o;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 1.2f);
        Property property2 = FrameLayout.SCALE_Y;
        animatorSet.playTogether(ofFloat2, ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.2f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(500L);
        animatorSet2.setInterpolator(f110047z);
        animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(ofFloat, animatorSet3);
        animatorSet4.start();
    }

    @Override // android.view.View
    public final void setSelected(boolean z13) {
        super.setSelected(z13);
        d(z13);
        if (z13) {
            f().i(f.f110034k);
            this.f110048d.f106388i.invoke();
        }
        if (bs1.c.o1(this.f110060p)) {
            e(z13);
        }
    }
}
