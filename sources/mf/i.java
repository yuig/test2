package mf;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.login.f0;
import com.facebook.login.g0;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import oq.m;

/* loaded from: classes3.dex */
public final class i extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f87075f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final View f87076a;

    /* renamed from: b, reason: collision with root package name */
    public final View f87077b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f87078c;

    /* renamed from: d, reason: collision with root package name */
    public final View f87079d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f87080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e02.c.board_create_edu_view, this);
        View findViewById = findViewById(e02.b.board_create_edu_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f87076a = (ViewGroup) findViewById;
        View findViewById2 = findViewById(e02.b.edu_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f87077b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(e02.b.pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f87078c = (WebImageView) findViewById3;
        View findViewById4 = findViewById(e02.b.board_rep_frame);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f87079d = (RoundedCornersLayout) findViewById4;
        View findViewById5 = findViewById(e02.b.board_rep_secondary_pins);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f87080e = (LinearLayout) findViewById5;
        ((RoundedCornersLayout) this.f87079d).setScaleX(2.0f);
        ((RoundedCornersLayout) this.f87079d).setScaleY(2.0f);
        ((ViewGroup) this.f87076a).setOnClickListener(new m(5));
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 16));
        } else {
            a(this);
        }
    }

    public static final void a(i iVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RoundedCornersLayout) iVar.f87079d, "scaleX", 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RoundedCornersLayout) iVar.f87079d, "scaleY", 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((RoundedCornersLayout) iVar.f87079d, "alpha", 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((GestaltText) iVar.f87077b, "alpha", 1.0f);
        ofFloat4.setStartDelay(200L);
        ofFloat4.setDuration(220L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        int height = ((RoundedCornersLayout) iVar.f87079d).getHeight();
        int width = ((RoundedCornersLayout) iVar.f87079d).getWidth();
        int height2 = ((GestaltText) iVar.f87077b).getHeight();
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(height, width);
        ofFloat5.addUpdateListener(new pe1.k(iVar, height, height2, 2));
        ValueAnimator ofInt = ValueAnimator.ofInt(width, height);
        ofInt.addUpdateListener(new androidx.media3.ui.c(iVar, 13));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat((WebImageView) iVar.f87078c, "translationX", -((height - width) / 2));
        float T = bs1.c.T(eo1.c.lego_spacing_horizontal_xsmall);
        LinearLayout linearLayout = (LinearLayout) iVar.f87080e;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(linearLayout, "translationX", ((height - linearLayout.getWidth()) / 2) + T);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(linearLayout, "alpha", 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(BaseRecyclerCellView.CAROUSEL_ANIMATION_DELAY);
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet2.playTogether(ofFloat5, ofInt, ofFloat6, ofFloat8, ofFloat7);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat((ViewGroup) iVar.f87076a, "alpha", 0.0f);
        ofFloat9.setDuration(250L);
        ofFloat9.setStartDelay(BaseRecyclerCellView.CAROUSEL_ANIMATION_DELAY);
        Intrinsics.checkNotNullExpressionValue(ofFloat9, "apply(...)");
        animatorSet.addListener(new androidx.appcompat.widget.d(animatorSet2, 17));
        animatorSet2.addListener(new androidx.appcompat.widget.d(ofFloat9, 18));
        ofFloat9.addListener(new androidx.appcompat.widget.d(iVar, 19));
        animatorSet.start();
    }

    public final void b(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (j1.d1(imageUrl)) {
            ((WebImageView) this.f87078c).loadUrl(imageUrl);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Context context) {
        super(context);
        this.f87080e = kVar;
        LayoutInflater.from(getContext()).inflate(g0.com_facebook_tooltip_bubble, this);
        this.f87076a = (ImageView) findViewById(f0.com_facebook_tooltip_bubble_view_top_pointer);
        this.f87077b = (ImageView) findViewById(f0.com_facebook_tooltip_bubble_view_bottom_pointer);
        this.f87079d = findViewById(f0.com_facebook_body_frame);
        this.f87078c = (ImageView) findViewById(f0.com_facebook_button_xout);
    }
}
