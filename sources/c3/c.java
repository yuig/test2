package c3;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f25483a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f25484b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f25485c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f25486d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25487e = 0;

    static {
        long j13 = 3;
        long j14 = j13 << 32;
        f25483a = (0 & 4294967295L) | j14;
        f25484b = (1 & 4294967295L) | j14;
        f25485c = j14 | (2 & 4294967295L);
        f25486d = (j13 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j13, long j14) {
        return j13 == j14;
    }

    public static String b(long j13) {
        return a(j13, f25483a) ? "Rgb" : a(j13, f25484b) ? "Xyz" : a(j13, f25485c) ? "Lab" : a(j13, f25486d) ? "Cmyk" : "Unknown";
    }
}
