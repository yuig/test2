package rh1;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends FrameLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f108136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = bs1.c.W(this, db0.a.comment_sticker_picker_sticker_size_with_padding);
        setLayoutParams(new FrameLayout.LayoutParams(W, W));
        int W2 = bs1.c.W(this, db0.a.comment_sticker_picker_sticker_size);
        WebImageView webImageView = new WebImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(W2, W2);
        layoutParams.gravity = 17;
        webImageView.setLayoutParams(layoutParams);
        webImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(webImageView);
        this.f108136a = webImageView;
    }
}
