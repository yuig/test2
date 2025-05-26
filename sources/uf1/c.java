package uf1;

import android.content.Context;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends WebImageView {
    public static final /* synthetic */ int K = 0;

    /* renamed from: J, reason: collision with root package name */
    public final RectF f122109J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, float f13, Integer num) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        float intValue = num.intValue();
        this.f122109J = new RectF(0.0f, 0.0f, intValue, intValue / f13);
    }
}
