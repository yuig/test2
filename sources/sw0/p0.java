package sw0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.feature.mediagallery.view.MediaThumbnailView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.functions.Function0;
import m60.s0;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115538i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MediaThumbnailView f115539j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f115540k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Context context, MediaThumbnailView mediaThumbnailView, int i13) {
        super(0);
        this.f115538i = i13;
        this.f115540k = context;
        this.f115539j = mediaThumbnailView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f115538i;
        Context context = this.f115540k;
        MediaThumbnailView mediaThumbnailView = this.f115539j;
        switch (i13) {
            case 0:
                WebImageView webImageView = new WebImageView(context);
                webImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                int i14 = eo1.b.color_themed_background_dark_opacity_200;
                Object obj = d5.a.f53679a;
                webImageView.setForeground(new ColorDrawable(context.getColor(i14)));
                webImageView.f52564p = new oq.i(mediaThumbnailView, 7);
                return webImageView;
            case 1:
                mediaThumbnailView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                gestaltText.i(b.f115412r);
                dl2.b.y2(gestaltText);
                return gestaltText;
            case 2:
                FrameLayout frameLayout = new FrameLayout(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                int dimensionPixelSize = frameLayout.getResources().getDimensionPixelSize(m60.r0.margin_half);
                layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                frameLayout.setLayoutParams(layoutParams);
                int i15 = s0.media_gallery_video_duration_background;
                Object obj2 = d5.a.f53679a;
                frameLayout.setBackground(context.getDrawable(i15));
                int i16 = MediaThumbnailView.f46740s;
                frameLayout.addView((GestaltText) mediaThumbnailView.f46754n.getValue());
                return frameLayout;
            default:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(8388629);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 80;
                linearLayout.setLayoutParams(layoutParams2);
                linearLayout.addView((FrameLayout) mediaThumbnailView.f46751k.getValue());
                return linearLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(MediaThumbnailView mediaThumbnailView, Context context) {
        super(0);
        this.f115538i = 1;
        this.f115539j = mediaThumbnailView;
        this.f115540k = context;
    }
}
