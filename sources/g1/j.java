package g1;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f63276a;

    static {
        long[] jArr = k0.f63281a;
        int g13 = k0.g(0);
        int max = g13 > 0 ? Math.max(7, k0.f(g13)) : 0;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        int i13 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i13] = (jArr[i13] & (~j13)) | j13;
        float[] fArr = new float[max];
        f63276a = new float[0];
    }
}
