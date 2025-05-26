package j1;

/* loaded from: classes.dex */
public interface i0 extends n {
    @Override // j1.n
    default r2 a(p2 p2Var) {
        return new w2(this);
    }

    default float b(float f13, float f14, float f15) {
        return d(e(f13, f14, f15), f13, f14, f15);
    }

    float c(long j13, float f13, float f14, float f15);

    float d(long j13, float f13, float f14, float f15);

    long e(float f13, float f14, float f15);
}
