package s71;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import m60.r0;
import net.quikkly.android.utils.BitmapUtils;
import rq.t4;

/* loaded from: classes5.dex */
public final class l extends FrameLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f111371x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b f111372a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111373b;

    /* renamed from: c, reason: collision with root package name */
    public final int f111374c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f111375d;

    /* renamed from: e, reason: collision with root package name */
    public final long f111376e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f111377f;

    /* renamed from: g, reason: collision with root package name */
    public final int f111378g;

    /* renamed from: h, reason: collision with root package name */
    public final int f111379h;

    /* renamed from: i, reason: collision with root package name */
    public final rm1.q f111380i;

    /* renamed from: j, reason: collision with root package name */
    public final rm1.i f111381j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f111382k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f111383l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f111384m;

    /* renamed from: n, reason: collision with root package name */
    public final i81.b f111385n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f111386o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f111387p;

    /* renamed from: q, reason: collision with root package name */
    public final int f111388q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f111389r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f111390s;

    /* renamed from: t, reason: collision with root package name */
    public final xk2.v f111391t;

    /* renamed from: u, reason: collision with root package name */
    public final GestaltText f111392u;

    /* renamed from: v, reason: collision with root package name */
    public final xk2.v f111393v;

    /* renamed from: w, reason: collision with root package name */
    public final xk2.v f111394w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.view.View, com.makeramen.RoundedImageView, com.pinterest.ui.imageview.GenericWebImageView, com.pinterest.ui.imageview.WebImageView] */
    /* JADX WARN: Type inference failed for: r24v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object, s71.l] */
    public l(Context context, b bVar, boolean z13, vn1.g gVar, int i13, int i14, boolean z14, long j13, int i15, rm1.q icon, rm1.i iconSize, v vVar, Integer num, boolean z15, boolean z16, boolean z17, boolean z18, i81.b bVar2, boolean z19, Integer num2, int i16) {
        super(context);
        int i17;
        int i18;
        boolean z23;
        i81.b flashLightBackgroundGlowFadeAnimations;
        Integer num3;
        GestaltIcon gestaltIcon;
        int i19;
        Size size;
        b animationDirection = (i16 & 2) != 0 ? b.RIGHT : bVar;
        vn1.g textSize = (i16 & 8) != 0 ? vn1.g.BODY_300 : gVar;
        lm1.b textStyle = te0.i.f117497d;
        Intrinsics.checkNotNullExpressionValue(textStyle, "FONT_BOLD");
        boolean z24 = (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z14;
        long j14 = (i16 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? 3000L : j13;
        boolean z25 = (i16 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0;
        int dimensionPixelOffset = (i16 & 1024) != 0 ? context.getResources().getDimensionPixelOffset(r0.margin_extra_small) : 0;
        if ((i16 & 2048) != 0) {
            i17 = dimensionPixelOffset;
            i18 = context.getResources().getDimensionPixelSize(r0.margin_half);
        } else {
            i17 = dimensionPixelOffset;
            i18 = i15;
        }
        boolean z26 = (i16 & 4096) != 0;
        v vVar2 = (i16 & 32768) != 0 ? null : vVar;
        Integer num4 = (i16 & 65536) != 0 ? null : num;
        boolean z27 = (i16 & 131072) != 0 ? false : z15;
        v vVar3 = vVar2;
        boolean z28 = (i16 & 262144) != 0 ? false : z16;
        boolean z29 = (i16 & 524288) != 0 ? false : z17;
        boolean z33 = (i16 & 1048576) != 0 ? false : z18;
        if ((i16 & 2097152) != 0) {
            z23 = z28;
            flashLightBackgroundGlowFadeAnimations = i81.b.NONE;
        } else {
            z23 = z28;
            flashLightBackgroundGlowFadeAnimations = bVar2;
        }
        boolean z34 = (i16 & 4194304) != 0 ? false : z19;
        Integer num5 = (i16 & 8388608) != 0 ? null : num2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(animationDirection, "animationDirection");
        Intrinsics.checkNotNullParameter(textSize, "textSize");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconSize, "iconSize");
        Intrinsics.checkNotNullParameter(flashLightBackgroundGlowFadeAnimations, "flashLightBackgroundGlowFadeAnimations");
        this.f111372a = animationDirection;
        this.f111373b = z13;
        this.f111374c = i14;
        this.f111375d = z24;
        this.f111376e = j14;
        this.f111377f = z25;
        int i23 = i17;
        this.f111378g = i23;
        this.f111379h = i18;
        this.f111380i = icon;
        this.f111381j = iconSize;
        boolean z35 = z23;
        this.f111382k = z35;
        boolean z36 = z29;
        this.f111383l = z36;
        this.f111384m = z33;
        this.f111385n = flashLightBackgroundGlowFadeAnimations;
        Integer num6 = num5;
        this.f111386o = num6;
        this.f111387p = new AnimatorSet();
        int H1 = (vVar3 == null || (size = vVar3.f111415b) == null) ? bs1.c.H1(this, iconSize.getDimenAttrRes()) : size.getWidth();
        this.f111388q = H1;
        this.f111390s = xk2.m.b(new g(context, this, i13, 0));
        xk2.v b13 = xk2.m.b(new g(context, this, i13, 2));
        this.f111391t = b13;
        boolean z37 = z25;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        addView(gestaltText, -2, -1);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int[] iArr = f.f111356a;
        b bVar3 = animationDirection;
        int i24 = iArr[animationDirection.ordinal()];
        if (i24 == 1) {
            num3 = num6;
            int i25 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            int marginEnd = layoutParams2.getMarginEnd();
            int i26 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            layoutParams2.setMarginStart(i18 + H1);
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i25;
            layoutParams2.setMarginEnd(marginEnd);
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i26;
        } else if (i24 != 2) {
            num3 = num6;
        } else {
            int marginStart = layoutParams2.getMarginStart();
            int i27 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            num3 = num6;
            int i28 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            layoutParams2.setMarginStart(marginStart);
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i27;
            layoutParams2.setMarginEnd(i18 + H1);
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i28;
        }
        layoutParams2.gravity = 16;
        this.f111392u = gestaltText.i(new rx0.f(this, textStyle, textSize, 15));
        this.f111393v = xk2.m.b(new h(this, 0));
        xk2.v b14 = xk2.m.b(new g(context, this, i13, 1));
        this.f111394w = b14;
        if (z35) {
            setLayoutParams(new FrameLayout.LayoutParams(e(), (i13 * 2) + (i23 * 2) + H1));
            setClipChildren(false);
            setClipToPadding(false);
            if (z36) {
                addView((AppCompatImageView) b14.getValue(), 0);
                addView((View) b13.getValue(), 1);
            } else {
                addView(b(), 0);
                addView((View) b13.getValue(), 1);
            }
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            if (z34) {
                int i29 = vc2.b.icon_button_round;
                Object obj = d5.a.f53679a;
                setBackground(context.getDrawable(i29));
            } else if (num3 != null) {
                int intValue = num3.intValue();
                Object obj2 = d5.a.f53679a;
                setBackground(context.getDrawable(intValue));
                getBackground().setAlpha(0);
            } else {
                int i33 = z37 ? vc2.b.rounded_rect_radius_32_opacity_80 : vc2.b.rounded_rect_radius_32_opacity_80_always;
                Object obj3 = d5.a.f53679a;
                setBackground(context.getDrawable(i33));
            }
        }
        if (vVar3 != null) {
            ?? webImageView = new WebImageView(getContext());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.setMargins(bs1.c.W(webImageView, eo1.c.space_200), 0, 0, 0);
            webImageView.setLayoutParams(layoutParams3);
            Size size2 = vVar3.f111415b;
            webImageView.V1(vVar3.f111414a, true, null, size2.getWidth(), size2.getHeight(), null, null, null);
            webImageView.U1(eo1.c.corner_radius);
            webImageView.setRotation(-5.0f);
            gestaltIcon = webImageView;
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GestaltIcon gestaltIcon2 = new GestaltIcon(context2);
            gestaltIcon2.g2(new i(this, 0));
            if (z26) {
                gestaltIcon2.g2(new i(this, 1));
            } else {
                gestaltIcon2.setImageTintList(null);
            }
            if (num4 != null) {
                gestaltIcon2.setImageResource(num4.intValue());
            }
            gestaltIcon2.setPadding(i23, i23, i23, i23);
            gestaltIcon = gestaltIcon2;
        }
        addView(gestaltIcon);
        ViewGroup.LayoutParams layoutParams4 = gestaltIcon.getLayoutParams();
        Intrinsics.g(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
        int i34 = iArr[bVar3.ordinal()];
        if (i34 == 1) {
            i19 = 8388627;
        } else {
            if (i34 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i19 = 8388629;
        }
        layoutParams5.gravity = i19;
        if (z27) {
            setElevation(z34 ? 0.0f : bs1.c.W(this, eo1.c.space_100));
        }
        setAlpha(z13 ? 0.0f : 1.0f);
        setPaddingRelative(i14, i13, i14, i13);
    }

    public static void a(l lVar, a animationAction, long j13, int i13) {
        long j14 = (i13 & 2) != 0 ? 600L : 0L;
        if ((i13 & 4) != 0) {
            j13 = 3000;
        }
        long j15 = j13;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(animationAction, "animationAction");
        AnimatorSet animatorSet = lVar.f111387p;
        if (animatorSet.isRunning()) {
            return;
        }
        int i14 = (lVar.f111374c * 2) + lVar.f111388q;
        GestaltText gestaltText = lVar.f111392u;
        ValueAnimator d2 = lVar.d((lVar.f111379h * 2) + i14 + ((int) gestaltText.getPaint().measureText(gestaltText.getText().toString())), lVar.e(), animationAction, j15, 300L);
        if (lVar.f111373b) {
            AnimatorSet A = kg.a.A(0.0f, 1.0f, j14, lVar);
            A.setStartDelay(j14);
            animatorSet.play(A).before(d2);
        } else {
            animatorSet.play(d2);
        }
        animatorSet.start();
    }

    public static void h(View view, int i13) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, view.getLayoutParams().height);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }

    public final LottieAnimationView b() {
        return (LottieAnimationView) this.f111390s.getValue();
    }

    public final com.airbnb.lottie.v c() {
        return (com.airbnb.lottie.v) this.f111393v.getValue();
    }

    public final ValueAnimator d(final int i13, final int i14, final a aVar, long j13, long j14) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator(2.0f));
        final g0 g0Var = new g0();
        g0Var.f80425a = i13 - i14;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: s71.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                l this$0 = l.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                a animationAction = aVar;
                Intrinsics.checkNotNullParameter(animationAction, "$animationAction");
                g0 widthDifference = g0Var;
                Intrinsics.checkNotNullParameter(widthDifference, "$widthDifference");
                Intrinsics.checkNotNullParameter(animation, "animation");
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup.LayoutParams layoutParams = this$0.getLayoutParams();
                if (this$0.f111386o != null) {
                    this$0.getBackground().setAlpha((int) ((animationAction == a.EXPAND ? floatValue : 1 - floatValue) * 255));
                }
                int i15 = animationAction == a.COLLAPSE ? (int) (i13 - (widthDifference.f80425a * floatValue)) : (int) ((widthDifference.f80425a * floatValue) + i14);
                layoutParams.width = i15;
                if (this$0.f111382k) {
                    boolean z13 = this$0.f111383l;
                    xk2.v vVar = this$0.f111391t;
                    if (z13) {
                        l.h((AppCompatImageView) this$0.f111394w.getValue(), i15);
                        l.h((View) vVar.getValue(), i15);
                    } else {
                        l.h(this$0.b(), i15);
                        l.h((View) vVar.getValue(), i15);
                    }
                }
                this$0.setLayoutParams(layoutParams);
                this$0.requestLayout();
            }
        });
        ofFloat.addListener(new j(aVar, this, i13, i14, j14));
        ofFloat.setStartDelay(j13);
        ofFloat.setDuration(j14);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public final int e() {
        return (this.f111374c * 2) + this.f111388q;
    }

    public final void f() {
        if (this.f111383l) {
            if (c().o()) {
                return;
            }
            c().q();
        } else {
            if (b().f28364d.o()) {
                return;
            }
            b().k2();
        }
    }

    public final void g(String text, boolean z13) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f111392u.i(new t4(text, z13, 28));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.f111382k) {
            if (this.f111383l) {
                c().d();
            } else {
                b().f2();
            }
        }
        this.f111387p.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z13) {
        super.onWindowFocusChanged(z13);
        if (this.f111382k) {
            new Handler(Looper.getMainLooper()).post(new v.s(this, z13));
        }
    }
}
