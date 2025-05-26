package s3;

/* loaded from: classes.dex */
public interface c0 extends m {
    default int a(q3.s sVar, q3.r rVar, int i13) {
        return f.e(new b0(this, 3), sVar, rVar, i13);
    }

    default int d(q3.s sVar, q3.r rVar, int i13) {
        return f.b(new b0(this, 0), sVar, rVar, i13);
    }

    default int e(q3.s sVar, q3.r rVar, int i13) {
        return f.d(new b0(this, 2), sVar, rVar, i13);
    }

    default int h(q3.s sVar, q3.r rVar, int i13) {
        return f.c(new b0(this, 1), sVar, rVar, i13);
    }

    q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13);
}
