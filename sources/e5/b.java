package e5;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f57209a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f57210b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f57211c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f57212d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int a(float f13) {
        if (f13 < 1.0f) {
            return -16777216;
        }
        if (f13 > 99.0f) {
            return -1;
        }
        float f14 = (f13 + 16.0f) / 116.0f;
        float f15 = f13 > 8.0f ? f14 * f14 * f14 : f13 / 903.2963f;
        float f16 = f14 * f14 * f14;
        boolean z13 = f16 > 0.008856452f;
        float f17 = z13 ? f16 : ((f14 * 116.0f) - 16.0f) / 903.2963f;
        if (!z13) {
            f16 = ((f14 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f57211c;
        return f5.c.b(f17 * fArr[0], f15 * fArr[1], f16 * fArr[2]);
    }

    public static float b(int i13) {
        float f13 = i13 / 255.0f;
        return (f13 <= 0.04045f ? f13 / 12.92f : (float) Math.pow((f13 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float c() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
