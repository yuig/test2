package uf1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.style.LineBackgroundSpan;
import com.pinterest.api.model.aq0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class b implements LineBackgroundSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f122098a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f122099b;

    /* renamed from: c, reason: collision with root package name */
    public final float f122100c;

    /* renamed from: d, reason: collision with root package name */
    public final float f122101d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f122102e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f122103f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f122104g;

    /* renamed from: h, reason: collision with root package name */
    public float f122105h;

    /* renamed from: i, reason: collision with root package name */
    public float f122106i;

    /* renamed from: j, reason: collision with root package name */
    public float f122107j;

    /* renamed from: k, reason: collision with root package name */
    public float f122108k;

    public b(Context context, int i13, Integer num, float f13, float f14) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f122098a = i13;
        this.f122099b = num;
        this.f122100c = f13;
        this.f122101d = f14;
        this.f122102e = new RectF();
        Paint paint = new Paint();
        paint.setColor(i13);
        paint.setAntiAlias(true);
        this.f122103f = paint;
        this.f122104g = new Path();
        this.f122105h = -1.0f;
        this.f122106i = -1.0f;
        this.f122107j = -1.0f;
        this.f122108k = -1.0f;
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas c13, Paint p13, int i13, int i14, int i15, int i16, int i17, CharSequence text, int i18, int i19, int i23) {
        float measureText;
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(p13, "p");
        Intrinsics.checkNotNullParameter(text, "text");
        int length = StringsKt.i0(text.subSequence(i18, i19).toString()).toString().length();
        float f13 = this.f122100c;
        if (length == 0) {
            measureText = 0.0f;
        } else {
            measureText = (f13 * 2.0f) + p13.measureText(text, i18, i19);
        }
        int type = aq0.CENTER.getType();
        Path path = this.f122104g;
        float f14 = this.f122101d;
        Paint paint = this.f122103f;
        RectF rectF = this.f122102e;
        Integer num = this.f122099b;
        if (num == null || num.intValue() != type) {
            int type2 = aq0.LEFT.getType();
            if (num == null || num.intValue() != type2) {
                int type3 = aq0.RIGHT.getType();
                if (num != null && num.intValue() == type3 && measureText != 0.0f) {
                    float f15 = i14 + f13;
                    rectF.set(f15 - measureText, i15, f15, i17);
                    if (i23 == 0 || this.f122105h == 0.0f) {
                        c13.drawRoundRect(rectF, f14, f14, paint);
                    } else {
                        path.reset();
                        float f16 = measureText - this.f122105h;
                        float min = (Math.min(2.0f * f14, Math.abs(f16)) * (-Math.signum(f16))) / 2;
                        path.moveTo(this.f122106i, this.f122108k - f14);
                        float f17 = this.f122106i;
                        float f18 = this.f122108k - f14;
                        float f19 = rectF.top;
                        path.cubicTo(f17, f18, f17, f19, f17 + min, f19);
                        path.lineTo(rectF.left - min, rectF.top);
                        float f23 = rectF.left;
                        float f24 = rectF.top;
                        path.cubicTo(f23 - min, f24, f23, f24, f23, f24 + f14);
                        path.lineTo(rectF.left, rectF.bottom - f14);
                        float f25 = rectF.left;
                        float f26 = rectF.bottom;
                        path.cubicTo(f25, f26 - f14, f25, f26, f25 + f14, f26);
                        path.lineTo(rectF.right - f14, rectF.bottom);
                        float f27 = rectF.right;
                        float f28 = rectF.bottom;
                        path.cubicTo(f27 - f14, f28, f27, f28, f27, f28 - f14);
                        path.lineTo(rectF.right, rectF.top - f14);
                        float f29 = rectF.right;
                        float f33 = rectF.top;
                        path.cubicTo(f29, f33 - f14, f29, f33, f29 - f14, f33);
                        path.lineTo(this.f122106i + f14, rectF.top);
                        float f34 = this.f122106i;
                        float f35 = rectF.top;
                        float f36 = this.f122108k;
                        path.cubicTo(f34 + f14, f35, f34, f36, f34, f36 - f14);
                        c13.drawPath(path, paint);
                    }
                }
            } else if (measureText != 0.0f) {
                rectF.set(i13 - f13, i15, measureText - f13, i17);
                if (i23 == 0 || this.f122105h == 0.0f) {
                    c13.drawRoundRect(rectF, f14, f14, paint);
                } else {
                    path.reset();
                    float f37 = measureText - this.f122105h;
                    float min2 = (Math.min(2.0f * f14, Math.abs(f37)) * (-Math.signum(f37))) / 2;
                    path.moveTo(this.f122106i, this.f122108k - f14);
                    path.lineTo(rectF.left, rectF.bottom - f14);
                    float f38 = rectF.left;
                    float f39 = rectF.bottom;
                    path.cubicTo(f38, f39 - f14, f38, f39, f38 + f14, f39);
                    path.lineTo(rectF.right - f14, rectF.bottom);
                    float f41 = rectF.right;
                    float f43 = rectF.bottom;
                    path.cubicTo(f41 - f14, f43, f41, f43, f41, f43 - f14);
                    path.lineTo(rectF.right, rectF.top + f14);
                    float f44 = rectF.right;
                    float f45 = rectF.top;
                    path.cubicTo(f44, f45 + f14, f44, f45, f44 + min2, f45);
                    path.lineTo(this.f122107j - min2, rectF.top);
                    float f46 = this.f122107j;
                    float f47 = rectF.top;
                    path.cubicTo(f46 - min2, f47, f46, f47, f46, this.f122108k - f14);
                    float f48 = this.f122107j;
                    float f49 = this.f122108k;
                    path.cubicTo(f48, f49 - f14, f48, f49, f48 - f14, f49);
                    path.lineTo(this.f122106i + f14, this.f122108k);
                    float f53 = this.f122106i;
                    float f54 = this.f122108k;
                    path.cubicTo(f53 + f14, f54, f53, f54, f53, f54 - f14);
                    c13.drawPath(path, paint);
                }
            }
        } else if (measureText != 0.0f) {
            float f55 = i14;
            float f56 = (f55 - measureText) / 2.0f;
            rectF.set(f56, i15, f55 - f56, i17);
            if (i23 == 0 || this.f122105h == 0.0f) {
                c13.drawRoundRect(rectF, f14, f14, paint);
            } else {
                path.reset();
                float f57 = measureText - this.f122105h;
                float min3 = (Math.min(f14 * 2.0f, Math.abs(f57 / 2.0f)) * (-Math.signum(f57))) / 2.0f;
                path.moveTo(this.f122106i, this.f122108k - f14);
                float f58 = this.f122106i;
                float f59 = this.f122108k - f14;
                float f63 = rectF.top;
                path.cubicTo(f58, f59, f58, f63, f58 + min3, f63);
                path.lineTo(rectF.left - min3, rectF.top);
                float f64 = rectF.left;
                float f65 = rectF.top;
                path.cubicTo(f64 - min3, f65, f64, f65, f64, f65 + f14);
                path.lineTo(rectF.left, rectF.bottom - f14);
                float f66 = rectF.left;
                float f67 = rectF.bottom;
                path.cubicTo(f66, f67 - f14, f66, f67, f66 + f14, f67);
                path.lineTo(rectF.right - f14, rectF.bottom);
                float f68 = rectF.right;
                float f69 = rectF.bottom;
                path.cubicTo(f68 - f14, f69, f68, f69, f68, f69 - f14);
                path.lineTo(rectF.right, rectF.top + f14);
                float f73 = rectF.right;
                float f74 = rectF.top;
                path.cubicTo(f73, f74 + f14, f73, f74, f73 + min3, f74);
                path.lineTo(this.f122107j - min3, rectF.top);
                float f75 = this.f122107j;
                float f76 = rectF.top;
                path.cubicTo(f75 - min3, f76, f75, f76, f75, this.f122108k - f14);
                float f77 = this.f122107j;
                float f78 = this.f122108k;
                path.cubicTo(f77, f78 - f14, f77, f78, f77 - f14, f78);
                path.lineTo(this.f122106i + f14, this.f122108k);
                float f79 = this.f122106i;
                float f83 = this.f122108k;
                path.cubicTo(f79 + f14, f83, f79, f83, f79, rectF.top - f14);
                c13.drawPath(path, paint);
            }
        }
        this.f122105h = measureText;
        this.f122106i = rectF.left;
        this.f122107j = rectF.right;
        this.f122108k = rectF.bottom;
        float f84 = rectF.top;
    }
}
