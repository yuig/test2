package com.pinterest.feature.storypin.closeup.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.feature.storypin.closeup.view.AdsIdeaPinHorizontalActionBarView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import dl2.b;
import eo1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pq1.d;
import pq1.e;
import sf1.i1;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/storypin/closeup/view/AdsIdeaPinHorizontalActionBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "ideaPinDisplayLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AdsIdeaPinHorizontalActionBarView extends ConstraintLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f48539o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f48540a;

    /* renamed from: b, reason: collision with root package name */
    public final AdsCompositeAvatar f48541b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48542c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f48543d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48544e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f48545f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f48546g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltPreviewTextView f48547h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltButton f48548i;

    /* renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f48549j;

    /* renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f48550k;

    /* renamed from: l, reason: collision with root package name */
    public ValueAnimator f48551l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f48552m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f48553n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsIdeaPinHorizontalActionBarView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.ads_idea_pin_horizontal_action_bar_view, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(d.ads_idea_pin_attribution_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48549j = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(d.ads_sponsored_idea_pin_attribution_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48550k = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(d.ads_idea_pin_attribution_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48540a = (GestaltAvatar) findViewById3;
        View findViewById4 = findViewById(d.ads_sponsored_idea_pin_attribution_composite_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48541b = (AdsCompositeAvatar) findViewById4;
        View findViewById5 = findViewById(d.ads_idea_pin_attribution_creator_name);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48542c = (GestaltText) findViewById5;
        View findViewById6 = findViewById(d.ads_idea_pin_attribution_label);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48543d = (GestaltText) findViewById6;
        View findViewById7 = findViewById(d.ads_sponsored_idea_pin_attribution_promoted_by);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48544e = (GestaltText) findViewById7;
        View findViewById8 = findViewById(d.ads_sponsored_idea_pin_attribution_creator);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById8;
        this.f48545f = gestaltText;
        View findViewById9 = findViewById(d.ads_sponsored_idea_pin_attribution_sponsor);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f48546g = (GestaltText) findViewById9;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!b.T1(context2)) {
            ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            marginLayoutParams.bottomMargin = c.V(context3, eo1.c.space_100);
            gestaltText.setLayoutParams(marginLayoutParams);
        }
        View findViewById10 = findViewById(d.ads_idea_pin_attribution_title);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f48547h = (GestaltPreviewTextView) findViewById10;
        View findViewById11 = findViewById(d.ads_idea_pin_clickthrough_button);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f48548i = (GestaltButton) findViewById11;
        this.f48553n = ((GestaltText) findViewById(d.ads_closeup_music_attribution)).i(sf1.c.f112517j);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [sf1.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [sf1.b] */
    public final void L() {
        ValueAnimator valueAnimator = this.f48551l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f48552m;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i13 = a.color_background_dark_opacity_300;
        Intrinsics.checkNotNullParameter(context, "<this>");
        ColorStateList valueOf = ColorStateList.valueOf(b.x0(context, i13));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        GestaltButton gestaltButton = this.f48548i;
        gestaltButton.setBackgroundTintList(valueOf);
        gestaltButton.setTextColor(b.y0(this, a.base_color_grayscale_0));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        final int i14 = 0;
        ValueAnimator l13 = kg.a.l(context2, b.y0(this, a.color_background_dark_opacity_300), b.y0(this, a.base_color_grayscale_0), new ValueAnimator.AnimatorUpdateListener(this) { // from class: sf1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdsIdeaPinHorizontalActionBarView f112512b;

            {
                this.f112512b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                int i15 = i14;
                AdsIdeaPinHorizontalActionBarView this$0 = this.f112512b;
                switch (i15) {
                    case 0:
                        int i16 = AdsIdeaPinHorizontalActionBarView.f48539o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        GestaltButton gestaltButton2 = this$0.f48548i;
                        Object animatedValue = it.getAnimatedValue();
                        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                        gestaltButton2.setBackgroundTintList(ColorStateList.valueOf(((Integer) animatedValue).intValue()));
                        break;
                    default:
                        int i17 = AdsIdeaPinHorizontalActionBarView.f48539o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        GestaltButton gestaltButton3 = this$0.f48548i;
                        Object animatedValue2 = it.getAnimatedValue();
                        Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        gestaltButton3.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                }
            }
        });
        l13.setStartDelay(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
        this.f48551l = l13;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        final int i15 = 1;
        ValueAnimator l14 = kg.a.l(context3, b.y0(this, a.base_color_grayscale_0), c.B(this, eo1.b.color_black_900), new ValueAnimator.AnimatorUpdateListener(this) { // from class: sf1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdsIdeaPinHorizontalActionBarView f112512b;

            {
                this.f112512b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                int i152 = i15;
                AdsIdeaPinHorizontalActionBarView this$0 = this.f112512b;
                switch (i152) {
                    case 0:
                        int i16 = AdsIdeaPinHorizontalActionBarView.f48539o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        GestaltButton gestaltButton2 = this$0.f48548i;
                        Object animatedValue = it.getAnimatedValue();
                        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                        gestaltButton2.setBackgroundTintList(ColorStateList.valueOf(((Integer) animatedValue).intValue()));
                        break;
                    default:
                        int i17 = AdsIdeaPinHorizontalActionBarView.f48539o;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        GestaltButton gestaltButton3 = this$0.f48548i;
                        Object animatedValue2 = it.getAnimatedValue();
                        Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        gestaltButton3.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                }
            }
        });
        l14.setStartDelay(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
        this.f48552m = l14;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(this.f48551l).with(this.f48552m);
        animatorSet.start();
    }

    public final void T(i1 i1Var, String str, boolean z13) {
        ConstraintLayout constraintLayout = this.f48549j;
        if (!z13) {
            c.b1(constraintLayout);
            return;
        }
        c.b1(this.f48550k);
        c.U1(constraintLayout);
        this.f48540a.H2(new sf1.a(i1Var, 2));
        a0.p(this.f48542c, str);
    }

    public final void X(i1 state, String str, String str2, boolean z13) {
        ConstraintLayout constraintLayout = this.f48550k;
        if (!z13) {
            c.X0(constraintLayout);
            return;
        }
        c.b1(this.f48549j);
        c.U1(constraintLayout);
        AdsCompositeAvatar adsCompositeAvatar = this.f48541b;
        c.U1(adsCompositeAvatar);
        adsCompositeAvatar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        adsCompositeAvatar.f48537a.H2(new sf1.a(state, 0));
        adsCompositeAvatar.f48538b.H2(new sf1.a(state, 1));
        a0.p(this.f48545f, str);
        a0.p(this.f48546g, str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsIdeaPinHorizontalActionBarView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.ads_idea_pin_horizontal_action_bar_view, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(d.ads_idea_pin_attribution_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48549j = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(d.ads_sponsored_idea_pin_attribution_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48550k = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(d.ads_idea_pin_attribution_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48540a = (GestaltAvatar) findViewById3;
        View findViewById4 = findViewById(d.ads_sponsored_idea_pin_attribution_composite_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48541b = (AdsCompositeAvatar) findViewById4;
        View findViewById5 = findViewById(d.ads_idea_pin_attribution_creator_name);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48542c = (GestaltText) findViewById5;
        View findViewById6 = findViewById(d.ads_idea_pin_attribution_label);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48543d = (GestaltText) findViewById6;
        View findViewById7 = findViewById(d.ads_sponsored_idea_pin_attribution_promoted_by);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f48544e = (GestaltText) findViewById7;
        View findViewById8 = findViewById(d.ads_sponsored_idea_pin_attribution_creator);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById8;
        this.f48545f = gestaltText;
        View findViewById9 = findViewById(d.ads_sponsored_idea_pin_attribution_sponsor);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f48546g = (GestaltText) findViewById9;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!b.T1(context2)) {
            ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                marginLayoutParams.bottomMargin = c.V(context3, eo1.c.space_100);
                gestaltText.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        View findViewById10 = findViewById(d.ads_idea_pin_attribution_title);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f48547h = (GestaltPreviewTextView) findViewById10;
        View findViewById11 = findViewById(d.ads_idea_pin_clickthrough_button);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f48548i = (GestaltButton) findViewById11;
        this.f48553n = ((GestaltText) findViewById(d.ads_closeup_music_attribution)).i(sf1.c.f112517j);
    }
}
