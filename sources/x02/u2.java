package x02;

/* loaded from: classes4.dex */
public final class u2 extends uq0.h {
    @Override // uq0.h
    public final t1 b(String[] strArr, int i13) {
        if (i13 == 2) {
            uq0.h.d(strArr);
            return new q2(strArr[0]);
        }
        if (i13 != 3) {
            uq0.h.d(strArr);
            return new s2(strArr[0]);
        }
        uq0.h.d(strArr);
        return new r2(strArr[0]);
    }

    @Override // uq0.h
    public final t1 c(int i13, String str) {
        return i13 != 2 ? i13 != 3 ? new s2(str, 0) : new r2(str, 0) : new q2(str, 0);
    }
}
