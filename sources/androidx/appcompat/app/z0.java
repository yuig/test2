package androidx.appcompat.app;

/* loaded from: classes2.dex */
public final class z0 {

    /* renamed from: d, reason: collision with root package name */
    public static z0 f16161d;

    /* renamed from: a, reason: collision with root package name */
    public int f16162a;

    /* renamed from: b, reason: collision with root package name */
    public long f16163b;

    /* renamed from: c, reason: collision with root package name */
    public long f16164c;

    public final void a(double d2, double d13, long j13) {
        double d14 = (0.01720197f * ((j13 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d14) * 0.03341960161924362d) + d14 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d14) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d13) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d15 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d15))) / (Math.cos(asin) * Math.cos(d15));
        if (sin3 >= 1.0d) {
            this.f16162a = 1;
            this.f16163b = -1L;
            this.f16164c = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f16162a = 0;
                this.f16163b = -1L;
                this.f16164c = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f16163b = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f16164c = round;
            if (round >= j13 || this.f16163b <= j13) {
                this.f16162a = 1;
            } else {
                this.f16162a = 0;
            }
        }
    }
}
