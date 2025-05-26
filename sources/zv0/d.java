package zv0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class d extends FrameLayout implements n, ar0.d {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f142856l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f142857a;

    /* renamed from: b, reason: collision with root package name */
    public final View f142858b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f142859c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIcon f142860d;

    /* renamed from: e, reason: collision with root package name */
    public final int f142861e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f142862f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f142863g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f142864h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f142865i;

    /* renamed from: j, reason: collision with root package name */
    public final float f142866j;

    /* renamed from: k, reason: collision with root package name */
    public final float f142867k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int W = bs1.c.W(this, aq1.b.idea_pin_video_clip_cell_size);
        this.f142861e = W;
        int W2 = bs1.c.W(this, aq1.b.idea_pin_video_clip_cell_size);
        this.f142862f = new Path();
        this.f142863g = new Path();
        this.f142864h = new RectF();
        Paint paint = new Paint();
        paint.setColor(dl2.b.y0(this, eo1.a.base_color_grayscale_0));
        this.f142865i = paint;
        this.f142866j = getResources().getDimensionPixelSize(aq1.b.idea_pin_video_clip_cell_border);
        this.f142867k = getResources().getDimensionPixelSize(aq1.b.idea_pin_video_clip_cell_border_inner_radius);
        View.inflate(context, aq1.f.idea_pin_video_clip_cell, this);
        setLayoutParams(new FrameLayout.LayoutParams(W, W2));
        int i13 = dq1.b.thumbnail_shape;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i13));
        setClipToOutline(true);
        View findViewById = findViewById(aq1.d.thumbnail_image);
        WebImageView webImageView = (WebImageView) findViewById;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f142857a = webImageView;
        View findViewById2 = findViewById(aq1.d.dark_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f142858b = findViewById2;
        View findViewById3 = findViewById(aq1.d.duration_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f142859c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(aq1.d.warning_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f142860d = (GestaltIcon) findViewById4;
    }

    public final void a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<d, Float>) View.SCALE_X, 1.2f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<d, Float>) View.SCALE_Y, 1.2f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    public final void b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<d, Float>) View.SCALE_X, 1.0f, 1.2f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<d, Float>) View.SCALE_Y, 1.0f, 1.2f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.clipPath(this.f142862f);
        super.dispatchDraw(canvas);
        if (isSelected()) {
            canvas.drawPath(this.f142863g, this.f142865i);
        }
    }

    @Override // ar0.d
    /* renamed from: isDragAndDropEnabledForItem */
    public final boolean getF45303h() {
        return true;
    }

    @Override // ar0.d
    public final void onItemDragEnd(int i13) {
        if (isSelected()) {
            return;
        }
        a();
    }

    @Override // ar0.d
    public final void onItemDragStart() {
        b();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        RectF rectF = this.f142864h;
        float f13 = i13;
        float f14 = i14;
        rectF.set(0.0f, 0.0f, f13, f14);
        Path path = this.f142862f;
        path.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addRect(rectF, direction);
        path.close();
        Path path2 = this.f142863g;
        path2.reset();
        path2.addRect(rectF, direction);
        float f15 = this.f142866j;
        RectF rectF2 = new RectF(f15, f15, f13 - f15, f14 - f15);
        float f16 = this.f142867k;
        path2.addRoundRect(rectF2, f16, f16, direction);
        path2.setFillType(Path.FillType.EVEN_ODD);
        path2.close();
    }
}
