package u81;

import android.content.Context;
import android.widget.ImageView;
import com.pinterest.ui.imageview.ProportionalImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends ProportionalImageView implements m81.l {
    public static final /* synthetic */ int M = 0;
    public m81.m K;
    public final int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.L = getResources().getDimensionPixelSize(dt1.a.grid_column_width);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setOnClickListener(new x61.e(this, 16));
    }

    @Override // com.pinterest.ui.imageview.GenericWebImageView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.K = null;
        w1();
        super.onDetachedFromWindow();
    }
}
