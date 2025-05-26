package g5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f63537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63538b;

    /* renamed from: e, reason: collision with root package name */
    public final BitmapShader f63541e;

    /* renamed from: g, reason: collision with root package name */
    public float f63543g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f63547k;

    /* renamed from: l, reason: collision with root package name */
    public final int f63548l;

    /* renamed from: m, reason: collision with root package name */
    public final int f63549m;

    /* renamed from: c, reason: collision with root package name */
    public final int f63539c = RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f63540d = new Paint(3);

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f63542f = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    public final Rect f63544h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    public final RectF f63545i = new RectF();

    /* renamed from: j, reason: collision with root package name */
    public boolean f63546j = true;

    public b(Resources resources, Bitmap bitmap) {
        this.f63538b = 160;
        if (resources != null) {
            this.f63538b = resources.getDisplayMetrics().densityDpi;
        }
        this.f63537a = bitmap;
        if (bitmap == null) {
            this.f63549m = -1;
            this.f63548l = -1;
            this.f63541e = null;
        } else {
            int i13 = this.f63538b;
            this.f63548l = bitmap.getScaledWidth(i13);
            this.f63549m = bitmap.getScaledHeight(i13);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f63541e = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void a() {
        if (this.f63546j) {
            boolean z13 = this.f63547k;
            Rect rect = this.f63544h;
            if (z13) {
                int min = Math.min(this.f63548l, this.f63549m);
                Gravity.apply(this.f63539c, min, min, getBounds(), this.f63544h, 0);
                int min2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - min2) / 2), Math.max(0, (rect.height() - min2) / 2));
                this.f63543g = min2 * 0.5f;
            } else {
                Gravity.apply(this.f63539c, this.f63548l, this.f63549m, getBounds(), this.f63544h, 0);
            }
            RectF rectF = this.f63545i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f63541e;
            if (bitmapShader != null) {
                Matrix matrix = this.f63542f;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                Bitmap bitmap = this.f63537a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f63540d.setShader(bitmapShader);
            }
            this.f63546j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f63537a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.f63540d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f63544h, paint);
            return;
        }
        RectF rectF = this.f63545i;
        float f13 = this.f63543g;
        canvas.drawRoundRect(rectF, f13, f13, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f63540d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f63540d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f63549m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f63548l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.f63539c != 119 || this.f63547k || (bitmap = this.f63537a) == null || bitmap.hasAlpha() || this.f63540d.getAlpha() < 255 || this.f63543g > 0.05f) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f63547k) {
            this.f63543g = Math.min(this.f63549m, this.f63548l) / 2;
        }
        this.f63546j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        Paint paint = this.f63540d;
        if (i13 != paint.getAlpha()) {
            paint.setAlpha(i13);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f63540d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z13) {
        this.f63540d.setDither(z13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z13) {
        this.f63540d.setFilterBitmap(z13);
        invalidateSelf();
    }
}
