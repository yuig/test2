package xe1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends ImageSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f134750a;

    /* renamed from: b, reason: collision with root package name */
    public final n f134751b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f134752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BitmapDrawable drawable, int i13, n marginPlacement, boolean z13) {
        super(drawable, "", 2);
        n nVar;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter("", "source");
        Intrinsics.checkNotNullParameter(marginPlacement, "marginPlacement");
        this.f134750a = i13;
        int i14 = o.f134749a[marginPlacement.ordinal()];
        if (i14 == 1) {
            nVar = z13 ? n.END : n.START;
        } else if (i14 == 2) {
            nVar = z13 ? n.START : n.END;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            nVar = n.BOTH;
        }
        this.f134751b = nVar;
    }

    public final Drawable a() {
        Drawable drawable;
        WeakReference weakReference = this.f134752c;
        if (weakReference != null && (drawable = (Drawable) weakReference.get()) != null) {
            return drawable;
        }
        WeakReference weakReference2 = new WeakReference(getDrawable());
        this.f134752c = weakReference2;
        Drawable drawable2 = (Drawable) weakReference2.get();
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable3, "getDrawable(...)");
        return drawable3;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i13, int i14, float f13, int i15, int i16, int i17, Paint paint) {
        int height;
        n nVar;
        n nVar2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Drawable a13 = a();
        canvas.save();
        int i18 = i17 - a13.getBounds().bottom;
        int i19 = ((ImageSpan) this).mVerticalAlignment;
        if (i19 != 1) {
            if (i19 == 2) {
                i18 = a.a.b(i17, i15, 2, i15);
                height = a13.getBounds().height() / 2;
            }
            nVar = n.START;
            nVar2 = this.f134751b;
            if (nVar2 != nVar || nVar2 == n.BOTH) {
                f13 += this.f134750a;
            }
            canvas.translate(f13, i18);
            a13.draw(canvas);
            canvas.restore();
        }
        height = paint.getFontMetricsInt().descent;
        i18 -= height;
        nVar = n.START;
        nVar2 = this.f134751b;
        if (nVar2 != nVar) {
        }
        f13 += this.f134750a;
        canvas.translate(f13, i18);
        a13.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        int i15;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Rect bounds = a().getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        float textSize = paint.getTextSize();
        int i16 = bounds.bottom;
        float height = bounds.height() - textSize;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (height <= 0.0f || getVerticalAlignment() != 2) {
            i15 = 0;
        } else {
            int height2 = bounds.height();
            float f13 = fontMetrics.descent;
            i16 = height2 - ((int) f13);
            i15 = ((int) f13) + ((int) (height / 2));
        }
        if (fontMetricsInt != null) {
            int i17 = -i16;
            fontMetricsInt.ascent = i17;
            fontMetricsInt.descent = i15;
            fontMetricsInt.top = i17;
            fontMetricsInt.bottom = i15;
        }
        n nVar = n.END;
        n nVar2 = this.f134751b;
        return (nVar2 == nVar || nVar2 == n.BOTH) ? bounds.right + this.f134750a : super.getSize(paint, charSequence, i13, i14, fontMetricsInt);
    }
}
