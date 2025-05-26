package su0;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.dk;
import com.pinterest.api.model.uk;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kh2.c3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q5.b1;

/* loaded from: classes5.dex */
public final class r extends ConstraintLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f115216f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f115217a;

    /* renamed from: b, reason: collision with root package name */
    public final WebImageView f115218b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f115219c;

    /* renamed from: d, reason: collision with root package name */
    public final AnimatorSet f115220d;

    /* renamed from: e, reason: collision with root package name */
    public pu0.r f115221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f115220d = new AnimatorSet();
        View.inflate(context, aq1.f.view_overlay_transition_selection_item, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(aq1.d.overlay_transition_item_sticker);
        WebImageView webImageView = (WebImageView) findViewById;
        webImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f115217a = webImageView;
        View findViewById2 = findViewById(aq1.d.overlay_transition_item_background);
        WebImageView webImageView2 = (WebImageView) findViewById2;
        Intrinsics.f(webImageView2);
        webImageView2.setColorFilter(dl2.b.y0(webImageView2, eo1.a.color_background_dark_opacity_200));
        webImageView2.U1(eo1.c.lego_corner_radius_medium);
        webImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f115218b = webImageView2;
        View findViewById3 = findViewById(aq1.d.overlay_transition_item_selection_label);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f115219c = (GestaltText) findViewById3;
        setOnClickListener(new com.pinterest.feature.home.view.c(this, 5));
    }

    public final void L(pu0.r rVar) {
        ValueAnimator animation;
        boolean e13 = rVar.e();
        AnimatorSet animatorSet = this.f115220d;
        WebImageView webImageView = this.f115218b;
        if (!e13) {
            webImageView.setForeground(null);
            c3.m0(animatorSet);
            uv0.p.a(this.f115217a, true);
            return;
        }
        webImageView.setForeground(bs1.c.f0(this, aq1.c.story_pin_rounded_rect_border_white, null, null, 6));
        ValueAnimator valueAnimator = rVar.f101418c;
        valueAnimator.setDuration(250L);
        valueAnimator.addUpdateListener(new b1(2, rVar, this));
        boolean z13 = rVar instanceof pu0.p;
        if (z13) {
            animation = uk.FadeOut.animation();
        } else {
            if (!(rVar instanceof pu0.q)) {
                throw new NoWhenBranchMatchedException();
            }
            animation = dk.FadeIn.animation();
        }
        animation.setDuration(250L);
        animation.addUpdateListener(new androidx.media3.ui.c(this, 11));
        if (rVar.f101419d.isEmpty()) {
            animatorSet.play(animation).after(500L);
        } else if (z13) {
            animatorSet.play(animation).after(500L).after(valueAnimator);
        } else if (rVar instanceof pu0.q) {
            animatorSet.play(valueAnimator).after(500L).after(animation);
        }
        animatorSet.addListener(new ir.b(animatorSet, 3));
        animatorSet.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3.m0(this.f115220d);
    }
}
