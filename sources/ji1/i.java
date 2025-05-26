package ji1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.s0;
import m60.x0;
import yk1.n;

/* loaded from: classes5.dex */
public final class i extends FrameLayout implements n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.dynamic_video_story_width);
        TextView textView = new TextView(context);
        j1.p1(textView, eo1.b.color_themed_background_default);
        j1.q1(textView, eo1.c.font_size_500);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = textView.getResources().getDimensionPixelSize(r0.margin);
        textView.setLayoutParams(layoutParams);
        dl2.b.y2(textView);
        dl2.b.A2(textView);
        textView.setGravity(81);
        textView.setText(textView.getResources().getString(x0.pin_hidden));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundResource(s0.bg_feedback);
        Drawable background = frameLayout.getBackground();
        Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(df.j1.K(context));
        setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, -1));
        frameLayout.addView(textView);
        addView(frameLayout);
    }
}
