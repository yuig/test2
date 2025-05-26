package j1;

/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements c0 {
    @Override // j1.c0
    public final float a(float f13) {
        float f14;
        float f15;
        if (f13 < 0.36363637f) {
            return 7.5625f * f13 * f13;
        }
        if (f13 < 0.72727275f) {
            float f16 = f13 - 0.54545456f;
            f14 = 7.5625f * f16 * f16;
            f15 = 0.75f;
        } else if (f13 < 0.90909094f) {
            float f17 = f13 - 0.8181818f;
            f14 = 7.5625f * f17 * f17;
            f15 = 0.9375f;
        } else {
            float f18 = f13 - 0.95454544f;
            f14 = 7.5625f * f18 * f18;
            f15 = 0.984375f;
        }
        return f14 + f15;
    }
}
