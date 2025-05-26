package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class w1 {
    public final boolean a(Object obj, m1 m1Var) {
        int a13 = m1Var.a();
        int i13 = a13 >>> 3;
        int i14 = a13 & 7;
        if (i14 == 0) {
            ((x1) obj).c(i13 << 3, Long.valueOf(m1Var.L()));
            return true;
        }
        if (i14 == 1) {
            ((x1) obj).c((i13 << 3) | 1, Long.valueOf(m1Var.c()));
            return true;
        }
        if (i14 == 2) {
            ((x1) obj).c((i13 << 3) | 2, m1Var.q());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            ((x1) obj).c((i13 << 3) | 5, Integer.valueOf(m1Var.y()));
            return true;
        }
        x1 b13 = x1.b();
        int i15 = i13 << 3;
        int i16 = i15 | 4;
        while (m1Var.E() != Integer.MAX_VALUE && a(b13, m1Var)) {
        }
        if (i16 != m1Var.a()) {
            throw InvalidProtocolBufferException.a();
        }
        b13.f18170e = false;
        ((x1) obj).c(i15 | 3, b13);
        return true;
    }
}
