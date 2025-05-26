package t4;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public float[] f116371a;

    /* renamed from: b, reason: collision with root package name */
    public double[] f116372b;

    /* renamed from: c, reason: collision with root package name */
    public double[] f116373c;

    /* renamed from: d, reason: collision with root package name */
    public int f116374d;

    public final void a(double d2, float f13) {
        int length = this.f116371a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f116372b, d2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f116372b = Arrays.copyOf(this.f116372b, length);
        this.f116371a = Arrays.copyOf(this.f116371a, length);
        this.f116373c = new double[length];
        double[] dArr = this.f116372b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f116372b[binarySearch] = d2;
        this.f116371a[binarySearch] = f13;
    }

    public final double b(double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        } else if (d2 > 1.0d) {
            d2 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f116372b, d2);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i13 = -binarySearch;
        int i14 = i13 - 1;
        float[] fArr = this.f116371a;
        float f13 = fArr[i14];
        int i15 = i13 - 2;
        float f14 = fArr[i15];
        double[] dArr = this.f116372b;
        double d13 = dArr[i14];
        double d14 = dArr[i15];
        double d15 = (f13 - f14) / (d13 - d14);
        return ((((d2 * d2) - (d14 * d14)) * d15) / 2.0d) + ((d2 - d14) * (f14 - (d15 * d14))) + this.f116373c[i15];
    }

    public final double c(double d2, double d13) {
        double abs;
        double b13 = b(d2) + d13;
        switch (this.f116374d) {
            case 1:
                return Math.signum(0.5d - (b13 % 1.0d));
            case 2:
                abs = Math.abs((((b13 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((b13 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((b13 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d13 + b13) * 6.283185307179586d);
            case 6:
                double abs2 = 1.0d - Math.abs(((b13 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                throw null;
            default:
                return Math.sin(6.283185307179586d * b13);
        }
        return 1.0d - abs;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f116372b) + " period=" + Arrays.toString(this.f116371a);
    }
}
