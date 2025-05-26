package m1;

/* loaded from: classes2.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f85321a = d.f85309a;

    default float a(float f13, float f14, float f15) {
        f85321a.getClass();
        float f16 = f14 + f13;
        if ((f13 >= 0.0f && f16 <= f15) || (f13 < 0.0f && f16 > f15)) {
            return 0.0f;
        }
        float f17 = f16 - f15;
        return Math.abs(f13) < Math.abs(f17) ? f13 : f17;
    }

    default j1.n b() {
        f85321a.getClass();
        return d.f85310b;
    }
}
