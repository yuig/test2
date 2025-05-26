package qv0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import rq.c2;

/* loaded from: classes5.dex */
public final class s extends FrameLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final r f105203a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, com.bumptech.glide.l animatedGifLoader) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(animatedGifLoader, "animatedGifLoader");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        r rVar = new r(context, animatedGifLoader);
        addView(rVar);
        this.f105203a = rVar;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        gestaltText.i(new c2(gestaltText, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundResource(aq1.c.rounded_rect_gray_transparent_30);
        frameLayout.addView(gestaltText);
        addView(frameLayout);
    }
}
