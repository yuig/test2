package y4;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f136869a = new float[20];

    /* renamed from: b, reason: collision with root package name */
    public final ColorMatrix f136870b = new ColorMatrix();

    /* renamed from: c, reason: collision with root package name */
    public final ColorMatrix f136871c = new ColorMatrix();

    /* renamed from: d, reason: collision with root package name */
    public float f136872d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f136873e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f136874f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f136875g = 1.0f;

    public final void a(ImageView imageView) {
        boolean z13;
        float log;
        float f13;
        float f14;
        float f15;
        ColorMatrix colorMatrix = this.f136870b;
        colorMatrix.reset();
        float f16 = this.f136873e;
        float f17 = 1.0f;
        float[] fArr = this.f136869a;
        if (f16 != 1.0f) {
            float f18 = 1.0f - f16;
            float f19 = 0.2999f * f18;
            float f23 = 0.587f * f18;
            float f24 = f18 * 0.114f;
            fArr[0] = f19 + f16;
            fArr[1] = f23;
            fArr[2] = f24;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f19;
            fArr[6] = f23 + f16;
            fArr[7] = f24;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f19;
            fArr[11] = f23;
            fArr[12] = f24 + f16;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix.set(fArr);
            z13 = true;
        } else {
            z13 = false;
        }
        float f25 = this.f136874f;
        ColorMatrix colorMatrix2 = this.f136871c;
        if (f25 != 1.0f) {
            colorMatrix2.setScale(f25, f25, f25, 1.0f);
            colorMatrix.postConcat(colorMatrix2);
            z13 = true;
        }
        float f26 = this.f136875g;
        if (f26 != 1.0f) {
            if (f26 <= 0.0f) {
                f26 = 0.01f;
            }
            float f27 = (5000.0f / f26) / 100.0f;
            if (f27 > 66.0f) {
                double d2 = f27 - 60.0f;
                f13 = ((float) Math.pow(d2, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d2, 0.07551484555006027d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f27)) * 99.4708f) - 161.11957f;
                f13 = 255.0f;
            }
            if (f27 >= 66.0f) {
                f14 = log;
                f15 = 255.0f;
            } else if (f27 > 19.0f) {
                f14 = log;
                f15 = (((float) Math.log(f27 - 10.0f)) * 138.51773f) - 305.0448f;
            } else {
                f14 = log;
                f15 = 0.0f;
            }
            float min = Math.min(255.0f, Math.max(f13, 0.0f));
            float min2 = Math.min(255.0f, Math.max(f14, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f15, 0.0f));
            float log2 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float log3 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max(log2, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max(log3, 0.0f));
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            f17 = 1.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
            z13 = true;
        }
        float f28 = this.f136872d;
        if (f28 != f17) {
            fArr[0] = f28;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f28;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f28;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
        } else if (!z13) {
            imageView.clearColorFilter();
            return;
        }
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }
}
