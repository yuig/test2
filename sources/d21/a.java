package d21;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import cz1.b;
import kh2.w;
import kotlin.jvm.internal.Intrinsics;
import ol2.f;
import v32.c;

/* loaded from: classes.dex */
public final class a {
    public static void a(c reactionType, RelativeLayout animationOverlay, Context context) {
        Intrinsics.checkNotNullParameter(reactionType, "reactionType");
        Intrinsics.checkNotNullParameter(animationOverlay, "animationOverlay");
        Intrinsics.checkNotNullParameter(context, "context");
        if (animationOverlay.getWidth() <= 0) {
            return;
        }
        Drawable G = w.G(context, reactionType, null);
        if (G == null) {
            int i13 = b.ic_reaction_love_nonpds;
            Object obj = d5.a.f53679a;
            G = context.getDrawable(i13);
        }
        int i14 = (int) (RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL * context.getResources().getDisplayMetrics().density);
        int i15 = (int) (60 * context.getResources().getDisplayMetrics().density);
        int i16 = 1;
        while (i16 < 25) {
            f.f96454a.getClass();
            ol2.a aVar = f.f96455b;
            int f13 = aVar.f(i15, i14);
            int i17 = aVar.i(animationOverlay.getWidth());
            int i18 = i14;
            float f14 = (1300 - r11) * context.getResources().getDisplayMetrics().density * 2.0f;
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(G);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, f13);
            layoutParams.addRule(12);
            com.bumptech.glide.c.b1(layoutParams, i17 - (f13 / 2), 0, 0, -f13, 6);
            animationOverlay.addView(imageView, layoutParams);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -f14);
            translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            translateAnimation.setStartOffset(((i16 - 1) * 750) / 24);
            translateAnimation.setDuration(1300L);
            imageView.startAnimation(translateAnimation);
            i16++;
            i14 = i18;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(animationOverlay, (Property<RelativeLayout, Float>) property, 1.0f, 0.8f);
        ofFloat.setDuration(1040L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.play(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(animationOverlay, (Property<RelativeLayout, Float>) property, 0.8f, 0.0f);
        ofFloat2.setDuration(260L);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet2.play(ofFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
        animatorSet3.addListener(new ir.b(animationOverlay, 4));
    }
}
