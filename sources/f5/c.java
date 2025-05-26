package f5;

import a.cb;
import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f61079a = new ThreadLocal();

    public static int a(float[] fArr) {
        int b13;
        int round;
        int i13 = 0;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float abs = (1.0f - Math.abs((f15 * 2.0f) - 1.0f)) * f14;
        float f16 = f15 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f13 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f13) / 60) {
            case 0:
                i13 = cb.b(abs, f16, 255.0f);
                b13 = cb.b(abs2, f16, 255.0f);
                round = Math.round(f16 * 255.0f);
                break;
            case 1:
                i13 = cb.b(abs2, f16, 255.0f);
                b13 = cb.b(abs, f16, 255.0f);
                round = Math.round(f16 * 255.0f);
                break;
            case 2:
                i13 = Math.round(f16 * 255.0f);
                b13 = cb.b(abs, f16, 255.0f);
                round = cb.b(abs2, f16, 255.0f);
                break;
            case 3:
                i13 = Math.round(f16 * 255.0f);
                b13 = cb.b(abs2, f16, 255.0f);
                round = cb.b(abs, f16, 255.0f);
                break;
            case 4:
                i13 = cb.b(abs2, f16, 255.0f);
                b13 = Math.round(f16 * 255.0f);
                round = cb.b(abs, f16, 255.0f);
                break;
            case 5:
            case 6:
                i13 = cb.b(abs, f16, 255.0f);
                b13 = Math.round(f16 * 255.0f);
                round = cb.b(abs2, f16, 255.0f);
                break;
            default:
                round = 0;
                b13 = 0;
                break;
        }
        return Color.rgb(i(i13), i(b13), i(round));
    }

    public static int b(double d2, double d13, double d14) {
        double d15 = (((-0.4986d) * d14) + (((-1.5372d) * d13) + (3.2406d * d2))) / 100.0d;
        double d16 = ((0.0415d * d14) + ((1.8758d * d13) + ((-0.9689d) * d2))) / 100.0d;
        double d17 = ((1.057d * d14) + (((-0.204d) * d13) + (0.0557d * d2))) / 100.0d;
        return Color.rgb(i((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d)), i((int) Math.round((d16 > 0.0031308d ? (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d : d16 * 12.92d) * 255.0d)), i((int) Math.round((d17 > 0.0031308d ? (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d : d17 * 12.92d) * 255.0d)));
    }

    public static int c(int i13, float f13, int i14) {
        float f14 = 1.0f - f13;
        return Color.argb((int) ((Color.alpha(i14) * f13) + (Color.alpha(i13) * f14)), (int) ((Color.red(i14) * f13) + (Color.red(i13) * f14)), (int) ((Color.green(i14) * f13) + (Color.green(i13) * f14)), (int) ((Color.blue(i14) * f13) + (Color.blue(i13) * f14)));
    }

    public static double d(int i13, int i14) {
        if (Color.alpha(i14) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i14));
        }
        if (Color.alpha(i13) < 255) {
            i13 = g(i13, i14);
        }
        double e13 = e(i13) + 0.05d;
        double e14 = e(i14) + 0.05d;
        return Math.max(e13, e14) / Math.min(e13, e14);
    }

    public static double e(int i13) {
        ThreadLocal threadLocal = f61079a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i13);
        int green = Color.green(i13);
        int blue = Color.blue(i13);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = red / 255.0d;
        double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d13 = green / 255.0d;
        double pow2 = d13 < 0.04045d ? d13 / 12.92d : Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
        double d14 = blue / 255.0d;
        double pow3 = d14 < 0.04045d ? d14 / 12.92d : Math.pow((d14 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d15 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d15;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d15 / 100.0d;
    }

    public static void f(int i13, float[] fArr) {
        float f13;
        float abs;
        float red = Color.red(i13) / 255.0f;
        float green = Color.green(i13) / 255.0f;
        float blue = Color.blue(i13) / 255.0f;
        float max = Math.max(red, Math.max(green, blue));
        float min = Math.min(red, Math.min(green, blue));
        float f14 = max - min;
        float f15 = (max + min) / 2.0f;
        if (max == min) {
            f13 = 0.0f;
            abs = 0.0f;
        } else {
            f13 = max == red ? ((green - blue) / f14) % 6.0f : max == green ? ((blue - red) / f14) + 2.0f : ((red - green) / f14) + 4.0f;
            abs = f14 / (1.0f - Math.abs((2.0f * f15) - 1.0f));
        }
        float f16 = (f13 * 60.0f) % 360.0f;
        if (f16 < 0.0f) {
            f16 += 360.0f;
        }
        fArr[0] = f16 < 0.0f ? 0.0f : Math.min(f16, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : Math.min(abs, 1.0f);
        fArr[2] = f15 >= 0.0f ? Math.min(f15, 1.0f) : 0.0f;
    }

    public static int g(int i13, int i14) {
        int alpha = Color.alpha(i14);
        int alpha2 = Color.alpha(i13);
        int i15 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i15, h(Color.red(i13), alpha2, Color.red(i14), alpha, i15), h(Color.green(i13), alpha2, Color.green(i14), alpha, i15), h(Color.blue(i13), alpha2, Color.blue(i14), alpha, i15));
    }

    public static int h(int i13, int i14, int i15, int i16, int i17) {
        if (i17 == 0) {
            return 0;
        }
        return (((255 - i14) * (i15 * i16)) + ((i13 * 255) * i14)) / (i17 * 255);
    }

    public static int i(int i13) {
        if (i13 < 0) {
            return 0;
        }
        return Math.min(i13, 255);
    }

    public static int j(int i13, int i14) {
        if (i14 < 0 || i14 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i13 & 16777215) | (i14 << 24);
    }
}
