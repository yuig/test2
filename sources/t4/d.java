package t4;

/* loaded from: classes3.dex */
public final class d extends e {

    /* renamed from: d, reason: collision with root package name */
    public final double f116347d;

    /* renamed from: e, reason: collision with root package name */
    public final double f116348e;

    /* renamed from: f, reason: collision with root package name */
    public final double f116349f;

    /* renamed from: g, reason: collision with root package name */
    public final double f116350g;

    public d(String str) {
        this.f116353a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f116347d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i13 = indexOf2 + 1;
        int indexOf3 = str.indexOf(44, i13);
        this.f116348e = Double.parseDouble(str.substring(i13, indexOf3).trim());
        int i14 = indexOf3 + 1;
        int indexOf4 = str.indexOf(44, i14);
        this.f116349f = Double.parseDouble(str.substring(i14, indexOf4).trim());
        int i15 = indexOf4 + 1;
        this.f116350g = Double.parseDouble(str.substring(i15, str.indexOf(41, i15)).trim());
    }

    @Override // t4.e
    public final double a(double d2) {
        if (d2 <= 0.0d) {
            return 0.0d;
        }
        if (d2 >= 1.0d) {
            return 1.0d;
        }
        double d13 = 0.5d;
        double d14 = 0.5d;
        while (d13 > 0.01d) {
            d13 *= 0.5d;
            d14 = d(d14) < d2 ? d14 + d13 : d14 - d13;
        }
        double d15 = d14 - d13;
        double d16 = d(d15);
        double d17 = d14 + d13;
        double d18 = d(d17);
        double e13 = e(d15);
        return (((d2 - d16) * (e(d17) - e13)) / (d18 - d16)) + e13;
    }

    @Override // t4.e
    public final double b(double d2) {
        double d13 = 0.5d;
        double d14 = 0.5d;
        while (d13 > 1.0E-4d) {
            d13 *= 0.5d;
            d14 = d(d14) < d2 ? d14 + d13 : d14 - d13;
        }
        double d15 = d14 - d13;
        double d16 = d14 + d13;
        return (e(d16) - e(d15)) / (d(d16) - d(d15));
    }

    public final double d(double d2) {
        double d13 = 1.0d - d2;
        double d14 = 3.0d * d13;
        double d15 = d13 * d14 * d2;
        double d16 = d14 * d2 * d2;
        return (this.f116349f * d16) + (this.f116347d * d15) + (d2 * d2 * d2);
    }

    public final double e(double d2) {
        double d13 = 1.0d - d2;
        double d14 = 3.0d * d13;
        double d15 = d13 * d14 * d2;
        double d16 = d14 * d2 * d2;
        return (this.f116350g * d16) + (this.f116348e * d15) + (d2 * d2 * d2);
    }
}
