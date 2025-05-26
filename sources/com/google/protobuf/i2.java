package com.google.protobuf;

/* loaded from: classes.dex */
public abstract class i2 {
    public abstract j2 a(Object obj);

    public abstract void b(Object obj);

    public final boolean c(Object obj, c2 c2Var) {
        r rVar = (r) c2Var;
        int c13 = rVar.c();
        int i13 = c13 >>> 3;
        int i14 = c13 & 7;
        if (i14 == 0) {
            ((j2) obj).f(i13 << 3, Long.valueOf(rVar.y()));
            return true;
        }
        if (i14 == 1) {
            ((j2) obj).f((i13 << 3) | 1, Long.valueOf(rVar.r()));
            return true;
        }
        if (i14 == 2) {
            ((j2) obj).f((i13 << 3) | 2, rVar.j());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            ((j2) obj).f((i13 << 3) | 5, Integer.valueOf(rVar.p()));
            return true;
        }
        j2 j2Var = new j2();
        int i15 = i13 << 3;
        int i16 = i15 | 4;
        while (rVar.b() != Integer.MAX_VALUE && c(j2Var, rVar)) {
        }
        if (i16 != rVar.c()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        j2Var.f33916e = false;
        ((j2) obj).f(i15 | 3, j2Var);
        return true;
    }
}
