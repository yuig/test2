package x62;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends Drawable {

    /* renamed from: g, reason: collision with root package name */
    public static final PorterDuffXfermode f133980g = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);

    /* renamed from: a, reason: collision with root package name */
    public float f133981a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f133982b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f133983c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f133984d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f133985e;

    /* renamed from: f, reason: collision with root package name */
    public final Canvas f133986f;

    public k(Bitmap mask) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.argb(RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY, 0, 0, 0));
        this.f133983c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setXfermode(f133980g);
        this.f133984d = paint2;
        this.f133985e = mask;
        this.f133986f = new Canvas(mask);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawBitmap(this.f133985e, 0.0f, 0.0f, this.f133983c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f133983c.setColorFilter(getColorFilter());
        this.f133984d.setColorFilter(getColorFilter());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f133983c.setColorFilter(colorFilter);
        this.f133984d.setColorFilter(colorFilter);
    }
}
