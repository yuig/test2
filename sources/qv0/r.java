package qv0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends FrameLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.l f105199a;

    /* renamed from: b, reason: collision with root package name */
    public final WebImageView f105200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105201c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f105202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, com.bumptech.glide.l lVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f105199a = lVar;
        this.f105201c = bs1.c.W(this, aq1.b.idea_pin_sticker_thumbnail_cell_max_size);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        WebImageView webImageView = new WebImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        webImageView.setLayoutParams(layoutParams);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        webImageView.setScaleType(scaleType);
        addView(webImageView);
        this.f105200b = webImageView;
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        imageView.setLayoutParams(layoutParams2);
        imageView.setScaleType(scaleType);
        addView(imageView);
        this.f105202d = imageView;
    }

    public final void a(String thumbnailUrl) {
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        com.bumptech.glide.l lVar = this.f105199a;
        if (lVar == null) {
            b(thumbnailUrl);
            return;
        }
        ImageView imageView = this.f105202d;
        bs1.c.U1(imageView);
        lVar.K(thumbnailUrl).G(imageView);
        WebImageView webImageView = this.f105200b;
        Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
        bs1.c.X0(webImageView);
    }

    public final void b(String thumbnailUrl) {
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        WebImageView webImageView = this.f105200b;
        Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
        bs1.c.U1(webImageView);
        webImageView.V1(thumbnailUrl, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        bs1.c.X0(this.f105202d);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        int i15 = this.f105201c;
        if (size > i15) {
            ViewGroup.LayoutParams layoutParams = this.f105200b.getLayoutParams();
            layoutParams.width = i15;
            layoutParams.height = i15;
            ViewGroup.LayoutParams layoutParams2 = this.f105202d.getLayoutParams();
            layoutParams2.width = i15;
            layoutParams2.height = i15;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }
}
